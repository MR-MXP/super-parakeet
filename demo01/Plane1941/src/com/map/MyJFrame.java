package com.map;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyJFrame extends JFrame{
	public MyJFrame(){
		this.setTitle("1941");
		this.setSize(512,720);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(3);
	}
	@Override
	public void paint(Graphics g) {
		g.drawImage(new ImageIcon("src/img/map/img_bg_level_2.jpg").getImage(), 0, 0, null);
	}
	public static void main(String[] args) {
		new MyJFrame().setVisible(true);
	}
}
