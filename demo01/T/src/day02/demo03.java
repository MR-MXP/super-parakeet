package day02;

import java.util.Scanner;

public class demo03 {
	public static void main(String []args){
		         Scanner s=new Scanner(System.in);
		         System.out.println("键入一个正整数：");
		         int n=s.nextInt();
		         int  k=2;  //定义一个最小的质因数 
		         System.out.print(n+"="); 
		         while (k<=n){    //进行循环判断   
		             if(k==n){ 
		                 System.out.print(n);
		                 break;
		             }else if (n%k==0){  
		                 System.out.print(k+"*");
		                 n=n/k;
		             }else k++; 
		         }
		     }
		 }
