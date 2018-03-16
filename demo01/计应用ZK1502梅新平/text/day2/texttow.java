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
		System.out.println(("输入的数为"+i)+","+j);
		System.out.println("它们的和为"+(i+j));
		System.out.println("它们的和差"+ (i-j));
		System.out.println("它们的和积"+ (i*j));
		System.out.println("它们的和商"+ (i/j));
	}

}
