package obj;

import java.util.Scanner;
//��
/*
 * 
 */
public  class Cat {
	String  name;
	int age;
	String color;
	Scanner s=new Scanner(System.in);
	//���췽��:[���η�] ����������������ͬ(){}
	public Cat(){
		
	}
	public Cat(String name){
		
	}
	public Cat(int age){
		
	}
	//������[���η�] ����ֵ����(�޷���ֵvoid) ������(){}{}
	public void show(){
		System.out.println("����"+color+"è"+name+" "+age+"��");
		
	}
/*	public void js(){
		System.out.println("��֪���ҵĽ�����");
		String yn;
		yn=s.next();
		if(yn.equals("��")){
			System.out.println("����������");
		}else{
			System.out.println("��������");
		}	
	}*/
/*	public static void main(String[] args) {

		Cat m=new Cat();
		m.name=("tom");
		m.color=("��ɫ");
		m.age=20;
		m.show();
//		m.js();
	}*/
}
