package com;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class WelCome extends JFrame implements MouseListener{
	Container c;
	//���캯��
	public WelCome(){
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
		g.drawImage(new ImageIcon("./com/map/bg.png").getImage(),0,0,null);
	}
	public void mouseClicked(MouseEvent e) {
		// TODO �Զ����ɷ������
		//�жϵ����ʼ��ť���򣬿�ʼ��Ϸ
		if(e.getX()>=169&&e.getX()<=357&&e.getY()>=563&&e.getY()<=604){
			MainFrame mframe=new MainFrame();
			//�رյ�ǰ����
			WelCome.this.dispose();
			mframe.setVisible(true);		
		}	
		//�жϵ����ʼ��ť������Ϸ����
		if(e.getX()>=0&&e.getX()<=60&&e.getY()>=640&&e.getY()<=695){
			Help mhelp=new Help();
			//�رյ�ǰ����
			WelCome.this.dispose();
			mhelp.setVisible(true);		
		}
		//�жϵ����ʼ��ť������Ϸ����
		System.out.println(e.getY());
		if(e.getX()>=80&&e.getX()<=135&&e.getY()>=640&&e.getY()<=695){
			About mabout=new About();
			//�رյ�ǰ����
			WelCome.this.dispose();
			mabout.setVisible(true);		
		}
		//�жϵ����ʼ��ť�����˳���Ϸ
		if(e.getX()>=453&&e.getX()<=510&&e.getY()>=640&&e.getY()<=695){
			//�ر������
			System.exit(0);
		}
	}
	public void mousePressed(MouseEvent e) {
		// TODO �Զ����ɷ������
		
	}
	public void mouseReleased(MouseEvent e) {
		// TODO �Զ����ɷ������
		
	}
	public void mouseEntered(MouseEvent e) {
		// TODO �Զ����ɷ������
		
	}
	public void mouseExited(MouseEvent e) {
		// TODO �Զ����ɷ������
		
	}
}
