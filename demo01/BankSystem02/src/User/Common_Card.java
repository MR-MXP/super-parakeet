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
	//ȡ��
	boolean checkMoney(int m){
		System.out.println("���ڲ���,���Ժ�......!");
		if(m<0){
			if(saveMoney(-m))
				return true;
			else
				return false;
		}else{
			if(m>money){
				System.out.println("���˻�����͸֧,���β����ж�!");
				return false;
			}
			this.money-=m;
			System.out.println("�����ɹ�!");
			return true;
		}
	}
	//���
	boolean saveMoney(int m){
		System.out.println("���ڲ���,���Ժ�......!");
		if(m<0){
			if(checkMoney(m))
				return true;
			else
				return false;
		}else{
			this.money+=m;
			System.out.println("[��]�����ɹ�!");
			return true;
		}
	}
	//��ʾ���
	void search(){
		System.out.println("��ǰ��"+money+"Ԫ");
	}
	//�������
	boolean checkPassword(){
		int i;
		for(i=0;i<3;i++){
			if(i>0)
				System.out.println("����������������룺");
				int pw = EnterAmountOfMoney.scanInt();
				if(pw==password){
					return true;
				}
		}
		if(i==3)
			System.out.println("�����������3�Σ������жϣ�");
			return false;

	}
}
