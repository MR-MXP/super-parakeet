package test;

import java.util.Scanner;

import entity.Computer;
import biz.ComputerBiz;

public class ComputerTest {
	public static void main(String[] args) {
		ComputerBiz cb=new ComputerBiz();
		Computer pc=new Computer();
		Scanner s=new Scanner(System.in);
		//��Ӽ����
		cb.addComputer(pc);
		//��ʾ�����
		cb.ShowComputer(pc);
		//ɾ�������
		System.out.println("������Ҫɾ���ļ������ţ�");	
		cb.delComputer(s.nextInt());
		cb.ShowComputer(pc);
	}
}
