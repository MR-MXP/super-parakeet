package Animal;

public class Cat extends Animal{
	String name="tom";
	public void showname(){
		System.out.println("我的名字："+name);
	}
	public void eat(){
		System.out.println("我会吃");
	}
	public void run(String Sex){
		System.out.println("我是"+Sex+"我会跑");
	}
	public static void main(String[] args) {
		Animal ca=new Cat();      //向上转型
		/*java 中的instanceof 运算符是用来在运行时指出对象是否是特定类的一个实例。instanceof通过返回一个布尔值来指出
		这个对象是否是这个特定类或者是它的子类的一个实例*/
		System.out.println(ca instanceof Cat);
		System.out.println(ca.age);
		ca.showname();
		ca.run();
		Cat ct=(Cat) ca;		//向下转型
		System.out.println(ct instanceof Animal);
		ct.run("男");
		ct.eat();
		int num=(int)(Math.random()*200); 
		System.out.println(num);
	}
}
