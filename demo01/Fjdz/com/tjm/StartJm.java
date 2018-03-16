package com.tjm;

import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StartJm extends JFrame implements MouseListener{
	JButton b;
	Container c;
	JPanel jp;
	JLabel bg,start,about,help,exit;
	public StartJm(){		
		
	}	
	public void Xs(){		
		this.setSize(400,600);
		this.setLocationRelativeTo(null);
		this.setTitle("飞机大战");
		this.setDefaultCloseOperation(3);
		this.setResizable(false);		
		c=this.getContentPane();
		c.setLayout(null);
		start = new JLabel(new ImageIcon("./img/start.png"));
		start.setBounds(100,350,200,50);
		start.addMouseListener(this);
		c.add(start);
		about = new JLabel(new ImageIcon("./img/about.png"));
		about.setBounds(100,450,200,50);
		about.addMouseListener(this);
		c.add(about);
		help = new JLabel(new ImageIcon("./img/help.png"));
		help.setBounds(100,400,200,50);
		help.addMouseListener(this);
		c.add(help);
		exit = new JLabel(new ImageIcon("./img/exit.png"));
		exit.setBounds(100,500,200,50);
		exit.addMouseListener(this);
		c.add(exit);
		bg=new JLabel(new ImageIcon("./img/fm.jpg"));
		bg.setBounds(0,0,400,600);
		c.add(bg);
				
		this.setVisible(true);		
	}

	
	public void mouseClicked(MouseEvent e) {
		// TODO 自动生成的方法存根
		if(e.getSource()==start){
			StartJm.this.dispose();
			new MainFrame().setVisible(true);
		}
		if(e.getSource()==about){
			StartJm.this.dispose();
			
		}
		if(e.getSource()==help){
			StartJm.this.dispose();
			
		}
		if(e.getSource()==exit){
			System.exit(0);
			
		}
		
	}
	
	public void mousePressed(MouseEvent e) {
		// TODO 自动生成的方法存根
		
	}
	
	public void mouseReleased(MouseEvent e) {
		// TODO 自动生成的方法存根
		
	}
	
	public void mouseEntered(MouseEvent e) {
		// TODO 自动生成的方法存根
		
	}
	
	public void mouseExited(MouseEvent e) {
		// TODO 自动生成的方法存根
		
	}
	
}
