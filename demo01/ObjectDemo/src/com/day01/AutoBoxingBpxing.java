package com.day01;

public class AutoBoxingBpxing {
	public static void main(String[] args) {
		int a=5;
		Integer b=new Integer(a);
		float f=b.floatValue();
		String s=String.valueOf(b+"sdas");
		System.out.println(a);
		System.out.println(b);
		System.out.println(f);
		System.out.println(s);
	}
}
