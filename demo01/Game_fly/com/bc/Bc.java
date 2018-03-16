package com.bc;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Bc extends JFrame{
	Container ct; 
	BufferedImage bg = null; 
	public Bc(){
		this.setTitle("1974");
		this.setSize(512, 768);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(3);
		new imgbc().start();
		try {  
		    bg = ImageIO.read(new File("src/img/img_bg_level_1.jpg"));  
		}catch(Exception e) {  
		    e.printStackTrace();  
		} 
	}
	

	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(bg, 0, 0, null);
	}
	class imgbc extends Thread{
		@Override
		public void run() {
			// TODO Auto-generated method stub   
			
			for(;;){
				try {
					sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	public static void main(String[] args) {
		new Bc().setVisible(true);
		
	}
}
