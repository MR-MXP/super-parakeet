package com.day01;

public class AutoBoxing {
	public static void main(String[] args) {
		//字符串转换为其他数据类型
		String intStr="123";
		int it2 = Integer.parseInt(intStr);//通过parseInt()
		System.out.println(it2);
		
		int it3 = new Integer(intStr);//通过构造方法的形式
		System.out.println(it3);
		//将其他数据类型转换为字符串
		String ftStr= String.valueOf(12.1231f);   //valeOf()方法
		System.out.println(ftStr);
		
		int i=4;
		System.out.println(i+" ");   //字符串连接
	}
}
