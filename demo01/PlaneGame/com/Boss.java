package com;

import javax.swing.ImageIcon;

public class Boss {
	ImageIcon ii;
	int x;
	int y;
	int hp;
	//���캯��
	public Boss(ImageIcon ii, int x, int y, int hp) {
		super();
		this.ii = ii;
		this.x = x;
		this.y = y;
		this.hp = hp;
	}
	public Boss() {
		super();
	}
}
