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
		System.out.println("��"+width+" "+"�ߣ�"+height);
	}
	//��ȡ��ǰx,y����
	public void coordinate(){
		x=r.nextInt(500);
		y=r.nextInt(400);
		System.out.println("��ǰx,y������"+x+" "+y);
	}
	//�޸Ŀ��
	public void cwh(){
		System.out.println("������ı���");
		width=s.nextInt();
		height=s.nextInt();
		System.out.println("��"+width+" "+"�ߣ�"+height);
	}
	//�ı䵱ǰ����
	public void cc(){
		System.out.println("������x,y������");
		x=s.nextInt();
		y=s.nextInt();
		System.out.println("�ı��x,y������"+x+" "+y);
	}
	public static void main(String[] args) {
		Dimension d1=new Dimension();
		d1.wh();
		d1.coordinate();
		d1.cwh();
		d1.cc();
	}
}
