package day02;

import java.util.Scanner;

public class demo06 {
	 public static void main(String[] args)  
	    {  
	        Scanner in = new Scanner(System.in);  
	          
	        System.out.println("������ԭʼ�߶ȡ�");  
	        double s = in.nextDouble();  
	        System.out.println("Ҫ��ڼ�����غ�ľ��롣");  
	        int n = in.nextInt();  
	          
	        double total = s;  
	        System.out.printf("��%d����غ��ߵľ����ǣ�" , n);  
	        if(n == 1)  
	        {  
	            System.out.println(total);  
	            System.out.printf("��%d�η����ľ�����%f��", n, s / 2);  
	        }  
	        else  
	        {  
	            for(int i = 1; i < n; i++)  
	            {  
	                s = s / 2;  
	                total += 2 * s;         //һ��һ�¹������ĵ�������  
	            }  
	            System.out.print(total);  
	            System.out.println();  
	            System.out.printf("��%d�η����ľ�����%f��", n, s / 2);  
	        }  
	    }  
}
