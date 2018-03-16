package User;

public class VipUser extends OrdinaryUser{
	public VipUser(String name, long ID, long password, int money,boolean visitant) {
			//通过super调用父类构造方法
			super(name,ID,password,money,visitant);
	}
	
}
