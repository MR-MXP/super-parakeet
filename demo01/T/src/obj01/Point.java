package obj01;

import java.util.Random;
import java.util.Scanner;

public class Point {
	Random r=new Random();
	int x,y;
	Scanner s=new Scanner(System.in);
	//��ȡ��ǰx,y����
	public void coordinate(){
		x=r.nextInt(500);
		y=r.nextInt(400);
		System.out.println("��ǰx,y������"+x+" "+y);
	}
	//�ı䵱ǰ����
	public void cc(){
		System.err.println("������x,y������");
		x=s.nextInt();
		y=s.nextInt();
		System.out.println("�ı��x,y������"+x+" "+y);
	}
	public static void main(String[] args) {
		Point p1=new Point();
		p1.coordinate();
		p1.cc();
	}
}
