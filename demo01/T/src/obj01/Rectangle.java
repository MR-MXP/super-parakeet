package obj01;

import java.util.Random;
import java.util.Scanner;

public class Rectangle {
	int x,y;
	int size;
	int width=5,height=5;
	Random r=new Random();
	Scanner s=new Scanner(System.in);
	//��ǰ����
	public void coordinate(){
		x=r.nextInt(500);
		y=r.nextInt(400);
		System.out.println("��ǰx,y������"+x+" "+y);
	}
	//��ȡ���δ�С
	public void jdx(){
		width=r.nextInt(200);
		height=r.nextInt(200);
		size=width*height;
		System.out.println("���εĴ�С��"+size);
	}
	 //���εĿ�
	public int dx(){
		return width;		
	}
	//�ı䵱ǰ����
	public void cc(){
		System.out.println();
		System.out.println("������x,y������");
		x=s.nextInt();
		y=s.nextInt();
		System.out.println("�ı��x,y������:"+x+" "+y);
	}
	//�ı���δ�С
	public int cs(){
		System.out.println("�ı���δ�С");
		width=s.nextInt();
		height=s.nextInt();
		size=width*height;
		return size;
	}
	public static void main(String[] args) {
		Rectangle r1=new Rectangle();
		//��ȡ����
		r1.coordinate();
		//���εĴ�С
		r1.jdx();
		//���ؿ��
		System.out.println("��ǰ���:"+r1.dx());		
		//�ı䵱ǰ����
		r1.cc();
		//�ı���δ�С
		System.out.println("�ı����δ�С"+r1.cs());
	}
}
