package om.demo01;

import java.util.Scanner;

public class demo01 {
	public static void main(String[] args) {
		String Name;
		String Cname;
		Scanner s=new Scanner(System.in);
		String[] P=new String[10];
		//����û�
		System.out.println("************����û���Ϣ************");
		for(int i=0;i<P.length;i++){
			System.out.println("�������"+(i+1)+"�û�");
			Name=s.next();
			P[i]=Name;
		}
		//����ȫ���û�
		System.out.println("************��ʾȫ���û�************");
		for(int i=0;i<P.length;i++){
			System.out.println("��"+(i+1)+"�û�");
			System.out.println("�û�����"+P[i]);
		}
		//���ҵ����û�
		System.out.print("��������ҵ��û�����");
		Cname=s.next();
		for(int i=0;i<P.length;i++){
			if(Cname.equals(P[i])){
				System.out.println("��"+(i+1)+"�û�");
				System.out.println("������"+P[i]);
			}
		}
		
	}
}