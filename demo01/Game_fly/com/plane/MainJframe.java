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
	//创建敌方飞机集合
	CopyOnWriteArrayList elist=new CopyOnWriteArrayList();//创建敌方飞机集合
	CopyOnWriteArrayList bmlist=new CopyOnWriteArrayList();//创建爆炸集合
	CopyOnWriteArrayList hblist=new CopyOnWriteArrayList();//创建子弹集合
	public MainJframe(){
		this.setTitle("1941");
		this.setSize(512,720);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(3);

		//创建英雄飞机
		hero=new Hero(new ImageIcon("./img/myhero/img_plane_8.png"),300,500,3);
		
		//启动移动地图线程
		new movemap().start();
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
		//移动子弹线程
		new movehbullet().start();
		
		//变换地图
//		ImageIcon changemap=new  ImageIcon(new ImageIcon("./img/map/img_bg_level_1.jpg").getImage());
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
		//绘制地图
		g2.drawImage(new ImageIcon("./img/map/img_bg_level_2.jpg").getImage(),0,y,null);
		g2.drawImage(new ImageIcon("./img/map/img_bg_level_2.jpg").getImage(),0,y-768,null);
		//绘制英雄飞机
		g2.drawImage(hero.hi.getImage(),hero.x,hero.y,hero.hi.getIconWidth()/2,hero.hi.getIconHeight()/2,null);
		//绘制敌方飞机;
		for(int i=0;i<elist.size();i++){
			g2.drawImage(((Enemy)elist.get(i)).ei.getImage(),((Enemy)elist.get(i)).x,((Enemy)elist.get(i)).y,null);
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
		//绘制爆炸
		for(int i=0;i<bmlist.size();i++){
			g2.drawImage(((Boom)bmlist.get(i)).bmi.getImage(),((Boom)bmlist.get(i)).x,((Boom)bmlist.get(i)).y,null);
		}
		//绘制子弹
		for(int i=0;i<hblist.size();i++){
			g2.drawImage(((HBullet)hblist.get(i)).bi.getImage(),((HBullet)hblist.get(i)).x,((HBullet)hblist.get(i)).y,null);
		}
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
					elist.add(new Enemy((new ImageIcon("./img/enemy/d1.png")),0,10));
					
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
					for(int i=0;i<elist.size();i++){
						Rectangle rec1=new Rectangle(((Enemy)elist.get(i)).x,((Enemy)elist.get(i)).y,((Enemy)elist.get(i)).ei.getIconWidth(),((Enemy)elist.get(i)).ei.getIconHeight());
						for(int j=0;j<hblist.size();i++){
							
						}
						if(rec1.intersects(rec)){
								hero.hp-=1;
//								System.out.println(hero.hp);
								elist.remove(i);
								//准备线程

							}else if(rec.intersects(rec1)){
								elist.remove(i);								
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
					Thread.sleep(20);
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
	//移动子弹线程
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
		
	}
}
