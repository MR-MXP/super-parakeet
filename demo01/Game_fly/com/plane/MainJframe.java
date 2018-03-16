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
	int y;//��ͼY������
	Hero hero;
	HBullet hbullet;
	//�����з��ɻ�����
	CopyOnWriteArrayList elist=new CopyOnWriteArrayList();//�����з��ɻ�����
	CopyOnWriteArrayList bmlist=new CopyOnWriteArrayList();//������ը����
	CopyOnWriteArrayList hblist=new CopyOnWriteArrayList();//�����ӵ�����
	public MainJframe(){
		this.setTitle("1941");
		this.setSize(512,720);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(3);

		//����Ӣ�۷ɻ�
		hero=new Hero(new ImageIcon("./img/myhero/img_plane_8.png"),300,500,3);
		
		//�����ƶ���ͼ�߳�
		new movemap().start();
		//�����ػ��ͼ�߳�
		new  remapimg().start();
		//������ӵз��ɻ����������߳�
		new addEnemy().start();
		//�����з��ɻ������߳�
		new downenemy().start();
		//�ɻ���ײ�߳�
		new  touch().start();
		//����ӵ����������߳�
		new addhbulle().start();
		//�ƶ��ӵ��߳�
		new movehbullet().start();
		
		//�任��ͼ
//		ImageIcon changemap=new  ImageIcon(new ImageIcon("./img/map/img_bg_level_1.jpg").getImage());
		//	ע����̼���
		this.addKeyListener(this);
	}
	//����
	public void paint(Graphics g) {
		//�������
		//���ݴ��崴�����廭��
		Image  bufferImage=this.createImage(512,720);
		//���ݻ��廭���õ����廭��
		Graphics  g2=bufferImage.getGraphics();
		//���Ƶ�ͼ
		g2.drawImage(new ImageIcon("./img/map/img_bg_level_2.jpg").getImage(),0,y,null);
		g2.drawImage(new ImageIcon("./img/map/img_bg_level_2.jpg").getImage(),0,y-768,null);
		//����Ӣ�۷ɻ�
		g2.drawImage(hero.hi.getImage(),hero.x,hero.y,hero.hi.getIconWidth()/2,hero.hi.getIconHeight()/2,null);
		//���Ƶз��ɻ�;
		for(int i=0;i<elist.size();i++){
			g2.drawImage(((Enemy)elist.get(i)).ei.getImage(),((Enemy)elist.get(i)).x,((Enemy)elist.get(i)).y,null);
		}
		//����Ѫ��
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
		//���Ʊ�ը
		for(int i=0;i<bmlist.size();i++){
			g2.drawImage(((Boom)bmlist.get(i)).bmi.getImage(),((Boom)bmlist.get(i)).x,((Boom)bmlist.get(i)).y,null);
		}
		//�����ӵ�
		for(int i=0;i<hblist.size();i++){
			g2.drawImage(((HBullet)hblist.get(i)).bi.getImage(),((HBullet)hblist.get(i)).x,((HBullet)hblist.get(i)).y,null);
		}
		//�ѻ��廭�����뵽����
		g.drawImage(bufferImage,0,0,null);
	}
	//�ƶ���ͼ
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
					// TODO �Զ����� catch ��
					e.printStackTrace();
				}
			}
		}
	}
	//�ػ��ͼ
	class remapimg extends Thread{
		
		public void run() {
			// TODO �Զ����ɷ������
			for(;;){
				try {
					Thread.sleep(10);
					MainJframe.this.repaint();
				} catch (InterruptedException e) {
					// TODO �Զ����� catch ��
					e.printStackTrace();
				}
			}
		}
	}
	//���з��ɻ������������
	class addEnemy  extends  Thread{
		public void run() {
			for(;;){
				try {
					Thread.sleep(900);
					elist.add(new Enemy((new ImageIcon("./img/enemy/d1.png")),0,10));
					
				} catch (InterruptedException e) {
					// TODO �Զ����� catch ��
					e.printStackTrace();
				}
			}
		}
	}
	//�з��ɻ�����
	class downenemy extends  Thread{
		public void run() {
			for(;;){
				try {
					Thread.sleep(50);
					for(int i=0;i<elist.size();i++){
						((Enemy)elist.get(i)).y+=5;
					}
				} catch (InterruptedException e) {
					// TODO �Զ����� catch ��
					e.printStackTrace();
				}
			}
		}
	}

	//�ɻ���ײ,�ӵ����ез��߳�
	class touch extends Thread{
		public void run() {
			for(;;){
				try {
					Thread.sleep(10);
					//Ӣ�۷ɻ������ײ����
					Rectangle rec=new Rectangle(hero.x,hero.y,hero.hi.getIconWidth()-50,hero.hi.getIconHeight()-50);
					//�����о������ײ����
					for(int i=0;i<elist.size();i++){
						Rectangle rec1=new Rectangle(((Enemy)elist.get(i)).x,((Enemy)elist.get(i)).y,((Enemy)elist.get(i)).ei.getIconWidth(),((Enemy)elist.get(i)).ei.getIconHeight());
						for(int j=0;j<hblist.size();i++){
							
						}
						if(rec1.intersects(rec)){
								hero.hp-=1;
//								System.out.println(hero.hp);
								elist.remove(i);
								//׼���߳�

							}else if(rec.intersects(rec1)){
								elist.remove(i);								
							}
					}
				} catch (InterruptedException e) {
					// TODO �Զ����� catch ��
					e.printStackTrace();
				}
			}
		}
	}
	//��ӱ�ը��������
	class addbmoom extends Thread{
		int x=0,y=0;
		public void run() {
			for(int i=0;i<23;i++){
				try {
					Thread.sleep(20);
						bmlist.add(new Boom(new ImageIcon("./img/boom/"+i+".png"),x,y));
				} catch (InterruptedException e) {
					// TODO �Զ����� catch ��
					e.printStackTrace();
				}
			}
			bmlist.clear();
		}
	}
	//���Ӣ���ӵ���������
	class addhbulle extends Thread{
		@Override
		public void run() {
			for(;;){
				try {
					Thread.sleep(300);
					hblist.add(new HBullet(new ImageIcon("./img/bullet/img_bullet_1.png"),hero.x+30,hero.y));
				} catch (InterruptedException e) {
					// TODO �Զ����� catch ��
					e.printStackTrace();
				}
			}
		}
	}
	//�ƶ��ӵ��߳�
	class movehbullet extends  Thread{
		public void run() {
			for(;;){
				try {
					Thread.sleep(30);
					for(int i=0;i<hblist.size();i++){
						((HBullet)hblist.get(i)).y-=5;
					}
				} catch (InterruptedException e) {
					// TODO �Զ����� catch ��
					e.printStackTrace();
				}
			}
		}
	}

	//������
	public static void main(String[] args) {
	 new MainJframe().setVisible(true);	
	}
	
	
	public void keyTyped(KeyEvent e) {
		// TODO �Զ����ɷ������
		
	}
	public void keyPressed(KeyEvent e) {
		// TODO �Զ����ɷ������
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
		// TODO �Զ����ɷ������
		
	}
}
