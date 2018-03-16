package obj01;

import java.util.Random;
import java.util.Scanner;

public class Dimension {
	int width;
	int height;
	int x,y;
	Random r=new Random();
	Scanner s=new Scanner(System.in);
	public void wh(){
		width=r.nextInt(500);
		height=r.nextInt(500);
		System.out.println("宽："+width+" "+"高："+height);
	}
	//获取当前x,y坐标
	public void coordinate(){
		x=r.nextInt(500);
		y=r.nextInt(400);
		System.out.println("当前x,y的坐标"+x+" "+y);
	}
	//修改宽高
	public void cwh(){
		System.out.println("请输入改变宽高");
		width=s.nextInt();
		height=s.nextInt();
		System.out.println("宽："+width+" "+"高："+height);
	}
	//改变当前坐标
	public void cc(){
		System.out.println("请输入x,y的坐标");
		x=s.nextInt();
		y=s.nextInt();
		System.out.println("改变后x,y的坐标"+x+" "+y);
	}
	public static void main(String[] args) {
		Dimension d1=new Dimension();
		d1.wh();
		d1.coordinate();
		d1.cwh();
		d1.cc();
	}
}
