package biz;

import java.util.Scanner;

import entity.User;

public class UserBiz {
	User[] users=new User[3];
	Scanner s=new Scanner(System.in);
	//�����û���Ϣ
	public void addUser(User user){
		for(int i=0;i<users.length;i++){
			users[i]=new User();
		}
		for(int i=0;i<this.users.length;i++){
			System.out.println("*********************�������"+(i+1)+"���û���Ϣ*********************");
			System.out.print("������������");
			users[i].setname(s.next());
			System.out.print("�������Ա�");
			users[i].setSex(s.next());
			System.out.print("���������䣺");
			users[i].setAge(s.nextInt());
			System.out.print("������绰��");
			users[i].setTnum(s.next());
			System.out.print("���������֤��");
			users[i].setIDCard(s.next());
			System.out.print("���������䣺");
			users[i].setEmail(s.next());		
		}	
	}
	//��ʾ�û���Ϣ
	public void showUser(){
		System.out.println("*********************�����û���Ϣ*********************");
		for(int i=0;i<this.users.length;i++){
			System.out.print("��"+(i+1)+"���û�Ϊ��   ");
			System.out.print("�û�����"+users[i].getname()+" ;");
			System.out.print("�Ա�"+users[i].getSex()+"; ");
			System.out.print("���䣺"+users[i].getAge()+"; ");
			System.out.print("�绰��"+users[i].getTnum()+"; ");
			System.out.print("���֤��"+users[i].getIDCard()+"; ");
			System.out.print("�ʼ���"+users[i].getEmail()+"; ");
			System.out.println();
		}
	}
	public void getUsers(){
		int i=0;
		System.out.print("�û�����"+users[i].getname()+" ;");
		System.out.print("�Ա�"+users[i].getSex()+"; ");
		System.out.print("���䣺"+users[i].getAge()+"; ");
		System.out.print("�绰��"+users[i].getTnum()+"; ");
		System.out.print("���֤��"+users[i].getIDCard()+"; ");
		System.out.print("�ʼ���"+users[i].getEmail()+"; ");
	}
	//�����û�
	public User findUser(String name){
		for(int i=0;i<users.length;i++){
			if(name.equals(users[i].getname())){
				System.out.print("�û���ϢΪ��   ");
				System.out.print("�û�����"+users[i].getname()+"; ");
				System.out.print("�Ա�"+users[i].getSex()+"; ");
				System.out.print("���䣺"+users[i].getAge()+"; ");
				System.out.print("�绰��"+users[i].getTnum()+"; ");
				System.out.print("���֤��"+users[i].getIDCard()+"; ");
				System.out.print("�ʼ���"+users[i].getEmail()+" ;");
				System.out.println();
			}
		}
		return null;	
	}
	//�޸��û���Ϣ
	public boolean modifyUser(User user){
		for(int i=0;i<users.length;i++){
			if(user.getIDCard().equals(users[i].getIDCard())){
				users[i].setname(user.getname());
				users[i].setSex(user.getSex());
				users[i].setAge(user.getAge());
				users[i].setTnum(user.getTnum());
				users[i].setIDCard(user.getIDCard());
				users[i].setEmail(user.getEmail());
				System.out.print("�û���ϢΪ��   ");
				System.out.print("�û�����"+users[i].getname()+"; ");
				System.out.print("�Ա�"+users[i].getSex()+"; ");
				System.out.print("���䣺"+users[i].getAge()+"; ");
				System.out.print("�绰��"+users[i].getTnum()+"; ");
				System.out.print("���֤��"+users[i].getIDCard()+"; ");
				System.out.print("�ʼ���"+users[i].getEmail()+"; ");
				System.out.println();
			}
		}
		return false;	
	}
	//ɾ���û�
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
