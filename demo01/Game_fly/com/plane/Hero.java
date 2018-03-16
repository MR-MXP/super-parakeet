package com.plane;

import javax.swing.ImageIcon;

public class Hero {
	ImageIcon hi;
	int x;
	int y;
	int hp;
	public Hero(ImageIcon li, int x, int y,int hp) {
		super();
		// TODO 自动生成构造函数存根
		this.hi = li;
		this.x = x;
		this.y = y;
		this.hp=hp;
	}
	public Hero() {
		super();
		
	}
}
