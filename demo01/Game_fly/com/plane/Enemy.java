package com.plane;

import java.util.Random;

import javax.swing.ImageIcon;

public class Enemy {
	ImageIcon  ei;
	int x;
	int y;
	Random r=new Random();
	public Enemy(ImageIcon ei, int x, int y) {
		super();
		// TODO �Զ����ɹ��캯�����
		this.ei = ei;
		this.x = r.nextInt(480)+x;
		this.y = y;
	}
	public Enemy() {
		super();
		// TODO �Զ����ɹ��캯�����
	}
	
}
