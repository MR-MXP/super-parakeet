package Test;

public class Test {
	public static void main(String[] args) {
		Cat c=new Cat("tom",002);
		Cat c1=new Cat();
		c.show();
		c.eat();
		Mouse m=new Mouse("jack", 003);
		m.show();
		m.eat();
		m.hangrry();
	}
}
