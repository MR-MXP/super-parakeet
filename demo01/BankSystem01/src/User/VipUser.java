package User;

public class VipUser extends OrdinaryUser{
	public VipUser(String name, long ID, long password, int money,boolean visitant) {
			//ͨ��super���ø��๹�췽��
			super(name,ID,password,money,visitant);
	}
	//��дmenu����
	public void menu(VipUser UVu){
		for(int b=0;b<5;b++){
			System.out.println("***********����VIP�û������������Ĳ���***********");
			System.out.println("1.���     2.ȡ��     3.���     4.ת��    5.�˳�");
			b=s.nextInt();
			switch (b) {
			//���
			case 1:
				System.out.println("������Ҫ��Ľ��");
				this.deposit(s.nextInt());
				b=0;
				break;
			//ȡ��
			case 2:
				System.out.println("������Ҫȡ�Ľ��");
				this.withdraw(s.nextInt());
				b=0;
				break;
			//���
			case 3:
				this.balance();
				b=0;
				break;			
			case 4:
				System.out.print("������ת����˻�:");
				//ת��ID
				long Zid=s.nextLong();
				//ת�˽��
				System.out.print("������ת�˽��:");
				int money=s.nextInt();
				this.setMoney(getMoney()-money);
				System.out.println("�ɹ�ת�ˣ�"+money);
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
}
