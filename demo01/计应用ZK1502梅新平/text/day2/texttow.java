package day2;

import java.util.Scanner;

public class texttow {
	public static void main(String[] args) {
		double i,j;
		Scanner x=new Scanner(System.in);
		Scanner y=new Scanner(System.in);
		i=x.nextDouble();
		j=y.nextDouble();
//		sum=i+j;
//		cha=i-j;
//		ji=i*j;
//		shang=i/j;
		System.out.println(("�������Ϊ"+i)+","+j);
		System.out.println("���ǵĺ�Ϊ"+(i+j));
		System.out.println("���ǵĺͲ�"+ (i-j));
		System.out.println("���ǵĺͻ�"+ (i*j));
		System.out.println("���ǵĺ���"+ (i/j));
	}

}
