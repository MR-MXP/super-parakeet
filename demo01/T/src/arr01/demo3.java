package arr01;

import java.util.Arrays;
import java.util.Scanner;

import text.a;

public class demo3 {
	public static void main(String[] args) {
		int b;
		boolean p=false;
		String[] n=new String[5];
		//输入用户信息
		Scanner s=new Scanner(System.in);
		
		for(int i=0;i<n.length;i++){
			System.out.println("请输入第"+(i+1)+"个用户名：");
			String name=s.next();
			for(int j=i;j<i+1;j++){
				n[i]=name;
			}
		}
		System.out.println("输入信息完毕");

		for(b=0;b<=4;b++){
			System.out.println("1：查询全部用户信息\t2:根据用户名查询\t3:修改用户信息\t4:删除用户信息");
			b=s.nextInt();

			
		//查询所有用户信息
		if(b==1){
			System.out.println("***********************查询全部用户信息***********************");
			for(int i=0;i<n.length;i++){
				System.out.println("第"+(i+1)+"个用户信息：");
				System.out.println(n[i]);
			}
		}
		
		//根据用户查询用户信息
		if(b==2){
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
		}
		
		//修改用户名信息
			if(b==3){
				System.out.println("***********************请输入要修改的用户名信息***********************");
				String xname=s.next();
				for(int i=0;i<n.length;i++){
					if(xname.equals(n[i])){
						p=true;
						System.out.println("是否修改用户信息，请输入是或否:");
						String yn=s.next();
						if(yn.equals("是")){
							System.out.println("请输入新的用户信息！");
							String nname=s.next();
							n[i]=nname;
							System.out.println("当前用户名为："+n[i]);
						}else if(yn.equals("否")){
							System.out.println("不做任何操作!");
						}else{
							System.out.println("请不要输其它的emmmm!");
						}
					}

				}
				if(p==false){
					System.out.println("不存在");
				}
				p=false;
			}

		//删除用户信息
			if(b==4){
				System.out.println("***********************请输入要删除的用户名***********************");
				String sname=s.next();
				for(int i=0;i<n.length;i++){
					if(sname.equals(n[i])){
						p=true;
						System.out.println("是否删除用户信息，请输入是或否:");
						String yn=s.next();
						if(yn.equals("是")){
							n[i]=null;
							System.out.println("当前用户名为："+n[i]);
						}
						else if(yn.equals("否")){
							System.out.println("不做任何操作!");
						}
						else{
							System.out.println("请不要输其它的emmmm!");
						}
					}
				}
				if(p==false){
					System.out.println("不存在");
				}
				p=false;
				b=0;
			}
		}		
//		System.out.println(Arrays.toString(n));
		}
	}
