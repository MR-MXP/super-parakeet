package day02;

import java.util.Scanner;

public class demo06 {
	 public static void main(String[] args)  
	    {  
	        Scanner in = new Scanner(System.in);  
	          
	        System.out.println("请输入原始高度。");  
	        double s = in.nextDouble();  
	        System.out.println("要求第几次落地后的距离。");  
	        int n = in.nextInt();  
	          
	        double total = s;  
	        System.out.printf("第%d次落地后共走的距离是：" , n);  
	        if(n == 1)  
	        {  
	            System.out.println(total);  
	            System.out.printf("第%d次反弹的距离是%f。", n, s / 2);  
	        }  
	        else  
	        {  
	            for(int i = 1; i < n; i++)  
	            {  
	                s = s / 2;  
	                total += 2 * s;         //一上一下共两倍的弹跳距离  
	            }  
	            System.out.print(total);  
	            System.out.println();  
	            System.out.printf("第%d次反弹的距离是%f。", n, s / 2);  
	        }  
	    }  
}
