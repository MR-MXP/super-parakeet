package obj02;

public class Cat {
	String name;
	int age;
	char sex;
	public Cat(String name,int age,char sex){
		//this用来区分成员变量和局部变量
		this.name=name;
		this.age=age;
		this.sex=sex;
	}
	void run(){
		System.out.println(name+"跑的快");
	}
	void show(){
		//那个对象调用该方法，this指这个对象
		this.run();
	}
	public static void main(String[] args){
		Cat tom=new Cat("Tom", 18, '男');
		Cat jack=new Cat("Jack", 15, '男');
		tom.show();
		jack.show();
	}
}
