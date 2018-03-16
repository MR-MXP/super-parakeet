package obj01;

import java.util.Random;
import java.util.Scanner;

public class Point {
	Random r=new Random();
	int x,y;
	Scanner s=new Scanner(System.in);
	//获取当前x,y坐标
	public void coordinate(){
		x=r.nextInt(500);
		y=r.nextInt(400);
		System.out.println("当前x,y的坐标"+x+" "+y);
	}
	//改变当前坐标
	public void cc(){
		System.err.println("请输入x,y的坐标");
		x=s.nextInt();
		y=s.nextInt();
		System.out.println("改变后x,y的坐标"+x+" "+y);
	}
	public static void main(String[] args) {
		Point p1=new Point();
		p1.coordinate();
		p1.cc();
	}
}
