package obj;

import java.util.Scanner;
	
public class Mouse {
	String  name;
	int age;
	String color;
	Scanner s=new Scanner(System.in);
	public void show(){
		name=("jack");
		color=("灰色");
		age=19;
		System.out.println("我是"+color+"老鼠"+name+" "+age+"岁");
	}
}
