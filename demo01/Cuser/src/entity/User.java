package entity;

public class User {
	String name;
	String sex;
	int age;
	String Tnum;
	String IDCard;
	String Email;
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(String name, String sex, int age, String tnum, String iDCard,
			String email) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.Tnum = tnum;
		this.IDCard = iDCard;
		this.Email = email;
	}
	public String getname(){	
		return name;
	}
	public void setname(String name){
		this.name=name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTnum() {
		return Tnum;
	}
	public void setTnum(String tnum) {
		this.Tnum = tnum;
	}
	public String getIDCard() {
		return IDCard;
	}
	public void setIDCard(String iDCard) {
		this.IDCard = iDCard;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		this.Email = email;
	}
}
