package day2;

import java.util.Scanner;

public class a {
	public static void main(String[] args) {
		int uage;
		String ugender;
		Scanner gender=new Scanner(System.in);
		Scanner age=new Scanner(System.in);
		System.out.println("�������Ա�");
		ugender=gender.next();
		
		
		if(ugender.equals("��")){
			System.out.println("���������䣺");
			uage=age.nextInt();
			if(uage>22){
				System.out.println("�ﵽ�������");
			}else{
				System.out.println("δ�ﵽ���");
			}
		}else if(ugender.equals("Ů")){
			System.out.println("���������䣺");
			uage=age.nextInt();
			if(uage>20){
				System.out.println("�ﵽ�������");
			}else{
				System.out.println("δ�ﵽ���");
			}
		}
	}
}
