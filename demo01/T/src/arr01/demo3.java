package arr01;

import java.util.Arrays;
import java.util.Scanner;

import text.a;

public class demo3 {
	public static void main(String[] args) {
		int b;
		boolean p=false;
		String[] n=new String[5];
		//�����û���Ϣ
		Scanner s=new Scanner(System.in);
		
		for(int i=0;i<n.length;i++){
			System.out.println("�������"+(i+1)+"���û�����");
			String name=s.next();
			for(int j=i;j<i+1;j++){
				n[i]=name;
			}
		}
		System.out.println("������Ϣ���");

		for(b=0;b<=4;b++){
			System.out.println("1����ѯȫ���û���Ϣ\t2:�����û�����ѯ\t3:�޸��û���Ϣ\t4:ɾ���û���Ϣ");
			b=s.nextInt();

			
		//��ѯ�����û���Ϣ
		if(b==1){
			System.out.println("***********************��ѯȫ���û���Ϣ***********************");
			for(int i=0;i<n.length;i++){
				System.out.println("��"+(i+1)+"���û���Ϣ��");
				System.out.println(n[i]);
			}
		}
		
		//�����û���ѯ�û���Ϣ
		if(b==2){
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
		}
		
		//�޸��û�����Ϣ
			if(b==3){
				System.out.println("***********************������Ҫ�޸ĵ��û�����Ϣ***********************");
				String xname=s.next();
				for(int i=0;i<n.length;i++){
					if(xname.equals(n[i])){
						p=true;
						System.out.println("�Ƿ��޸��û���Ϣ���������ǻ��:");
						String yn=s.next();
						if(yn.equals("��")){
							System.out.println("�������µ��û���Ϣ��");
							String nname=s.next();
							n[i]=nname;
							System.out.println("��ǰ�û���Ϊ��"+n[i]);
						}else if(yn.equals("��")){
							System.out.println("�����κβ���!");
						}else{
							System.out.println("�벻Ҫ��������emmmm!");
						}
					}

				}
				if(p==false){
					System.out.println("������");
				}
				p=false;
			}

		//ɾ���û���Ϣ
			if(b==4){
				System.out.println("***********************������Ҫɾ�����û���***********************");
				String sname=s.next();
				for(int i=0;i<n.length;i++){
					if(sname.equals(n[i])){
						p=true;
						System.out.println("�Ƿ�ɾ���û���Ϣ���������ǻ��:");
						String yn=s.next();
						if(yn.equals("��")){
							n[i]=null;
							System.out.println("��ǰ�û���Ϊ��"+n[i]);
						}
						else if(yn.equals("��")){
							System.out.println("�����κβ���!");
						}
						else{
							System.out.println("�벻Ҫ��������emmmm!");
						}
					}
				}
				if(p==false){
					System.out.println("������");
				}
				p=false;
				b=0;
			}
		}		
//		System.out.println(Arrays.toString(n));
		}
	}
