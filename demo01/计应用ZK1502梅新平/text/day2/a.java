package day2;

import java.util.Scanner;

public class a {
	public static void main(String[] args) {
		int uage;
		String ugender;
		Scanner gender=new Scanner(System.in);
		Scanner age=new Scanner(System.in);
		System.out.println("请输入性别：");
		ugender=gender.next();
		
		
		if(ugender.equals("男")){
			System.out.println("请输入年龄：");
			uage=age.nextInt();
			if(uage>22){
				System.out.println("达到结婚年龄");
			}else{
				System.out.println("未达到结婚");
			}
		}else if(ugender.equals("女")){
			System.out.println("请输入年龄：");
			uage=age.nextInt();
			if(uage>20){
				System.out.println("达到结婚年龄");
			}else{
				System.out.println("未达到结婚");
			}
		}
	}
}
