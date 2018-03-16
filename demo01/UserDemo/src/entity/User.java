package entity;


public class User {
	String Name;
	String Gender;
	int Age;
	String Phone;
	String IdCard;
	String Email;
	public User() {
		
	}
	public User(String name, String gender, int age, String phone,
			String idCard, String email) {
		Name = name;
		Gender = gender;
		Age = age;
		Phone = phone;
		IdCard = idCard;
		Email = email;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getIdCard() {
		return IdCard;
	}
	public void setIdCard(String idCard) {
		IdCard = idCard;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}

}

