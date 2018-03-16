package arr01;

import java.util.Scanner;

public class demo6 {
	public static void main(String[] args) {
		int b;
		boolean p=false;
		String[] n=new String[5];
		Scanner s=new Scanner(System.in);
		System.out.println("*******************录入用户信息*******************");
		for(int i=0;i<n.length;i++){
			System.out.println("请输入第"+(i+1)+"个用户信息：");
			n[i]=s.next();
		}

		for(b=0;b<5;b++){
			System.out.println("1：查询全部用户信息\t2:根据用户名查询\t3:修改用户信息\t4:删除用户信息");
			b=s.nextInt();
		switch (b) {
		case 1:
			System.out.println("***********************查询全部用户信息***********************");
			for(int i=0;i<n.length;i++){
				System.out.println("第"+(i+1)+"个用户信息：");
				System.out.println(n[i]);
			}
			break;
		case 2:
			System.out.println("***********************请输入要查询的用户信息***********************");
			String pname=s.next();
			for(int i=0;i<n.length;i++){
				if(pname.equals(n[i])){
					p=true;
					System.out.println("用户储存在当前第"+(i+1)+"个位置");
				}
			}
			if(p==false){
				System.out.println("不存在");
			}
			p=false;
			break;
		case 3:
			System.out.println("***********************请输入要修改的用户名信息***********************");
			String xname=s.next();
			for(int i=0;i<n.length;i++){
				if(xname.equals(n[i])){
					p=true;
					System.out.println("请输入新的用户信息！");
					String nname=s.next();
					n[i]=nname;
				}
			}
			if(p==false){
				System.out.println("不存在");
			}
			p=false;
		break;
		default:
			System.out.println("***********************请输入要删除的用户名***********************");
			String sname=s.next();
			for(int i=0;i<n.length;i++){
				if(sname.equals(n[i])){
					p=true;
					n[i]=null;
				}
			}
			if(p==false){
				System.out.println("不存在");
			}
			p=false;
			break;
			}
			b=0;
		}
		
	}
}
