package arr01;

import java.util.Scanner;

public class demo6 {
	public static void main(String[] args) {
		int b;
		boolean p=false;
		String[] n=new String[5];
		Scanner s=new Scanner(System.in);
		System.out.println("*******************¼���û���Ϣ*******************");
		for(int i=0;i<n.length;i++){
			System.out.println("�������"+(i+1)+"���û���Ϣ��");
			n[i]=s.next();
		}

		for(b=0;b<5;b++){
			System.out.println("1����ѯȫ���û���Ϣ\t2:�����û�����ѯ\t3:�޸��û���Ϣ\t4:ɾ���û���Ϣ");
			b=s.nextInt();
		switch (b) {
		case 1:
			System.out.println("***********************��ѯȫ���û���Ϣ***********************");
			for(int i=0;i<n.length;i++){
				System.out.println("��"+(i+1)+"���û���Ϣ��");
				System.out.println(n[i]);
			}
			break;
		case 2:
			System.out.println("***********************������Ҫ��ѯ���û���Ϣ***********************");
			String pname=s.next();
			for(int i=0;i<n.length;i++){
				if(pname.equals(n[i])){
					p=true;
					System.out.println("�û������ڵ�ǰ��"+(i+1)+"��λ��");
				}
			}
			if(p==false){
				System.out.println("������");
			}
			p=false;
			break;
		case 3:
			System.out.println("***********************������Ҫ�޸ĵ��û�����Ϣ***********************");
			String xname=s.next();
			for(int i=0;i<n.length;i++){
				if(xname.equals(n[i])){
					p=true;
					System.out.println("�������µ��û���Ϣ��");
					String nname=s.next();
					n[i]=nname;
				}
			}
			if(p==false){
				System.out.println("������");
			}
			p=false;
		break;
		default:
			System.out.println("***********************������Ҫɾ�����û���***********************");
			String sname=s.next();
			for(int i=0;i<n.length;i++){
				if(sname.equals(n[i])){
					p=true;
					n[i]=null;
				}
			}
			if(p==false){
				System.out.println("������");
			}
			p=false;
			break;
			}
			b=0;
		}
		
	}
}
