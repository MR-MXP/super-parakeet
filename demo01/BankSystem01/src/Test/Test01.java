package Test;

import java.util.Scanner;

import User.OrdinaryUser;
import User.VipUser;

public class Test01 {
	public static void main(String[] args) {
		long Uid;
		long Upassword;
		Scanner s=new Scanner(System.in);
		//创建两个数组存储数据
		OrdinaryUser[] Ou=new OrdinaryUser[3];
		Ou[0]=new OrdinaryUser("张三",100001L, 100001L, 1000,false);
		Ou[1]=new OrdinaryUser("李四",100002L, 100002L, 2000,false);
		Ou[2]=new OrdinaryUser("王麻子",100003L, 100003L, 10000,false);
		VipUser[] Vu=new VipUser[3];
		Vu[0]=new VipUser("李雷", 200001L,200001L, 15000,true);
		Vu[1]=new VipUser("韩梅梅", 200002L,200002L, 100000,true);
		System.out.println("************欢迎使用************");
		System.out.print("请输入用户ID：");
		Uid=s.nextLong();
		System.out.print("请输入用户密码：");
		Upassword=s.nextLong();
		//普通用户
		for(int i=0;i<Ou.length;i++){
			OrdinaryUser UOu=Ou[i];
			if(UOu.getID()==Uid&&UOu.getPassword()==Upassword){
				System.out.println("用户:"+UOu.getName());
				UOu.menu(UOu);
			}
		}
		//VIP用户
		for(int i=0;i<Vu.length-1;i++){
			VipUser UVu=Vu[i];
			if(UVu.getID()==Uid&&UVu.getPassword()==Upassword){
				System.out.println("用户:"+UVu.getName());
				UVu.menu(UVu);
			}
		}
	}
}
