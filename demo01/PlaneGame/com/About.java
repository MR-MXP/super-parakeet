package com;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class About extends JFrame implements MouseListener{
	Container c;
	//���캯��
	public About(){
		this.setTitle("�ɻ���ս");
		this.setSize(512,700);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(3);
		//����������¼�
		this.addMouseListener(this);
		c=this.getContentPane();
		c.setLayout(new BorderLayout());
	}
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		g.drawImage(new ImageIcon("./com/map/about.png").getImage(), 0, 0, null);
	}
	

	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		//�жϵ����ʼ��ť���򣬷��ؿ�ʼ����
		if(e.getX()>=38&&e.getX()<=90&&e.getY()>=50&&e.getY()<=100){
			WelCome mwel=new WelCome();
			//�رյ�ǰ����
			About.this.dispose();
			mwel.setVisible(true);		
		}
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}

