package om.demo01;

import java.util.Scanner;

public class demo01 {
	public static void main(String[] args) {
		String Name;
		String Cname;
		Scanner s=new Scanner(System.in);
		String[] P=new String[10];
		//添加用户
		System.out.println("************添加用户信息************");
		for(int i=0;i<P.length;i++){
			System.out.println("请输入第"+(i+1)+"用户");
			Name=s.next();
			P[i]=Name;
		}
		//查找全部用户
		System.out.println("************显示全部用户************");
		for(int i=0;i<P.length;i++){
			System.out.println("第"+(i+1)+"用户");
			System.out.println("用户名："+P[i]);
		}
		//查找单个用户
		System.out.print("请输入查找的用户名：");
		Cname=s.next();
		for(int i=0;i<P.length;i++){
			if(Cname.equals(P[i])){
				System.out.println("第"+(i+1)+"用户");
				System.out.println("姓名："+P[i]);
			}
		}
		
	}
}