package User;

public class VipUser extends OrdinaryUser{
	public VipUser(String name, long ID, long password, int money,boolean visitant) {
			//通过super调用父类构造方法
			super(name,ID,password,money,visitant);
	}
	//重写menu方法
	public void menu(VipUser UVu){
		for(int b=0;b<5;b++){
			System.out.println("***********您是VIP用户，请输入您的操作***********");
			System.out.println("1.存款     2.取款     3.余额     4.转账    5.退出");
			b=s.nextInt();
			switch (b) {
			//存款
			case 1:
				System.out.println("请输入要存的金额");
				this.deposit(s.nextInt());
				b=0;
				break;
			//取款
			case 2:
				System.out.println("请输入要取的金额");
				this.withdraw(s.nextInt());
				b=0;
				break;
			//余额
			case 3:
				this.balance();
				b=0;
				break;			
			case 4:
				System.out.print("请输入转入的账户:");
				//转账ID
				long Zid=s.nextLong();
				//转账金额
				System.out.print("请输入转账金额:");
				int money=s.nextInt();
				this.setMoney(getMoney()-money);
				System.out.println("成功转账："+money);
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
}
