package com.tjm;

import javax.swing.ImageIcon;

public class MyPlane {
	ImageIcon mpi;
	int x,y,hp;
	public MyPlane() {
		super();
		
	}
	public MyPlane(ImageIcon mpi, int x, int y, int hp) {
		super();
		this.mpi = mpi;
		this.x = x;
		this.y = y;
		this.hp = hp;
	}
	
}
