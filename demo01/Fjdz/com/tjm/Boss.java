package com.tjm;

import javax.swing.ImageIcon;

public class Boss {
	ImageIcon boi;
	int x,y,hp;
	public Boss(ImageIcon boi, int x, int y,int hp) {
		super();
		this.boi = boi;
		this.x = x;
		this.y = y;
		this.hp=hp;
	}
	public Boss() {
		super();
	}
	
}
