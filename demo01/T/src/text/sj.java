package text;

import java.util.Random;

public class sj {
	public static void main(String[] args) {
		//创建一个随机数
		Random r=new Random();
		//创建一个长度为9的数组
		int[] a=new int[9];
		for(int i=0;i<a.length;i++){
			//给元素赋随机值
			a[i]=r.nextInt(10);
			for(int j=0;j<i;j++){
				//判断随机值是否重复
				if(a[i]==a[j]){
					i--;
					break;
				}
			}
		}
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+"  ");
		}
	}
}
