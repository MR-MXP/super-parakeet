package test;

import java.util.Scanner;

import entity.User;
import biz.UserBiz;

public class UserTest {
/*	static void showAllUser(User[] users){
		for(int i=0;i<users.length;i++){
			System.out.print("��"+(i+1)+"���û�Ϊ��   ");
			System.out.print("�û�����"+users[i].getname()+";");
			System.out.print("�Ա�"+users[i].getSex()+";");
			System.out.print("���䣺"+users[i].getAge()+";");
			System.out.print("�绰��"+users[i].getTnum()+";");
			System.out.print("���֤��"+users[i].getIDCard()+";");
			System.out.print("�ʼ���"+users[i].getEmail()+";");
			System.out.println();
		}
	}*/
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		UserBiz ub=new UserBiz();
		User u=new User();
		//����û���Ϣ
		ub.addUser(u);
		//��ʾ�û���Ϣ
		ub.showUser();
		//�����û���Ϣ
		System.out.println("*********************�����û���Ϣ*********************");
		System.out.print("������Ҫ���ҵ��û�����");
		String name=s.next();
		ub.findUser(name);
		//�޸��û���Ϣ
		System.out.println("*********************�޸��û���Ϣ*********************");
		System.out.println("������Ҫ�޸��û������֤�ţ�");
		String IdCard=s.next();
		User u1=new User("name","��",12,"1513213213",IdCard,"1123132123");
		ub.modifyUser(u1);
		
		//ɾ���û���Ϣ
		System.out.println("*********************ɾ���û���Ϣ*********************");
		System.out.println("������Ҫɾ���û������֤�ţ�");
		ub.delUser(s.next());
		ub.showUser();
		//������ʾ
	}
}
