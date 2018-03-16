package test;

import java.util.Scanner;

import entity.User;
import biz.UserBiz;

public class UserTest {
/*	static void showAllUser(User[] users){
		for(int i=0;i<users.length;i++){
			System.out.print("第"+(i+1)+"个用户为：   ");
			System.out.print("用户名："+users[i].getname()+";");
			System.out.print("性别："+users[i].getSex()+";");
			System.out.print("年龄："+users[i].getAge()+";");
			System.out.print("电话："+users[i].getTnum()+";");
			System.out.print("身份证："+users[i].getIDCard()+";");
			System.out.print("邮件："+users[i].getEmail()+";");
			System.out.println();
		}
	}*/
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		UserBiz ub=new UserBiz();
		User u=new User();
		//添加用户信息
		ub.addUser(u);
		//显示用户信息
		ub.showUser();
		//查找用户信息
		System.out.println("*********************查找用户信息*********************");
		System.out.print("请输入要查找的用户名：");
		String name=s.next();
		ub.findUser(name);
		//修改用户信息
		System.out.println("*********************修改用户信息*********************");
		System.out.println("请输入要修改用户的身份证号：");
		String IdCard=s.next();
		User u1=new User("name","男",12,"1513213213",IdCard,"1123132123");
		ub.modifyUser(u1);
		
		//删除用户信息
		System.out.println("*********************删除用户信息*********************");
		System.out.println("请输入要删除用户的身份证号：");
		ub.delUser(s.next());
		ub.showUser();
		//排序显示
	}
}
