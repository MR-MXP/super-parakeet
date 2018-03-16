package com.tjm;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MainFrame extends JFrame implements KeyListener{
	int y=0,oy=600,mpx=180,mpy=450,score=0,zuo=1;
	boolean isb=true;
	MyPlane mp;
	Boss bs;
	CopyOnWriteArrayList el=new CopyOnWriteArrayList();
	CopyOnWriteArrayList bl=new CopyOnWriteArrayList();
	CopyOnWriteArrayList bzl=new CopyOnWriteArrayList();
	CopyOnWriteArrayList bozl=new CopyOnWriteArrayList();
	YdMap ym=new YdMap();
	ReMap rm=new ReMap();
	AddEy ae=new AddEy();
	EyDown ed=new EyDown();
	BFs bf=new BFs();
	Bff bff=new Bff();
	PenZ pz=new PenZ();
	Boff bof=new Boff();
	BoFs bofs=new BoFs();
	public MainFrame(){
		this.setSize(400,600);
		this.setLocationRelativeTo(null);
		this.setTitle("飞机大战");
		this.setDefaultCloseOperation(3);
		ym.start();
		rm.start();
		ae.start();
		ed.start();		
		bf.start();
		bff.start();
		bof.start();
		bofs.start();
		pz.start();				
		bs=new Boss(new ImageIcon("./djimg/boss1.png"),150,-80,100);
		mp=new MyPlane(new ImageIcon("./img/myp.png"),mpx,mpy,3);		
		this.addKeyListener(this);		
	}
	public static void main(String[] args) {
		StartJm ks=new StartJm();
		ks.Xs();
	}
	
	public void paint(Graphics g) {
		Image bfimg=this.createImage(392,592);
		Graphics g2=bfimg.getGraphics();
		g2.drawImage(new ImageIcon("./img/bg2.png").getImage(),0,y,null);
		g2.drawImage(new ImageIcon("./img/bg2.png").getImage(),0,y-768,null);
		//g2.drawImage(mp.mpi.getImage(),mp.x,mp.y,null);
		for(int i=0;i<bl.size();i++){
			g2.drawImage(((Bullet)bl.get(i)).bi.getImage(),((Bullet)bl.get(i)).x,((Bullet)bl.get(i)).y,((Bullet)bl.get(i)).bi.getIconWidth()/3,((Bullet)bl.get(i)).bi.getIconHeight()/3,null);
		}
		g2.drawImage(mp.mpi.getImage(),mp.x,mp.y,mp.mpi.getIconWidth()/2,mp.mpi.getIconHeight()/2,null);	
		for(int i=0;i<el.size();i++){
			g2.drawImage(((Encmy)el.get(i)).eyi.getImage(),((Encmy)el.get(i)).x,((Encmy)el.get(i)).y,((Encmy)el.get(i)).eyi.getIconWidth()/2,((Encmy)el.get(i)).eyi.getIconHeight()/2,null);
		}
		g2.drawRect(15,32,60,10);
		g2.setColor(Color.RED);
		if(mp.hp==3){
			g2.fillRect(16,33,59,9);
		}else if(mp.hp==2){
			g2.fillRect(16,33,39,9);
		}else if(mp.hp==1){
			g2.fillRect(16,33,19,9);
		}
		if(mp.hp<=0){
			g2.drawImage(new ImageIcon("./img/over.png").getImage(),10,oy,380,71,null);
			mp.mpi=new ImageIcon("");
			bf.stop();
			new YdOver().start();			
			
		}
		if(bs.hp<=0){
			g2.drawImage(new ImageIcon("./img/win.png").getImage(),10,oy,380,71,null);
			bs.boi=new ImageIcon("");
			mp.mpi=new ImageIcon("");
			bf.stop();
			new YdOver().start();
		}
		
		if(score>100){
			for(int i=0;i<bozl.size();i++){
				g2.drawImage(((Bullet)bozl.get(i)).bi.getImage(),((Bullet)bozl.get(i)).x,((Bullet)bozl.get(i)).y,((Bullet)bozl.get(i)).bi.getIconWidth()/2,((Bullet)bozl.get(i)).bi.getIconHeight()/2,null);
			}
			g2.drawImage(bs.boi.getImage(),bs.x,bs.y,bs.boi.getIconWidth(),bs.boi.getIconHeight(),null);			
			new BosDown().start();

			
			
		}
		for(int i=0;i<bzl.size();i++){

				g2.drawImage(((Boom)bzl.get(i)).bzi.getImage(),((Boom)bzl.get(i)).x,((Boom)bzl.get(i)).y,((Boom)bzl.get(i)).bzi.getIconWidth(),((Boom)bzl.get(i)).bzi.getIconHeight(),null);

		}
		g2.setColor(Color.WHITE);
		g2.setFont(new Font("幼圆",Font.BOLD,15));
		g2.drawString("积分:"+score,16,60);
		g.drawImage(bfimg,0,0,null);
		
		
	}
	public void Ck(){
		int n=JOptionPane.showOptionDialog(null,"是否重开","game over",2,2,null,null,null);
		if(n==0){
			MainFrame.this.dispose();
			new MainFrame().setVisible(true);
		}else{				
			MainFrame.this.dispose();
			StartJm ks=new StartJm();
			ks.Xs();
		}
	}

	class Cok extends Thread{
		
		public void run() {
				try {
					Thread.sleep(3000);
					Ck();
				} catch (InterruptedException e) {
					// TODO 自动生成 catch 块
					e.printStackTrace();
				}
		}
	}
	class YdOver extends Thread{
		
		public void run() {
			for(;;){
				try {				
						if(oy==300){
							new YdOver().stop();							
						}else{
							oy-=1;
							Thread.sleep(1000);
						}
				} catch (InterruptedException e) {
					// TODO 自动生成 catch 块
					e.printStackTrace();
				}
				
			}
		}
	}
	class YdMap extends Thread{
		
		public void run() {
			for(;;){
				try {
					Thread.sleep(30);
					if(y<768){
						y+=1;
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
	class ReMap extends Thread{
		
		public void run() {
			for(;;){
				try {
					Thread.sleep(10);
					MainFrame.this.repaint();
				} catch (InterruptedException e) {
					// TODO 自动生成 catch 块
					e.printStackTrace();
				}
			}
		}
	}
	class AddEy extends Thread{
		
		public void run() {
			Random rt=new Random();
			for(;;){
				try {
					if(score>50&&score<100){
						Thread.sleep(200);
					}else{
						Thread.sleep(1000);
					}
					
					int tb=rt.nextInt(6)+1;
					el.add(new Encmy(new ImageIcon("./djimg/d"+tb+".png"),10,10));
				} catch (InterruptedException e) {
					// TODO 自动生成 catch 块
					e.printStackTrace();
				}				
			}
		}
	}
	class EyDown extends Thread{
		
		public void run() {
			for(;;){
				try {
					Thread.sleep(50);
					for(int i=0;i<el.size();i++){
						((Encmy)el.get(i)).y+=3;
					}
				} catch (InterruptedException e) {
					// TODO 自动生成 catch 块
					e.printStackTrace();
				}
			}
		}
	}
	
	class BosDown extends Thread{
		
		public void run() {
			try {
				if(bs.y>=10){					
					bs.y=10;					
					ym.resume();					
					ae.resume();
					ed.resume();
					bf.resume();
					bff.resume();
					pz.resume();
					isb=true;
					if(bs.x>=0&&bs.x<=280){
						
						if(zuo==1){
							bs.x+=1;
							if(bs.x==280){
								bs.x=280;
								zuo=0;
							}
						}else if(zuo==0){
							bs.x-=1;
							if(bs.x==10){
								bs.x=10;
								zuo=1;
							}
						}
					}
				}else{
					bs.y+=1;
					ym.suspend();					
					ae.suspend();
					ed.suspend();
					bf.suspend();
					bff.suspend();
					pz.suspend();					
					isb=false;
					Thread.sleep(3000);
				}
				
			} catch (InterruptedException e1) {
				// TODO 自动生成的 catch 块
				e1.printStackTrace();
			}
			
		}
	}
	class PenZ extends Thread{
		
		public void run() {
			for(;;){
				try {
					Thread.sleep(1);					
					for(int j=0;j<bl.size();j++){
						BmZ bz=new BmZ();
						Rectangle rez=new Rectangle(((Bullet)bl.get(j)).x,((Bullet)bl.get(j)).y,((Bullet)bl.get(j)).bi.getIconWidth()/3,((Bullet)bl.get(j)).bi.getIconHeight()/3);												
						for(int i=0;i<el.size();i++){
							Rectangle red=new Rectangle(((Encmy)el.get(i)).x,((Encmy)el.get(i)).y,((Encmy)el.get(i)).eyi.getIconWidth()/2,((Encmy)el.get(i)).eyi.getIconHeight()/2);
							Rectangle reh=new Rectangle(mp.x,mp.y,mp.mpi.getIconWidth()/2,mp.mpi.getIconHeight()/2);
							Rectangle reb=new Rectangle(bs.x,bs.y,bs.boi.getIconWidth(),mp.mpi.getIconHeight());
							if(reh.intersects(red)){
								mp.hp-=1;
								if(mp.hp==0){									
									BmZwj bzwj=new BmZwj();
									bzwj.x=reh.x;
									bzwj.y=reh.y;		
									bzwj.start();
									new Cok().start();
									break;
								}
								el.remove(i);							
								bz.x=red.x;
								bz.y=red.y;		
								bz.start();
								break;
							}
							if(rez.intersects(red)){
								score+=10;
								bl.remove(j);
								el.remove(i);
								bz.x=red.x;
								bz.y=red.y;	
								bz.start();
								break;
							}
							if(rez.intersects(reb)){
								bs.hp-=1;
								bl.remove(j);
								bz.x=reb.x+20;
								bz.y=reb.y+20;	
								bz.start();
								break;
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
	class BFs extends Thread{
		
		public void run() {
			for(;;){
				try {
					Thread.sleep(500);
					bl.add(new Bullet(new ImageIcon("./buimg/zd.png"),mp.x+17,mp.y));
				} catch (InterruptedException e) {					
					e.printStackTrace();
				}
			}
		}
	}
	class BoFs extends Thread{
		
		public void run() {
			for(;;){
				try {
					Thread.sleep(5000);					
						bozl.add(new Bullet(new ImageIcon("./buimg/bo2.png"),bs.x+35,bs.y+100));			
					
				} catch (InterruptedException e) {					
					e.printStackTrace();
				}
			}
		}
	}
	class Boff extends Thread{
		
		public void run() {
			for(;;){
				try {
					Thread.sleep(30);
					for(int i=0;i<bozl.size();i++){
						((Bullet)bozl.get(i)).y+=5;
					}
				} catch (InterruptedException e) {
					// TODO 自动生成 catch 块
					e.printStackTrace();
				}
			}
		}
	}
	class Bff extends Thread{
		
		public void run() {
			for(;;){
				try {
					Thread.sleep(20);
					for(int i=0;i<bl.size();i++){
						((Bullet)bl.get(i)).y-=5;
					}
				} catch (InterruptedException e) {
					// TODO 自动生成 catch 块
					e.printStackTrace();
				}
			}
		}
	}
	class BmZ extends Thread{
		int x=0,y=0;
		
		public void run() {
			
			for(int i=1;i<=6;i++){
				try {
					Thread.sleep(50);
					bzl.add(new Boom(new ImageIcon("./boomimg/bz"+i+".png"),x,y));
				} catch (InterruptedException e) {
					// TODO 自动生成 catch 块
					e.printStackTrace();
				}
			}
			bzl.clear();
		}
	}
	class BmZwj extends Thread{
		int x=0,y=0;
		
		public void run() {
			
			for(int i=1;i<=6;i++){
				try {
					Thread.sleep(50);
					bzl.add(new Boom(new ImageIcon("./boomimg/bz"+i+".png"),x,y));
				} catch (InterruptedException e) {
					// TODO 自动生成 catch 块
					e.printStackTrace();
				}
			}
			bzl.clear();
		}
	}
	
	
	
	
	public void keyTyped(KeyEvent e) {
				
	}
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_W&&mp.y>=50&&isb){
			mp.y-=10;
		}
		if(e.getKeyCode()==KeyEvent.VK_S&&mp.y<=530&&isb){
			mp.y+=10;
		}
		if(e.getKeyCode()==KeyEvent.VK_A&&mp.x>=15&&isb){
			mp.x-=10;
		}
		if(e.getKeyCode()==KeyEvent.VK_D&&mp.x<=330&&isb){
			mp.x+=10;
		}
		if(e.getKeyCode()==KeyEvent.VK_SPACE){
			if(isb){
				ym.suspend();
				rm.suspend();
				ae.suspend();
				ed.suspend();
				bf.suspend();
				bff.suspend();
				bof.suspend();
				bofs.suspend();
				pz.suspend();
				isb=false;
			}else{
				ym.resume();
				rm.resume();
				ae.resume();
				ed.resume();
				bf.resume();
				bff.resume();
				bof.resume();
				bofs.resume();
				pz.resume();
				isb=true;
			}
		}
	}
	public void keyReleased(KeyEvent e) {
				
	}
}
