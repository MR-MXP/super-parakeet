package Animal;

public class Cat extends Animal{
	String name="tom";
	public void showname(){
		System.out.println("�ҵ����֣�"+name);
	}
	public void eat(){
		System.out.println("�һ��");
	}
	public void run(String Sex){
		System.out.println("����"+Sex+"�һ���");
	}
	public static void main(String[] args) {
		Animal ca=new Cat();      //����ת��
		/*java �е�instanceof �����������������ʱָ�������Ƿ����ض����һ��ʵ����instanceofͨ������һ������ֵ��ָ��
		��������Ƿ�������ض�����������������һ��ʵ��*/
		System.out.println(ca instanceof Cat);
		System.out.println(ca.age);
		ca.showname();
		ca.run();
		Cat ct=(Cat) ca;		//����ת��
		System.out.println(ct instanceof Animal);
		ct.run("��");
		ct.eat();
		int num=(int)(Math.random()*200); 
		System.out.println(num);
	}
}
