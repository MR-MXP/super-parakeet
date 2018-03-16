package User;

import java.util.Scanner;

public class OrdinaryUser {
	private String name;    	//����
	private long ID;			//ID
	private long password;	//����
	private int money;			//���
	private boolean visitant;
	Scanner s=new Scanner(System.in);
	public OrdinaryUser() {	
		
	}
	//�����вεĹ��췽��
	public OrdinaryUser(String name, long ID, long password, int money,boolean visitant) {
		this.name = name;
		this.ID = ID;
		this.password = password;
		this.money = money;
		this.visitant=visitant;
	}
	//���
	public void deposit(int depositMoney){
		this.money=this.money+depositMoney;
		System.out.println("�ɹ���"+depositMoney);
	}
	//ȡ��
	public void withdraw(int withdrawMoney){
		if(this.money<0){
			System.out.println("��������");	
		}
		else{
			this.money=this.money-withdrawMoney;
			System.out.println("�ɹ�ȡ�"+withdrawMoney);
		}
	}
	//���
	public void balance(){
		System.out.println("�������:"+this.money);
	}
	//�˳�
	public void exit(){
		System.out.println("�ɹ��˳�����ӭ�´�ʹ��!");
	}
	//�˵�
	public void menu(OrdinaryUser Uou){
		for(int b=0;b<4;b++){
			System.out.println("***********������ͨ�û������������Ĳ���***********");
			System.out.println("1.���     2.ȡ��     3.���     4.�˳�");
			b=s.nextInt();
			switch (b) {
			//���
			case 1:
				System.out.print("������Ҫ��Ľ��:");
				this.deposit(s.nextInt());
				b=0;
				break;
			//ȡ��
			case 2:
				System.out.print("������Ҫȡ�Ľ��:");
				this.withdraw(s.nextInt());
				b=0;
				break;
			//���
			case 3:
				this.balance();
				b=0;
				break;		
			//�˳�
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
