package Test;

import java.util.Scanner;

import User.OrdinaryUser;
import User.VipUser;

public class Test {
	public static void main(String[] args) {
		long Uid;
		long Upassword;
		//������������洢����
		OrdinaryUser[] Ou=new OrdinaryUser[3];
		VipUser[] Vu=new VipUser[2];
		Scanner s=new Scanner(System.in);
		Ou[0]=new OrdinaryUser("����",100001L, 100001L, 1000,false);
		Ou[1]=new OrdinaryUser("����",100002L, 100002L, 2000,false);
		Ou[2]=new OrdinaryUser("������",100003L, 100003L, 10000,false);
		Ou[0]=new VipUser("����", 200001L,200001L, 15000,true);
		Vu[1]=new VipUser("��÷÷", 200002L,200002L, 100000,true);
		System.out.print("�������û�ID��");
		Uid=s.nextLong();
		System.out.print("�������û����룺");
		Upassword=s.nextLong();
		
		//��ͨ�û�
			for(int i=0;i<Ou.length;i++){	
				OrdinaryUser Uou=Ou[i];
				if(Uid==Uou.getID()&&Upassword==Uou.getPassword()){
					for(int b=0;b<5;b++){
						System.out.println("***********������ͨ�û������������Ĳ���***********");
						System.out.println("1.���     2.ȡ��     3.���     4.�˳�");
						b=s.nextInt();
						//�˵�ѡ����
						switch (b) {
						//���
						case 1:
							System.out.println("������Ҫ��Ľ��");
							Uou.deposit(s.nextInt());
							b=0;
							break;
						//ȡ��
						case 2:
							System.out.println("������Ҫȡ�Ľ��");
							Uou.withdraw(s.nextInt());
							b=0;
							break;
						//���
						case 3:
							Uou.balance();
							b=0;
							break;
							
						//�˳�
						default:
							Uou.exit();
							b=7;
							break;
						}
					}	
				}
			}
			
			for(int i=0;i<Vu.length;i++){
				VipUser Uvu=Vu[i];
				if(Uvu.getID()==Uid&&Uvu.getPassword()==Upassword){
					for(int b=0;b<5;b++){
						System.out.println("***********����VIP�û������������Ĳ���***********");
						System.out.println("1.���     2.ȡ��     3.���     4.ת��   5.�˳�");
						b=s.nextInt();
						//�˵�ѡ����
						switch (b) {
						//���
						case 1:
							System.out.print("������Ҫ��Ľ��:");
							Uvu.deposit(s.nextInt());
							b=0;
							break;
						//ȡ��
						case 2:
							System.out.print("������Ҫȡ�Ľ��:");
							Uvu.withdraw(s.nextInt());
							b=0;
							break;
						//���
						case 3:
							Uvu.balance();
							b=0;
							break;
						case 4:
							System.out.print("������ת����˻�:");
							//ת��ID
							long Zid=s.nextLong();
							//����ͨ�û�ת��
							for(int j=0;j<Ou.length;j++){
								OrdinaryUser Zou=Ou[j];
								if(Zou.getID()==Zid){
									System.out.print("������Ҫת�˵Ľ��:");
									int Zmoney=s.nextInt();
									Zou.transferAccounts(Zmoney);
									Uvu.setMoney(Uvu.getMoney()-Zmoney);
								}
							}
							//��VIP�û�ת��
							for(int k=0;k<Vu.length;k++){
								VipUser Zvu=Vu[k];
								if(Zvu.getID()==Zid){
									System.out.print("������Ҫת�˵Ľ��:");
									int Zmoney=s.nextInt();
									Zvu.transferAccounts(Zmoney);
									Uvu.setMoney(Uvu.getMoney()-Zmoney);
								}
							}
							b=0;
							break;
						//�˳�
						default:
							Uvu.exit();
							b=7;
							break;
						}
					}
				}
			}
	}
}
