package obj01;

import java.util.Random;
import java.util.Scanner;

public class Rectangle {
	int x,y;
	int size;
	int width=5,height=5;
	Random r=new Random();
	Scanner s=new Scanner(System.in);
	//当前坐标
	public void coordinate(){
		x=r.nextInt(500);
		y=r.nextInt(400);
		System.out.println("当前x,y的坐标"+x+" "+y);
	}
	//获取矩形大小
	public void jdx(){
		width=r.nextInt(200);
		height=r.nextInt(200);
		size=width*height;
		System.out.println("矩形的大小："+size);
	}
	 //矩形的宽
	public int dx(){
		return width;		
	}
	//改变当前坐标
	public void cc(){
		System.out.println();
		System.out.println("请输入x,y的坐标");
		x=s.nextInt();
		y=s.nextInt();
		System.out.println("改变后x,y的坐标:"+x+" "+y);
	}
	//改变矩形大小
	public int cs(){
		System.out.println("改变矩形大小");
		width=s.nextInt();
		height=s.nextInt();
		size=width*height;
		return size;
	}
	public static void main(String[] args) {
		Rectangle r1=new Rectangle();
		//获取坐标
		r1.coordinate();
		//矩形的大小
		r1.jdx();
		//返回宽度
		System.out.println("当前宽度:"+r1.dx());		
		//改变当前坐标
		r1.cc();
		//改变矩形大小
		System.out.println("改变后矩形大小"+r1.cs());
	}
}
