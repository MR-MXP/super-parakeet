package User;

public class OrdinaryUser {
	private String name;    	//姓名
	private long ID;			//ID
	private long password;	//密码
	private int money;			//余额
	private boolean visitant;
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
		this.money=this.money-withdrawMoney;
		if(this.money<0){
			System.out.println("卡内余额不足");	
		}else{
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
	//转账
	public void transferAccounts(int monney){
		this.setMoney(this.getMoney()+monney);
		System.out.println("成功转账:"+monney);
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
		this.money = money;
	}
}
