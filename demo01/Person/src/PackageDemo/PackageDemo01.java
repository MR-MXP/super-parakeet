package PackageDemo;
import java.util.ArrayList;
public class PackageDemo01 {
	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();							// 定义一个集合列表
		Person person1 = new Person("张三","女", 27, "中华人民共和国", false,"高中");		// 创建Person对象
		list.add(person1);									// 将Person对象添加到列表中
		Person person2 = new Person("李克","男", 22, "中华人民共和国", false,"初中");
		list.add(person2);
		Person person3 = new Person("孙小清","女", 19, "加拿大", true,"本科");
		list.add(person3);
		Person person4 = new Person("王叶叶","女", 22, "中华人民共和国", false,"大专");
		list.add(person4);
		System.out.println("2009美丽世界小姐北京大赛报名会现在开始！！");
		System.out.println("请报名者入场～～～");
		for (int i = 0; i < list.size(); i++) {
			int n = 0;
			Person p = (Person) list.get(i);
			System.out.println("第" + (i + 1) + "位报名者" + p.getName()
					+ "的基本信息如下：");
			System.out.println("姓名：" + p.getName());
			System.out.println("性别：" + p.getGender());
			System.out.println("年龄：" + p.getAge());
			System.out.println("国籍：" + p.getCountry());
			System.out.print("婚姻状况：" );
			System.out.println(p.isMarital()?"已婚":"未婚");
			System.out.println("学历：" + p.getEducation());
			if (p.isAge())
				n = n + 1;
			if (p.Education())
				n = n + 1;
			if (p.Behavior())
				n = n + 1;
			if (n == 3)
				p.setElected(true);
		}
		System.out.println("最后的报名结果如下：");
		for (int i = 0; i < list.size(); i++) {
			Person p = (Person) list.get(i);
			if (p.isElected()) {
				System.out.println("恭喜！"+p.getName() + ",可以参加世界小姐大赛！");
			}
		}
	}
}
class Person { 					// 定义人类
	private String name; 		// 人的姓名
	private int age; 			// 人的年龄
	private boolean marital;     //婚姻状况
	private String gender;      //性别
	private String country; 		// 国籍
	private String education; 		// 学历
	private boolean elected = false;// 标志是否当选
	public boolean isElected() {
		return elected;
	}
	public void setElected(boolean elected) {
		this.elected = elected;
	}
	public Person() {
	} // 默认构造方法
	public Person(String name, String gender,int age, String country, boolean marital,String education) { // 带参数的构造方法
		this.name = name;
		this.age = age;
		this.country = country;
		this.education = education;
		this.gender = gender;
		this.marital = marital;
	}
	// 对Person类中定义的属性进行封装
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	
	public boolean isAge() { // 判断年龄是否在25周岁以下，16周岁以上，且未婚未育
		if (this.getAge() >= 16&&this.getAge() <= 25&&this.marital==false) {
			return true;
		}else if((this.getAge() >= 25||this.getAge() <= 16)&&this.marital==false){
			System.out.println("参赛者的年龄在25周岁以下，16周岁以上，所以"+name + "你的年龄不符合参赛的条件");
			return false;
		}else if (this.getAge() >= 16&&this.getAge() <= 25&&this.marital==true){
			System.out.println("参赛者要求是未婚，所以"+name + "你不符合参赛的条件");
			return false;
		}
		System.out.println("参赛者的年龄在25周岁以下，16周岁以上，且未婚未育。所以"+name + "你不符合参赛的条件");
		return false;
	}
	public boolean Education() { 	// 判断学历是否为中专以上
		if (this.education.endsWith("初中")||this.education.endsWith("小学")||this.education.endsWith("无")) {
			System.out.println("参赛者需中专以上文化程度，所以"+name + "你不符合参赛的条件");
			return false;
		}
		
		return true;
	}
	public boolean Behavior() { // 判断是否是中华人民共和国女性公民
		if (this.country.equals("中华人民共和国")&&this.gender.endsWith("女")) {
						return true;
		}else if (this.country.equals("中华人民共和国")&&!this.gender.endsWith("女")){
			System.out.println("世界小姐只允许女性参加，所以很抱歉，"+name + "你不符合参赛的条件");
			return false;
		}else if (!this.country.equals("中华人民共和国")&&this.gender.endsWith("女")){
			System.out.println("很抱歉,本届世界小姐只允许中华人民共和国公民参加，所以"+name + "你不符合参赛的条件");
			return false;
		}
		System.out.println( "参赛者须是中华人民共和国女性公民，所以"+name+"你不符合参赛的条件");
		return false;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public boolean isMarital() {
		return marital;
	}
	public void setMarital(boolean marital) {
		this.marital = marital;
	}
}

