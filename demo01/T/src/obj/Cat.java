package obj;

import java.util.Scanner;
//类
/*
 * 
 */
public  class Cat {
	String  name;
	int age;
	String color;
	Scanner s=new Scanner(System.in);
	//构造方法:[修饰符] 方法名：与类名相同(){}
	public Cat(){
		
	}
	public Cat(String name){
		
	}
	public Cat(int age){
		
	}
	//方法：[修饰符] 返回值类型(无返回值void) 方法名(){}{}
	public void show(){
		System.out.println("我是"+color+"猫"+name+" "+age+"岁");
		
	}
/*	public void js(){
		System.out.println("想知道我的叫声吗？");
		String yn;
		yn=s.next();
		if(yn.equals("想")){
			System.out.println("喵，喵，喵");
		}else{
			System.out.println("不听拉到");
		}	
	}*/
/*	public static void main(String[] args) {

		Cat m=new Cat();
		m.name=("tom");
		m.color=("蓝色");
		m.age=20;
		m.show();
//		m.js();
	}*/
}
