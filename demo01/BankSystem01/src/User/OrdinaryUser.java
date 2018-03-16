package User;

import java.util.Scanner;

public class OrdinaryUser {
	private String name;    	//姓名
	private long ID;			//ID
	private long password;	//密码
	private int money;			//余额
	private boolean visitant;
	Scanner s=new Scanner(System.in);
	public OrdinaryUser() {	
		
	}
	//创建有参的构造方法
	public OrdinaryUser(String name, long ID, long password, int money,boolean visitant) {
		this.name = name;
		this.ID = ID;
		this.password = password;
		this.money = money;
		this.visitant=visitant;
	}
	//存款
	public void deposit(int depositMoney){
		this.money=this.money+depositMoney;
		System.out.println("成功存款："+depositMoney);
	}
	//取款
	public void withdraw(int withdrawMoney){
		if(this.money<0){
			System.out.println("卡内余额不足");	
		}
		else{
			this.money=this.money-withdrawMoney;
			System.out.println("成功取款："+withdrawMoney);
		}
	}
	//余额
	public void balance(){
		System.out.println("卡上余额:"+this.money);
	}
	//退出
	public void exit(){
		System.out.println("成功退出，欢迎下次使用!");
	}
	//菜单
	public void menu(OrdinaryUser Uou){
		for(int b=0;b<4;b++){
			System.out.println("***********您是普通用户，请输入您的操作***********");
			System.out.println("1.存款     2.取款     3.余额     4.退出");
			b=s.nextInt();
			switch (b) {
			//存款
			case 1:
				System.out.print("请输入要存的金额:");
				this.deposit(s.nextInt());
				b=0;
				break;
			//取款
			case 2:
				System.out.print("请输入要取的金额:");
				this.withdraw(s.nextInt());
				b=0;
				break;
			//余额
			case 3:
				this.balance();
				b=0;
				break;		
			//退出
			default:
				this.exit();
				b=7;
				break;
			}
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getID() {
		return ID;
	}
	public void setID(long ID) {
		this.ID = ID;
	}
	public long getPassword() {
		return password;
	}
	public void setPassword(long password) {
		this.password = password;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public boolean getvisitant(){
		return visitant;
	}
	public void setvisitant(boolean visitant){
		this.visitant=visitant;
	}
}
