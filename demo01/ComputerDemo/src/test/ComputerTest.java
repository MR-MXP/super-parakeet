package test;

import java.util.Scanner;

import biz.ComputerBiz;
import entity.Computer;

public class ComputerTest {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		ComputerBiz cb=new ComputerBiz();
		System.out.println("*********************��ӵ�����Ϣ*********************");
		for(int i=0;i<3;i++){	
			System.out.println("====�������"+(i+1)+"���û���Ϣ====");
			cb.addComputer(InputCp());	
		}
		showAllUser(cb.getComputer());
		
/*		System.out.println("�޸ĵ�����Ϣ��");
		cb.modifyComputer(new Computer("192.168.0.1",12));
		showAllUser(cb.getComputer());*/
	}
	//������Ϣ
	public static Computer InputCp(){
		Computer cp=new Computer();
		System.out.print("������IP:");
		cp.setIP(s.next());
		System.out.print("��������:");
		cp.setNum(s.nextInt());
		return cp;
	}
	//��ʾ���е�����Ϣ
	public static void showAllUser(Computer[] computers){
		for(int i=0;i<computers.length;i++){
			if(computers[i]!=null){
				System.out.println("��"+(i+1)+"̨������Ϣ��");
				System.out.print("����IP��"+computers[i].getIP());
				System.out.print("���Ա�ţ�"+computers[i].getNum());
			}
		}
	}
}
