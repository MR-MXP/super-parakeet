package obj02;

public class Cat {
	String name;
	int age;
	char sex;
	public Cat(String name,int age,char sex){
		//this�������ֳ�Ա�����;ֲ�����
		this.name=name;
		this.age=age;
		this.sex=sex;
	}
	void run(){
		System.out.println(name+"�ܵĿ�");
	}
	void show(){
		//�Ǹ�������ø÷�����thisָ�������
		this.run();
	}
	public static void main(String[] args){
		Cat tom=new Cat("Tom", 18, '��');
		Cat jack=new Cat("Jack", 15, '��');
		tom.show();
		jack.show();
	}
}
