package com;

import javax.swing.ImageIcon;

public class MyPlane {
	ImageIcon ii;
	int mx,my,hp;
	public MyPlane( ImageIcon ii,int mx, int my,int hp) {
		super();
		this.ii = ii;
		this.mx = mx;
		this.my = my;
		this.hp=hp;
	}
	//���캯��
	public MyPlane(){
		super();
	}
}
