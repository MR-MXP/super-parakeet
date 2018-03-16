package com;

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
	int y=0;//��ͼ����
	MyPlane myplane;//�����ҵķɻ�
	Bullet mybullet;//�����ҵ��ӵ�
	Boss boss;//����boss
	Boolean flag=true;//�ж��Ƿ����߳�
	Boolean loop=true;
	int score=0;//��Ϸ����
	int level=1;//�ؿ�
	int speed=10;//��ҷɻ��ƶ��ٶ�
	int enspeed=3;//�з��ɻ��ƶ��ٶ�
	int enp=0;//�о��ɻ�����
	Random r=new Random();//�������߳������ʱ��
	int time=20000;
	//��������ĸ����߳�
	MoveMap mmap=new MoveMap();
    AddBullet abullet=new AddBullet();
    MoveBullet mbullet=new MoveBullet();
	AddEnplane aeplane=new AddEnplane();
	EnplaneMove epmove=new EnplaneMove();
	Touch touch =new Touch();
	Redraw re=new Redraw();
	AddItem aitem=new AddItem();
	MoveItem mitem=new MoveItem();
	MoveBoss mboss=new MoveBoss();
	AddBossBullet abbullet=new AddBossBullet();
	MoveBossBullet mbbullet=new MoveBossBullet();
	
	
	//guiʹ��CopyOnWriteArrayList���ϣ����Ϸ�Ϊ��list,set,map��
	CopyOnWriteArrayList enplane=new CopyOnWriteArrayList();//�����������о��ɻ�����
	CopyOnWriteArrayList boom=new CopyOnWriteArrayList();//����������һ����ը����
	CopyOnWriteArrayList blist=new CopyOnWriteArrayList();//�����������ҵķɻ��ӵ�����
	CopyOnWriteArrayList iitem=new CopyOnWriteArrayList();//�����������������߼���
	CopyOnWriteArrayList bbullet=new CopyOnWriteArrayList();//����������boss�ӵ�
	public MainFrame(){
		this.setTitle("�ɻ���ս");
		this.setSize(512,700);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(3);
		
		//�ҵķɻ�
		myplane=new MyPlane(new ImageIcon("./com/myplane/img_plane_8.png"),200,580,5);
		//boss
		boss=new Boss(new ImageIcon("./com/boss/boss1.png"),2,-200,200);
		//�����߳�
		mmap.start();//��ͼ�ƶ��߳�
        abullet.start();//����ҵ��ӵ��߳�
        mbullet.start();//�ҵ��ӵ��ƶ��߳�
		new Redraw().start();//�ػ��߳�
		aeplane.start();//��ӵо��߳�
		epmove.start();//�о��ƶ��߳�
		touch.start();//��ײ�߳�
		aitem.start();//������������߳�
		mitem.start();//���������ƶ��߳�
		mboss.start();
		abbullet.start();
		mbbullet.start();
		
		//���ҵķɻ����ϼ���
		this.addKeyListener(this);
		//���߳��ֵ����ʱ�� (20S-40S֮��)
		time=r.nextInt(20000)+time;

	}
	//����
	@Override
	public void paint(Graphics g) {
		/*������˸ԭ���̶߳࣬�ػ�࣬���Ķ�����
		 * ������������û��廭��
		 * */	
		Image bufferImage;
		//���ݴ��崴�����廭��
		bufferImage=this.createImage(512,700);
		//�õ����廭��
		Graphics g1=bufferImage.getGraphics();
		//���ؿ���ͼ��boss
		if(level==1){		
			g1.drawImage(new ImageIcon("./com/map/img_bg_level_1.jpg").getImage(),0,y,null);
			g1.drawImage(new ImageIcon("./com/map/img_bg_level_1.jpg").getImage(),0,y-768,null);
			g1.drawImage(new ImageIcon("./com/boss/boss1.png").getImage(), boss.x, boss.y, null);
		}
		if(level==2){
			g1.drawImage(new ImageIcon("./com/map/img_bg_level_2.jpg").getImage(),0,y,null);
			g1.drawImage(new ImageIcon("./com/map/img_bg_level_2.jpg").getImage(),0,y-768,null);
			g1.drawImage(new ImageIcon("./com/boss/boss2.png").getImage(), boss.x, boss.y, null);
		}
		if(level==3){
			g1.drawImage(new ImageIcon("./com/map/img_bg_level_3.jpg").getImage(),0,y,null);
			g1.drawImage(new ImageIcon("./com/map/img_bg_level_3.jpg").getImage(),0,y-768,null);
			g1.drawImage(new ImageIcon("./com/boss/boss3.png").getImage(), boss.x, boss.y, null);
		}
		if(level>=4){
			g1.drawImage(new ImageIcon("./com/map/img_bg_level_4.jpg").getImage(),0,y,null);
			g1.drawImage(new ImageIcon("./com/map/img_bg_level_4.jpg").getImage(),0,y-768,null);
			g1.drawImage(new ImageIcon("./com/boss/boss4.png").getImage(), boss.x, boss.y, null);
		}
		//���ҵķɻ�
		g1.drawImage(myplane.ii.getImage(),myplane.mx,myplane.my,null);			
		//��bossѪ��
		g1.setColor(Color.black);
		g1.drawRect(boss.x+30, boss.y, 200, 15);
		g1.setColor(Color.green);
		g1.fillRect(boss.x+31, boss.y+1, boss.hp, 14);
		//��������ֹͣ�ӵ��̣߳��ɻ���ʧ
		if(myplane.hp<=0){
			myplane.ii=new ImageIcon("");
			abullet.stop();//ֹͣ�ӵ�
		}
		//���о��ɻ�
		for(int i=0;i<enplane.size();i++){
			g1.drawImage(((Enemy)enplane.get(i)).eii.getImage(),((Enemy)enplane.get(i)).ex,((Enemy)enplane.get(i)).ey,null);
		}
        //���ҵ��ӵ�
		for(int i=0;i<blist.size();i++){
			g1.drawImage(((Bullet)blist.get(i)).bii.getImage(),((Bullet)blist.get(i)).bx,((Bullet)blist.get(i)).by,null);
		}
		//��boss�ӵ�
		for(int i=0;i<bbullet.size();i++){
			g1.drawImage(((BossBullet)bbullet.get(i)).ii.getImage(),((BossBullet)bbullet.get(i)).x,((BossBullet)bbullet.get(i)).y,null);
		}
		//����ը����
		for(int i=0;i<boom.size();i++){
			try {
				g1.drawImage(((Boom)boom.get(i)).ii.getImage(),((Boom)boom.get(i)).x,((Boom)boom.get(i)).y,null);
			} catch (Exception e) {
				System.out.println("���滵�ˣ������򲻻����");
			}
		}
		//����Ϸ����
		g1.setColor(Color.pink);
		g1.setFont(new Font("��������",Font.BOLD,18));
		g1.drawString("��ǰ����:"+score,360,60);
		if(score>200&&score<500){
			speed=8;
			enspeed=4;
		}
		if(score>500){
			speed=11;
			enspeed=5;
		}
		//��ʾ�ؿ�
		if(level==1){
			g1.setFont(new Font("��������",Font.BOLD,20));
			g1.drawString("��һ��",380,90);
		}
		if(level==2){
			g1.setFont(new Font("��������",Font.BOLD,20));
			g1.drawString("�ڶ���",380,90);
		}
		if(level==3){
			g1.setFont(new Font("��������",Font.BOLD,20));
			g1.drawString("������",380,90);
		}
		if(level==4){
			g1.setFont(new Font("��������",Font.BOLD,20));
			g1.drawString("���Ĺ�",380,90);
		}
		//���ҵ�Ѫ��
		g1.drawRect(50,50,100,15);
		g1.setColor(Color.red);
		if(myplane.hp==5){
			g1.fillRect(51,51,99,14);
		}
		if(myplane.hp==4){
			g1.fillRect(51,51,79,14);
		}
		if(myplane.hp==3){
			g1.fillRect(51,51,59,14);
		}
		if(myplane.hp==2){
			g1.fillRect(51,51,39,14);
		}
		if(myplane.hp==1){
			g1.fillRect(51,51,19,14);
		}
		if(myplane.hp==0){
			g1.fillRect(51,51,0,14);
		}
		//����������
		for(int i=0;i<iitem.size();i++){
			g1.drawImage(((Item)iitem.get(i)).ii.getImage(),((Item)iitem.get(i)).x,((Item)iitem.get(i)).y,null);
		}
		//����ͼ���������
		g.drawImage(bufferImage,0,0,null);
		
	}
	//��ͼ�ƶ��߳�
	class MoveMap extends Thread{
		@Override
		public void run() {
			// TODO �Զ����ɷ������
			super.run();
			while(true){
				try {
					Thread.sleep(60);
					if(y<=768){
						y+=2;
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
	//�ػ��߳�
	class Redraw extends Thread{
		@Override
		public void run() {
			// TODO �Զ����ɷ������
			super.run();
			while(true){
				try {
					Thread.sleep(1);
					MainFrame.this.repaint();
				} catch (InterruptedException e) {
					// TODO �Զ����� catch ��
					e.printStackTrace();
				}
			}
			
		}
	}
	//�򼯺���ӵо��ɻ��߳�
	class AddEnplane extends Thread{
		@Override
		public void run() {
			while(true){
				try {
					Thread.sleep(2000);
					//�о��ɻ��������(0-11������11���������ͼƬ��1��ʼ)
					enp=r.nextInt(11)+1;
					//System.out.println(enp);
					enplane.add(new Enemy(new ImageIcon("./com/enemy/d"+enp+".png"),0,10));
				} catch (InterruptedException e) {
					// TODO �Զ����� catch ��
					e.printStackTrace();
				}
			}
		}
	}
	//�о��ɻ��ƶ��߳�
	class EnplaneMove extends Thread{
		@Override
		public void run() {
			for(;;){
				try {
					Thread.sleep(50);
					//����ÿһ���о��ɻ�
					for(int i=0;i<enplane.size();i++){
						((Enemy)enplane.get(i)).ey+=enspeed;
					}
				} catch (InterruptedException e) {
					// TODO �Զ����� catch ��
					e.printStackTrace();
				}
			}
		}
	}
	//�ж���ײ�߳�(�ӵ����ɻ�����������)
	class Touch extends Thread{
		@Override
		public void run() {
			for(;;){			
				try {
					Thread.sleep(1);
					//�ҵķɻ���ͼƬת��Ϊ���ο�
					Rectangle rec=new Rectangle(myplane.mx,myplane.my,myplane.ii.getIconWidth()/2,
							myplane.ii.getIconHeight()/2);
					//�������ߵ�ͼƬת��Ϊ���ο�
					for(int i=0;i<iitem.size();i++){
						Rectangle ritem=new Rectangle(((Item)iitem.get(i)).x,((Item)iitem.get(i)).y,
								((Item)iitem.get(i)).ii.getIconWidth(),
								((Item)iitem.get(i)).ii.getIconHeight());
						//����������ߺ��ҵķɻ���ײ
						if(rec.intersects(ritem)){
							if(myplane.hp<5){
								myplane.hp+=1;
								iitem.remove(i);
							}
						}
					}
					//����boss�ӵ�������ҷɻ�
					for(int i=0;i<bbullet.size();i++){
						//����boss�ɻ����ӵ�
						Rectangle recbbullet=new Rectangle(((BossBullet)bbullet.get(i)).x,
								((BossBullet)bbullet.get(i)).y,((BossBullet)bbullet.get(i)).ii.getIconWidth(),
								((BossBullet)bbullet.get(i)).ii.getIconHeight());
						if(rec.intersects(recbbullet)){
							myplane.hp--;
							bbullet.remove(i);
							//�ж���Ϸ����
							if(myplane.hp==0){
								//����ӵ�
								blist.clear();
								int n=JOptionPane.showConfirmDialog(null,"�Ƿ����¿�ʼ��Ϸ","��Ϸ����",2,2,null);
								if(n==0){
									//�رյ�ǰ����
									MainFrame.this.dispose();
									new MainFrame().setVisible(true);
								}else{
									//�ر������
									System.exit(0);
								}
							}
						}
					}
					//�����ɻ���ײ
					for(int i=0;i<enplane.size();i++){
						//�о��ɻ���ͼƬת���ɾ��ο�
						Rectangle rec1=new Rectangle(((Enemy)enplane.get(i)).ex,
								((Enemy)enplane.get(i)).ey,((Enemy)enplane.get(i)).eii.getIconWidth(),
								((Enemy)enplane.get(i)).eii.getIconHeight());
						//boss�ɻ���ͼƬת���ɾ��ο�
						Rectangle recboss=new Rectangle(boss.x,boss.y,boss.ii.getIconWidth(),
								boss.ii.getIconHeight());
						//�ҵķɻ��͵о��ɻ���ײ
						if(rec.intersects(rec1)||rec.intersects(recboss)){
							//System.out.println("ײ����");
							score+=5;//�ӷ�
							myplane.hp-=1;
							//�ж���Ϸ����
							if(myplane.hp==0){
								//����ӵ�
								blist.clear();
								int n=JOptionPane.showConfirmDialog(null,"�Ƿ����¿�ʼ��Ϸ","��Ϸ����",2,2,null);
								if(n==0){
									//�رյ�ǰ����
									MainFrame.this.dispose();
									new MainFrame().setVisible(true);
								}else{
									//�ر������
									System.exit(0);
								}
							}
							enplane.remove(i);
							//��ըЧ��
							Booms booms=new Booms();
							booms.x=rec1.x;
							booms.y=rec1.y;
							booms.start();
						}						
					}
					//�������ҵ��ӵ�����ĵо��ɻ�
					for(int i=0;i<blist.size();i++){
						//�����ҵķɻ����ӵ�
						Rectangle recbullet=new Rectangle(((Bullet)blist.get(i)).bx,
								((Bullet)blist.get(i)).by,((Bullet)blist.get(i)).bii.getIconWidth(),
								((Bullet)blist.get(i)).bii.getIconHeight());
						//�ҵ��ӵ�����boss
						//boss�ɻ���ͼƬת���ɾ��ο�
						Rectangle recboss=new Rectangle(boss.x,boss.y,boss.ii.getIconWidth(),
								boss.ii.getIconHeight());
						if(recbullet.intersects(recboss)){
							score++;
							boss.hp-=2;
							blist.remove(i);
							if(boss.hp==0){
								level++;
								boss.hp=200;
								if(level>4){
									int n=JOptionPane.showConfirmDialog(null,"�Ƿ����¿�ʼ��Ϸ","��Ϸͨ��",2,2,null);
									if(n==0){
										//�رյ�ǰ����
										MainFrame.this.dispose();
										new MainFrame().setVisible(true);
									}else{
										//�ر������
										System.exit(0);
									}
								}
							}
						}
						for(int j=0;j<enplane.size();j++){							
							//�о��ɻ�
							Rectangle rec1=new Rectangle(((Enemy)enplane.get(j)).ex,
									((Enemy)enplane.get(j)).ey,((Enemy)enplane.get(j)).eii.getIconWidth(),
									((Enemy)enplane.get(j)).eii.getIconHeight());
							//�ж��ӵ��Ƿ����
							if(recbullet.intersects(rec1)){
								blist.remove(i);
								enplane.remove(j);
								score+=5;//����
								//��ըЧ��
								Booms booms1=new Booms();
								booms1.x=rec1.x;
								booms1.y=rec1.y;
								booms1.start();
								break;
							}
						}
					}				
				} catch (InterruptedException e) {
					// TODO �Զ����� catch ��
					e.printStackTrace();
				}
			}
		}
	}
	//��ը�߳�
	class Booms extends Thread{
		int x=0,y=0;
		@Override
		public void run() {		
			for(int i=1;i<=22;i++){
				try {
					Thread.sleep(10);
					boom.add(new Boom(new ImageIcon("./com/booms/"+i+".png"),x,y));
				} catch (InterruptedException e) {
					// TODO �Զ����� catch ��
					e.printStackTrace();
					System.out.println("��ը��");
				}
			}
			boom.clear();
		}
	}
	//������������ҵ��ӵ�����
	class AddBullet extends Thread{
		@Override
		public void run() {
			while(true){
				try {
					Thread.sleep(300);
					blist.add(new Bullet(new ImageIcon("./com/bullet/img_bullet_1.png"),myplane.mx+51,myplane.my-35));
				} catch (InterruptedException e) {
					// TODO �Զ����� catch ��
					e.printStackTrace();
				}
			}
		}
	}
	//�����������boss�ӵ�����
	class AddBossBullet extends Thread{
		@Override
		public void run() {
			while(true){
				try {
					Thread.sleep(2000);
					bbullet.add(new BossBullet(new ImageIcon("./com/bullet/bu02_01.png"),boss.x+102,boss.y+160));
				} catch (InterruptedException e) {
					// TODO �Զ����� catch ��
					e.printStackTrace();
				}
			}
		}
	}
	//�ҵ��ӵ��ƶ��߳�
	class MoveBullet extends Thread{		
		@Override
		public void run() {
			while(true){
				try {
					Thread.sleep(10);
					//����ÿһ���ӵ�
					for(int i=0;i<blist.size();i++){
						((Bullet)blist.get(i)).by-=3;
					}
				} catch (InterruptedException e) {
					// TODO �Զ����� catch ��
					e.printStackTrace();
				}
			}
		}
	}
	//boss�ӵ��ƶ��߳�
	class MoveBossBullet extends Thread{		
		@Override
		public void run() {
			while(true){
				try {
					Thread.sleep(20);
					//����ÿһ���ӵ�
					for(int i=0;i<bbullet.size();i++){
						((BossBullet)bbullet.get(i)).y+=3;
					}
				} catch (InterruptedException e) {
					// TODO �Զ����� catch ��
					e.printStackTrace();
				}
			}
		}
	}
	//�򼯺���Ӳ��������߳�
	class AddItem extends Thread{
		@Override
		public void run() {
			while(true){
				try {
					Thread.sleep(time);
					iitem.add(new Item(new ImageIcon("./com/item/img_item_life.png"),0,30));
				} catch (InterruptedException e) {
					// TODO �Զ����� catch ��
					e.printStackTrace();
				}
			}
		}
	}
	//���������ƶ��߳�
	class MoveItem extends Thread{
		@Override
		public void run() {
			// TODO �Զ����ɷ������
			super.run();
			while(true){
				try {
					Thread.sleep(20);
					//����ÿһ����������
					for(int i=0;i<iitem.size();i++){
						((Item)iitem.get(i)).y+=3;
					}
				} catch (InterruptedException e) {
					// TODO �Զ����� catch ��
					e.printStackTrace();
				}
			}
		}
	}
	//Boss�ƶ��߳�
	class MoveBoss extends Thread{
		@Override
		public void run() {
			for(;;){
				try {
					Thread.sleep(30);
					if(boss.x>0&&loop==true){
						boss.x+=2;
						if(boss.x>=250){
							loop=false;
						}
					}
					if(boss.x<=250&&loop==false){
						boss.x-=2;
						if(boss.x<=10){
							loop=true;
						}
					}
					boss.y+=1;
					if(boss.y>50){
						boss.y=50;
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	
	//���������shift֮�ࣩ
	public void keyTyped(KeyEvent e) {
		// TODO �Զ����ɷ������
		
	}
	//���´���
	public void keyPressed(KeyEvent e) {
		//���̿��ƺͱ߽紦��
		if(e.getKeyCode()==KeyEvent.VK_UP&&myplane.my>=50&&flag){
			myplane.my-=speed;
		}
		if(e.getKeyCode()==KeyEvent.VK_DOWN&&myplane.my<=580&&flag){
			myplane.my+=speed;
		}
		if(e.getKeyCode()==KeyEvent.VK_LEFT&&myplane.mx>=8&&flag){
			myplane.mx-=speed;
		}
		if(e.getKeyCode()==KeyEvent.VK_RIGHT&&myplane.mx<=385&&flag){
			myplane.mx+=speed;
		}
		//ʹ�ÿո���ݶ��Ϳ�ʼ��Ϸ
		if(e.getKeyCode()==KeyEvent.VK_SPACE){
			if(flag){
				//��ͣ��Ϸ(��ͣ�߳�)
				mmap.suspend();
				abullet.suspend();
				mbullet.suspend();
				epmove.suspend();
				aeplane.suspend();
				touch.suspend();
				re.suspend();
				aitem.suspend();
				mitem.suspend();
				abbullet.suspend();
				mbbullet.suspend();
				mboss.suspend();
				flag=false;
			}else{
				//��ʼ��Ϸ����ʼ�̣߳�
				mmap.resume();
				abullet.resume();
				mbullet.resume();
				epmove.resume();
				aeplane.resume();
				touch.resume();
				re.resume();
				aitem.resume();
				mitem.resume();
				abbullet.resume();
				mbbullet.resume();
				mboss.resume();
				flag=true;
			}
		}
		
	}
	//�ɿ�����
	public void keyReleased(KeyEvent e) {
		// TODO �Զ����ɷ������
		
	}
	public static void main(String[] args) {
		//MainFrame mframe=new MainFrame();
		WelCome welframe=new WelCome();
		welframe.setVisible(true);
	}
	
	
}
