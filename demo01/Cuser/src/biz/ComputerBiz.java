package biz;

import java.util.Scanner;

import entity.Computer;

public class ComputerBiz {
	Computer[] pc=new Computer[3];
	Scanner s=new Scanner(System.in);
	//���Ӽ������Ϣ
	public void addComputer(Computer computer){
		for(int i=0;i<pc.length;i++){
			//��ʼ������
			pc[i]=new Computer();
			System.out.println("====================�������"+(i+1)+"���û���Ϣ====================");
			System.out.print("������Ip��ַ��");
			pc[i].setIp(s.next());
			System.out.print("������������ţ�");
			pc[i].setCnum(s.nextInt());
			
		}
/*		System.out.println("��Ӽ������");
		for(int i=0;i<pc.length;i++){
			System.out.println("====================�������"+(i+1)+"���û���Ϣ====================");
			System.out.print("������Ip��ַ��");
			pc[i].setIp(s.next());
			System.out.print("������������ţ�");
			pc[i].setCnum(s.nextInt());
		}*/
	}
	//��ʾ�����
	public void ShowComputer(Computer computer){
		System.out.println("====================���м������Ϣ====================");
		for(int i=0;i<pc.length;i++){
			System.out.print("��"+(i+1)+"̨�����Ϊ��   ");
			System.out.print("ip��ַΪ��"+pc[i].getIp()+";");
			System.out.println("���ΪΪ��"+pc[i].getCnum()+";");
		}
	}
	//ɾ���������Ϣ
	public void delComputer(int num){
		for(int i=0;i<pc.length;i++){
			if(num==pc[i].getCnum()){
				pc[i]=null;
				clear();
			}
		}
	}
	 private void clear() {
	        for (int i = 0; i < pc.length - 1; i++) {
	            if (null == pc[i]) {
	            	pc[i] = pc[i + 1];
	            	pc[i + 1] = null;
	            }
	        }
	    }

	
}
