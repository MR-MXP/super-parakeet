package text;

import java.util.Scanner;

public class mxp {
	public static void main(String[] args) {
		int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.println("请输入三个整数:");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		if(a>b){
			if(c>a){
				System.out.println(b+" "+a+" "+c);
			}else if(c<b){
				System.out.println(c+" "+b+" "+a);
			}else{
				System.out.println(b+" "+c+" "+a);
			}
		}
		else{
			if(c<a){
                System.out.println(c+" "+a+" "+b);
            }else if(c>b){
                System.out.println(a+" "+b+" "+c);
            }else{
                System.out.println(a+" "+c+" "+b);
            }
			
		}
	}
}
