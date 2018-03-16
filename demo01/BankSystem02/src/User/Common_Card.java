package User;

import ScanTool.EnterAmountOfMoney;

public class Common_Card {
	private String name;
	private int ID;
	private int password;
	private int money;
	
	public Common_Card(String name, int iD, int password, int money) {
		super();
		this.name = name;
		ID = iD;
		this.password = password;
		this.money = money;
	}
	//取款
	boolean checkMoney(int m){
		System.out.println("正在操作,请稍后......!");
		if(m<0){
			if(saveMoney(-m))
				return true;
			else
				return false;
		}else{
			if(m>money){
				System.out.println("该账户不可透支,本次操作中断!");
				return false;
			}
			this.money-=m;
			System.out.println("操作成功!");
			return true;
		}
	}
	//存款
	boolean saveMoney(int m){
		System.out.println("正在操作,请稍后......!");
		if(m<0){
			if(checkMoney(m))
				return true;
			else
				return false;
		}else{
			this.money+=m;
			System.out.println("[√]操作成功!");
			return true;
		}
	}
	//显示余额
	void search(){
		System.out.println("当前余额："+money+"元");
	}
	//检查密码
	boolean checkPassword(){
		int i;
		for(i=0;i<3;i++){
			if(i>0)
				System.out.println("密码错误，请输入密码：");
				int pw = EnterAmountOfMoney.scanInt();
				if(pw==password){
					return true;
				}
		}
		if(i==3)
			System.out.println("密码输入出错3次，操作中断！");
			return false;

	}
}
