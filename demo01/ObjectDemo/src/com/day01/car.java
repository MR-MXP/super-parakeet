package com.day01;

public class car {
	{
		System.out.println("第一条语句");
	}
	public car(){
		
	}
	public car(String name){
		System.out.println("我的名字叫"+name);
	}
	static{
		System.out.println("第二条语句");
	}
	public static void main(String[] args) {
		car c=new car();
		car c1=new car("Tom");
		Double  d = new Double(5.1);
        byte d1 = d.byteValue();
        System.out.println(d1);
	}
}
