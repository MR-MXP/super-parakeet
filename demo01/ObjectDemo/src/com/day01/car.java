package com.day01;

public class car {
	{
		System.out.println("��һ�����");
	}
	public car(){
		
	}
	public car(String name){
		System.out.println("�ҵ����ֽ�"+name);
	}
	static{
		System.out.println("�ڶ������");
	}
	public static void main(String[] args) {
		car c=new car();
		car c1=new car("Tom");
		Double  d = new Double(5.1);
        byte d1 = d.byteValue();
        System.out.println(d1);
	}
}
