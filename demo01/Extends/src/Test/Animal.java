package Test;

public class Animal {

	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	private int Id;
	//无参构造器
	public Animal() {
		
	}
	//有参构造器
	public Animal(String name, int id) {
		this.name = name;
		Id = id;
	}
	
	
	public void show(){
		System.out.println(name+" "+Id);
	}
	public void eat(){
		System.out.println(name+"正在吃");
	}
}
