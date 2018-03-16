package text;

import java.util.Scanner;

public class three {
	public static void main(String[] args) {
		int[] a=new int[20];
		int[] b=new int[a.length+1];
		int x,y;
		System.out.println("这里有20个数字：");
		for(int i=0;i<a.length;i++){
			a[i]=i;
			b[i]=a[i];
			System.out.print(a[i]+" ");
		}
		System.out.println("");
		System.out.println("请输入插入的数字:");
		Scanner s=new Scanner(System.in);
		x=s.nextInt();
		System.out.println("请输入想插入的位置:");
		y=s.nextInt()-1;
		for(int i=0;i<b.length;i++){   //给b数组赋值
			//y位置前的数据不变
			if(i<y){
				b[i]=a[i];
			}else if(i==y){
				b[i]=x;
			}else{
				b[i]=a[i-1];
			}
			System.out.print(b[i]+"  ");
		}
		
		
		
		
	}
}
