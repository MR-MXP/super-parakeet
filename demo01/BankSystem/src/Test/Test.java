package Test;

import java.util.Scanner;

import User.OrdinaryUser;
import User.VipUser;

public class Test {
	public static void main(String[] args) {
		long Uid;
		long Upassword;
		//创建两个数组存储数据
		OrdinaryUser[] Ou=new OrdinaryUser[3];
		VipUser[] Vu=new VipUser[2];
		Scanner s=new Scanner(System.in);
		Ou[0]=new OrdinaryUser("张三",100001L, 100001L, 1000,false);
		Ou[1]=new OrdinaryUser("李四",100002L, 100002L, 2000,false);
		Ou[2]=new OrdinaryUser("王麻子",100003L, 100003L, 10000,false);
		Ou[0]=new VipUser("李雷", 200001L,200001L, 15000,true);
		Vu[1]=new VipUser("韩梅梅", 200002L,200002L, 100000,true);
		System.out.print("请输入用户ID：");
		Uid=s.nextLong();
		System.out.print("请输入用户密码：");
		Upassword=s.nextLong();
		
		//普通用户
			for(int i=0;i<Ou.length;i++){	
				OrdinaryUser Uou=Ou[i];
				if(Uid==Uou.getID()&&Upassword==Uou.getPassword()){
					for(int b=0;b<5;b++){
						System.out.println("***********您是普通用户，请输入您的操作***********");
						System.out.println("1.存款     2.取款     3.余额     4.退出");
						b=s.nextInt();
						//菜单选择项
						switch (b) {
						//存款
						case 1:
							System.out.println("请输入要存的金额");
							Uou.deposit(s.nextInt());
							b=0;
							break;
						//取款
						case 2:
							System.out.println("请输入要取的金额");
							Uou.withdraw(s.nextInt());
							b=0;
							break;
						//余额
						case 3:
							Uou.balance();
							b=0;
							break;
							
						//退出
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
						System.out.println("***********您是VIP用户，请输入您的操作***********");
						System.out.println("1.存款     2.取款     3.余额     4.转账   5.退出");
						b=s.nextInt();
						//菜单选择项
						switch (b) {
						//存款
						case 1:
							System.out.print("请输入要存的金额:");
							Uvu.deposit(s.nextInt());
							b=0;
							break;
						//取款
						case 2:
							System.out.print("请输入要取的金额:");
							Uvu.withdraw(s.nextInt());
							b=0;
							break;
						//余额
						case 3:
							Uvu.balance();
							b=0;
							break;
						case 4:
							System.out.print("请输入转入的账户:");
							//转账ID
							long Zid=s.nextLong();
							//向普通用户转账
							for(int j=0;j<Ou.length;j++){
								OrdinaryUser Zou=Ou[j];
								if(Zou.getID()==Zid){
									System.out.print("请输入要转账的金额:");
									int Zmoney=s.nextInt();
									Zou.transferAccounts(Zmoney);
									Uvu.setMoney(Uvu.getMoney()-Zmoney);
								}
							}
							//向VIP用户转账
							for(int k=0;k<Vu.length;k++){
								VipUser Zvu=Vu[k];
								if(Zvu.getID()==Zid){
									System.out.print("请输入要转账的金额:");
									int Zmoney=s.nextInt();
									Zvu.transferAccounts(Zmoney);
									Uvu.setMoney(Uvu.getMoney()-Zmoney);
								}
							}
							b=0;
							break;
						//退出
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
