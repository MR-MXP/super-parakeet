package com.plane;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MainJframe extends JFrame implements KeyListener{
	int y;//地图Y轴坐标
	Hero hero;
	HBullet hbullet;
	Boss boss;
	int  score=0;
	boolean su=true;
	//创建敌方飞机集合
	CopyOnWriteArrayList elist=new CopyOnWriteArrayList();//创建敌方飞机集合
	CopyOnWriteArrayList bmlist=new CopyOnWriteArrayList();//创建爆炸集合
	CopyOnWriteArrayList hblist=new CopyOnWriteArrayList();//创建英雄子弹集合
	CopyOnWriteArrayList eblist=new CopyOnWriteArrayList();//创建敌方子弹集合
	movemap mm=new movemap();//地图
	movehbullet mhb=new movehbullet();
	public MainJframe(){
		this.setTitle("1941");
		this.setSize(512,720);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(3);

		//创建英雄飞机
		if(score==0){
			hero=new Hero(new ImageIcon("./img/myhero/img_plane_8.png"),300,500,3);
		}
		else if(score==4){
			hero=new Hero(new ImageIcon("./img/myhero/img_plane_1.png"),300,500,3);
		}
		
		//创建BOSS
		boss=new Boss(new ImageIcon("./img/boss/img_plane_boss_2.png"),180,200,50);
		//启动移动地图线程
		mm.start();
		//启动重绘地图线程
		new  remapimg().start();
		//启动添加敌方飞机集合数据线程
		new addEnemy().start();
		//启动敌方飞机下落线程
		new downenemy().start();
		//飞机碰撞线程
		new  touch().start();
		//添加子弹集合数据线程
		new addhbulle().start();
		//移动地方子弹
		new moveeb().start();
		mhb.start();
		
		//	注册键盘监听
		this.addKeyListener(this);
	}
	//画板
	public void paint(Graphics g) {
		//解决闪屏
		//根据窗体创建缓冲画布
		Image  bufferImage=this.createImage(512,720);
		//根据缓冲画布得到缓冲画笔
		Graphics  g2=bufferImage.getGraphics();
		if(hero.hp==0){
			g2.drawImage(new ImageIcon(".img/map/img_bg_level_3.jpg").getImage(),0,0,null);
		}
		//绘制地图
		g2.drawImage(new ImageIcon("./img/map/img_bg_level_2.jpg").getImage(),0,y,null);
		g2.drawImage(new ImageIcon("./img/map/img_bg_level_2.jpg").getImage(),0,y-768,null);
		//绘制英雄飞机
		g2.drawImage(hero.hi.getImage(),hero.x,hero.y,hero.hi.getIconWidth()/2,hero.hi.getIconHeight()/2,null);
//		//绘制boss
		if(score>=3){
			g2.drawImage(boss.ii.getImage(),boss.x,boss.y,boss.ii.getIconWidth()/2,boss.ii.getIconHeight()/2,null);
		}	
		//绘制血条
		g2.drawRect(50,50,60,20);
		g2.setColor(Color.RED);
		if(hero.hp==3){
			g2.fillRect(51,51,59,19);
		}
		if(hero.hp==2){
			g2.fillRect(51,51,29,19);
		}
		if(hero.hp==1){
			g2.fillRect(51,51,19,19);
		}
		//当Hp=0时，游戏结束界面
		if(hero.hp==0){
			g2.drawImage(new ImageIcon("./img/map/gameover.png").getImage(),150,200,this.getWidth()/2,this.getHeight()/2,null);
		}
		//绘制爆炸
		for(int i=0;i<bmlist.size();i++){
			g2.drawImage(((Boom)bmlist.get(i)).bmi.getImage(),((Boom)bmlist.get(i)).x,((Boom)bmlist.get(i)).y,((Boom)bmlist.get(i)).bmi.getIconWidth()/3,((Boom)bmlist.get(i)).bmi.getIconHeight()/3,null);
		}
		//绘制英雄子弹
		for(int i=0;i<hblist.size();i++){
			g2.drawImage(((HBullet)hblist.get(i)).bi.getImage(),((HBullet)hblist.get(i)).x,((HBullet)hblist.get(i)).y,null);
		}
		//绘制敌方飞机;
		for(int i=0;i<elist.size();i++){
			g2.drawImage(((Enemy)elist.get(i)).ei.getImage(),((Enemy)elist.get(i)).x,((Enemy)elist.get(i)).y,((Enemy)elist.get(i)).ei.getIconWidth()/2,((Enemy)elist.get(i)).ei.getIconHeight()/2,null);
		}
		//绘制敌方子弹
		for(int i=0;i<eblist.size();i++){
			g2.drawImage(((EBullet)eblist.get(i)).ebi.getImage(),((EBullet)eblist.get(i)).x,((EBullet)eblist.get(i)).y,null);		
		}
		//绘制分数
		g2.setColor(Color.WHITE);
		g2.drawString("得分："+score,430,70);
		//把缓冲画布加入到画板
		g.drawImage(bufferImage,0,0,null);
	}
	//移动地图
	class movemap extends Thread{
		public void run() {
			for(;;){
				try {
					Thread.sleep(50);
					if(y<768){
						y+=3;
					}else{
						y=0;
					}
					
				} catch (InterruptedException e) {
					// TODO 自动生成 catch 块
					e.printStackTrace();
				}
			}
		}
	}
	//重绘地图
	class remapimg extends Thread{
		
		public void run() {
			// TODO 自动生成方法存根
			for(;;){
				try {
					Thread.sleep(10);
					MainJframe.this.repaint();
				} catch (InterruptedException e) {
					// TODO 自动生成 catch 块
					e.printStackTrace();
				}
			}
		}
	}
	//往敌方飞机集合添加数据
	class addEnemy  extends  Thread{
		public void run() {
			for(;;){
				try {
					Thread.sleep(900);
					elist.add(new Enemy((new ImageIcon("./img/enemy/d1.png")),0,50));
//					eblist.add(new EBullet((new ImageIcon("./img/ebullet/bu02_01.png")),0,50));
				} catch (InterruptedException e) {
					// TODO 自动生成 catch 块
					e.printStackTrace();
				}
			}
		}
	}
	//敌方飞机下落
	class downenemy extends  Thread{
		public void run() {
			for(;;){
				try {
					Thread.sleep(50);
					for(int i=0;i<elist.size();i++){
						((Enemy)elist.get(i)).y+=5;
					}
				} catch (InterruptedException e) {
					// TODO 自动生成 catch 块
					e.printStackTrace();
				}
			}
		}
	}
	//飞机碰撞,子弹击中敌方线程
	class touch extends Thread{
		public void run() {
			for(;;){
				try {
					Thread.sleep(10);
					//英雄飞机组成碰撞矩形
					Rectangle rec=new Rectangle(hero.x,hero.y,hero.hi.getIconWidth()-50,hero.hi.getIconHeight()-50);
					//遍历敌军组成碰撞矩形
					addbmoom abm=new addbmoom();
					for(int i=0;i<elist.size();i++){
						Rectangle rec1=new Rectangle(((Enemy)elist.get(i)).x,((Enemy)elist.get(i)).y,((Enemy)elist.get(i)).ei.getIconWidth(),((Enemy)elist.get(i)).ei.getIconHeight());
						//判英雄与敌军碰撞
						if(rec.intersects(rec1)){	
								hero.hp-=1;
//								System.out.println(hero.hp);
//								准备线程
								elist.remove(i);								
								abm.x=rec.x;
								abm.y=rec.y;
								abm.start();
								if(hero.hp==0){
									hero.hi=new ImageIcon("");
									mm.suspend();
									mhb.suspend();
								}
							}
						else{
								for(int j=0;j<hblist.size();j++){
									Rectangle rec2=new Rectangle(((HBullet)hblist.get(j)).x,((HBullet)hblist.get(j)).y,((HBullet)hblist.get(j)).bi.getIconWidth(),((HBullet)hblist.get(j)).bi.getIconHeight());
									//判子弹与敌军碰撞
									if(rec1.intersects(rec2)){	
										score+=1;
										elist.remove(i);
										hblist.remove(j);
										abm.x=rec1.x;
										abm.y=rec1.y;
										abm.start();	
										break;
								}
									
							}
						}	

					}
				} catch (InterruptedException e) {
					// TODO 自动生成 catch 块
					e.printStackTrace();
				}
			}
		}
	}
	//添加爆炸集合数据
	class addbmoom extends Thread{
		int x=0,y=0;
		public void run() {
			for(int i=0;i<23;i++){
				try {
					Thread.sleep(10);
						bmlist.add(new Boom(new ImageIcon("./img/boom/"+i+".png"),x,y));
				} catch (InterruptedException e) {
					// TODO 自动生成 catch 块
					e.printStackTrace();
				}
			}
			bmlist.clear();
		}
	}
	//添加英雄子弹集合数据
	class addhbulle extends Thread{
		@Override
		public void run() {
			for(;;){
				try {
					Thread.sleep(300);
						hblist.add(new HBullet(new ImageIcon("./img/bullet/img_bullet_1.png"),hero.x+30,hero.y));
				} catch (InterruptedException e) {
					// TODO 自动生成 catch 块
					e.printStackTrace();
				}
			}
		}
	}
	//添加敌方子弹集合数据
	class addebullet extends Thread{
		@Override
		public void run() {
			for(;;){
				try {
					Thread.sleep(300);
					for(int i=0;i<eblist.size();i++){
						eblist.add(new EBullet(new ImageIcon("./img/bullet/img_bullet_1.png"),((Enemy)elist.get(i)).x,((Enemy)elist.get(i)).y));
					}			
				} catch (InterruptedException e) {
					// TODO 自动生成 catch 块
					e.printStackTrace();
				}
			}
		}
	}
	//敌方子弹移动
	class moveeb extends Thread{
		@Override
		public void run() {
			for(;;){
				try {
					Thread.sleep(10);
					for(int i=0;i<=eblist.size();i++){
//						((EBullet)eblist.get(i)).y=100;
					}
				} catch (InterruptedException e) {
					// TODO 自动生成 catch 块
					e.printStackTrace();
				}
			}

		}
	}
	//子弹移动线程
	class movehbullet extends  Thread{
		public void run() {
			for(;;){
				try {
					Thread.sleep(30);
					for(int i=0;i<hblist.size();i++){
						((HBullet)hblist.get(i)).y-=5;
					}
				} catch (InterruptedException e) {
					// TODO 自动生成 catch 块
					e.printStackTrace();
				}
			}
		}
	}
	//BOSS移动
	class moveBoss extends Thread{
		@Override
		public void run() {
			int i=1;
			for(;;){
				if(i/2==0||boss.x>400){
					boss.x-=5;
					i++;
				}else if(i/2!=0||boss.x<100){
					boss.x+=4;
				}
			}
		}
	}
	//主方法
	public static void main(String[] args) {
	 new MainJframe().setVisible(true);	
	}
	
	
	public void keyTyped(KeyEvent e) {
		// TODO 自动生成方法存根
		
	}
	public void keyPressed(KeyEvent e) {
		// TODO 自动生成方法存根
		if(e.getKeyCode()==KeyEvent.VK_UP&&hero.y>=50){
			hero.y-=10;
		}else if(e.getKeyCode()==KeyEvent.VK_DOWN&&hero.y<=600){
			hero.y+=10;
		}else if(e.getKeyCode()==KeyEvent.VK_LEFT&&hero.x>=15){
			hero.x-=10;
		}else if(e.getKeyCode()==KeyEvent.VK_RIGHT&&hero.x<=430){
			hero.x+=10;
		}else{
			
		}
	}
	public void keyReleased(KeyEvent e) {
		// TODO 自动生成方法存根
		if(su){
			if(e.getKeyCode()==KeyEvent.VK_SPACE){
				mm.suspend();
				mhb.suspend();
				su=false;
				}
		}else{
			if(e.getKeyCode()==KeyEvent.VK_SPACE){
				mm.resume();
				mhb.resume();
				su=true;
				}
		}
	}
	
}
