package biz;

import java.util.Scanner;

import entity.User;

public class UserBiz {
	User[] users=new User[3];
	Scanner s=new Scanner(System.in);
	//增加用户信息
	public void addUser(User user){
		for(int i=0;i<users.length;i++){
			users[i]=new User();
		}
		for(int i=0;i<this.users.length;i++){
			System.out.println("*********************请输入第"+(i+1)+"个用户信息*********************");
			System.out.print("请输入姓名：");
			users[i].setname(s.next());
			System.out.print("请输入性别：");
			users[i].setSex(s.next());
			System.out.print("请输入年龄：");
			users[i].setAge(s.nextInt());
			System.out.print("请输入电话：");
			users[i].setTnum(s.next());
			System.out.print("请输入身份证：");
			users[i].setIDCard(s.next());
			System.out.print("请输入邮箱：");
			users[i].setEmail(s.next());		
		}	
	}
	//显示用户信息
	public void showUser(){
		System.out.println("*********************现有用户信息*********************");
		for(int i=0;i<this.users.length;i++){
			System.out.print("第"+(i+1)+"个用户为：   ");
			System.out.print("用户名："+users[i].getname()+" ;");
			System.out.print("性别："+users[i].getSex()+"; ");
			System.out.print("年龄："+users[i].getAge()+"; ");
			System.out.print("电话："+users[i].getTnum()+"; ");
			System.out.print("身份证："+users[i].getIDCard()+"; ");
			System.out.print("邮件："+users[i].getEmail()+"; ");
			System.out.println();
		}
	}
	public void getUsers(){
		int i=0;
		System.out.print("用户名："+users[i].getname()+" ;");
		System.out.print("性别："+users[i].getSex()+"; ");
		System.out.print("年龄："+users[i].getAge()+"; ");
		System.out.print("电话："+users[i].getTnum()+"; ");
		System.out.print("身份证："+users[i].getIDCard()+"; ");
		System.out.print("邮件："+users[i].getEmail()+"; ");
	}
	//查找用户
	public User findUser(String name){
		for(int i=0;i<users.length;i++){
			if(name.equals(users[i].getname())){
				System.out.print("用户信息为：   ");
				System.out.print("用户名："+users[i].getname()+"; ");
				System.out.print("性别："+users[i].getSex()+"; ");
				System.out.print("年龄："+users[i].getAge()+"; ");
				System.out.print("电话："+users[i].getTnum()+"; ");
				System.out.print("身份证："+users[i].getIDCard()+"; ");
				System.out.print("邮件："+users[i].getEmail()+" ;");
				System.out.println();
			}
		}
		return null;	
	}
	//修改用户信息
	public boolean modifyUser(User user){
		for(int i=0;i<users.length;i++){
			if(user.getIDCard().equals(users[i].getIDCard())){
				users[i].setname(user.getname());
				users[i].setSex(user.getSex());
				users[i].setAge(user.getAge());
				users[i].setTnum(user.getTnum());
				users[i].setIDCard(user.getIDCard());
				users[i].setEmail(user.getEmail());
				System.out.print("用户信息为：   ");
				System.out.print("用户名："+users[i].getname()+"; ");
				System.out.print("性别："+users[i].getSex()+"; ");
				System.out.print("年龄："+users[i].getAge()+"; ");
				System.out.print("电话："+users[i].getTnum()+"; ");
				System.out.print("身份证："+users[i].getIDCard()+"; ");
				System.out.print("邮件："+users[i].getEmail()+"; ");
				System.out.println();
			}
		}
		return false;	
	}
	//删除用户
	public void delUser(String idCard){
		for(int i=0;i<users.length;i++){
			if(idCard.equals(users[i].getIDCard())){
/*				users[i].setname(null);
				users[i].setSex(null);
				users[i].setAge(0);
				users[i].setTnum(null);
				users[i].setIDCard(null);
				users[i].setEmail(null);*/
				users[i]=null;
				clear();
			}
		}
	}
	 private void clear() {
	        for (int i = 0; i < users.length - 1; i++) {
	            if (null == users[i]) {
	                users[i] = users[i + 1];
	                users[i + 1] = null;
	            }
	        }
	    }


}
