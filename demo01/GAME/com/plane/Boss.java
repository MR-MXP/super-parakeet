package com.plane;

import javax.swing.ImageIcon;

public class Boss {
	ImageIcon ii;
	int x;
	int y;
	int hp;
	public Boss(ImageIcon ii, int x, int y,int hp) {
		super();
		// TODO 自动生成构造函数存根
		this.ii = ii;
		this.x = x;
		this.y = y;
		this.hp=hp;
	}
	public Boss() {
		super();
		// TODO 自动生成构造函数存根
	}
}
