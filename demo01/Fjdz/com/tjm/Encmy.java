package com.tjm;

import java.util.Random;

import javax.swing.ImageIcon;

public class Encmy {
	ImageIcon eyi;
	int x,y;
	Random r=new Random();
	public Encmy(ImageIcon eyi, int x, int y) {
		super();
		this.eyi = eyi;
		this.x = r.nextInt(330)+x;
		this.y = y;		
	}
	public Encmy() {
		super();
	}
	
}
