package User;

public class OrdinaryUser {
	private String name;    	//����
	private long ID;			//ID
	private long password;	//����
	private int money;			//���
	private boolean visitant;
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
		this.money=this.money-withdrawMoney;
		if(this.money<0){
			System.out.println("��������");	
		}else{
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
	//ת��
	public void transferAccounts(int monney){
		this.setMoney(this.getMoney()+monney);
		System.out.println("�ɹ�ת��:"+monney);
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
