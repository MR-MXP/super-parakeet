package day3;

import java.util.Scanner;

public class a {
	/*
	 * �û�����ٷ��Ƶĳɼ�����ӡ�ȼ�
	 * >90=A+
	 * >80=A
	 * >70=B
	 * >60=C
	 * <60=������
	 * */
	public static void main(String[] args) {
		int ucj;
		Scanner cj=new  Scanner(System.in);
		System.out.println("������1~100��������");
		ucj = cj.nextInt();
//		if(ucj>90||ucj==90){
//			System.out.println("A+");
//		}else if(ucj>80||ucj==80){
//			System.out.println("A");
//		}else if(ucj>70||ucj==70){
//			System.out.println("B");
//		}else if(ucj>60||ucj==60){
//			System.out.println("C");
//		}else{
//			System.out.println("������");
//		}
		switch (ucj/10) {
		case 10:
		case 9:
			System.out.println("A+");
			break;
		case 8:
			System.out.println("A");
			break;
		case 7:
			System.out.println("B");
			break;
		case 6:
			System.out.println("C");
			break;
		default:
			System.out.println("������");
			break;
		}
	}
}
