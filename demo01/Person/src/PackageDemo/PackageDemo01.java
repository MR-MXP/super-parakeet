package PackageDemo;
import java.util.ArrayList;
public class PackageDemo01 {
	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();							// ����һ�������б�
		Person person1 = new Person("����","Ů", 27, "�л����񹲺͹�", false,"����");		// ����Person����
		list.add(person1);									// ��Person������ӵ��б���
		Person person2 = new Person("���","��", 22, "�л����񹲺͹�", false,"����");
		list.add(person2);
		Person person3 = new Person("��С��","Ů", 19, "���ô�", true,"����");
		list.add(person3);
		Person person4 = new Person("��ҶҶ","Ů", 22, "�л����񹲺͹�", false,"��ר");
		list.add(person4);
		System.out.println("2009��������С�㱱���������������ڿ�ʼ����");
		System.out.println("�뱨�����볡������");
		for (int i = 0; i < list.size(); i++) {
			int n = 0;
			Person p = (Person) list.get(i);
			System.out.println("��" + (i + 1) + "λ������" + p.getName()
					+ "�Ļ�����Ϣ���£�");
			System.out.println("������" + p.getName());
			System.out.println("�Ա�" + p.getGender());
			System.out.println("���䣺" + p.getAge());
			System.out.println("������" + p.getCountry());
			System.out.print("����״����" );
			System.out.println(p.isMarital()?"�ѻ�":"δ��");
			System.out.println("ѧ����" + p.getEducation());
			if (p.isAge())
				n = n + 1;
			if (p.Education())
				n = n + 1;
			if (p.Behavior())
				n = n + 1;
			if (n == 3)
				p.setElected(true);
		}
		System.out.println("���ı���������£�");
		for (int i = 0; i < list.size(); i++) {
			Person p = (Person) list.get(i);
			if (p.isElected()) {
				System.out.println("��ϲ��"+p.getName() + ",���Բμ�����С�������");
			}
		}
	}
}
class Person { 					// ��������
	private String name; 		// �˵�����
	private int age; 			// �˵�����
	private boolean marital;     //����״��
	private String gender;      //�Ա�
	private String country; 		// ����
	private String education; 		// ѧ��
	private boolean elected = false;// ��־�Ƿ�ѡ
	public boolean isElected() {
		return elected;
	}
	public void setElected(boolean elected) {
		this.elected = elected;
	}
	public Person() {
	} // Ĭ�Ϲ��췽��
	public Person(String name, String gender,int age, String country, boolean marital,String education) { // �������Ĺ��췽��
		this.name = name;
		this.age = age;
		this.country = country;
		this.education = education;
		this.gender = gender;
		this.marital = marital;
	}
	// ��Person���ж�������Խ��з�װ
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
	
	public boolean isAge() { // �ж������Ƿ���25�������£�16�������ϣ���δ��δ��
		if (this.getAge() >= 16&&this.getAge() <= 25&&this.marital==false) {
			return true;
		}else if((this.getAge() >= 25||this.getAge() <= 16)&&this.marital==false){
			System.out.println("�����ߵ�������25�������£�16�������ϣ�����"+name + "������䲻���ϲ���������");
			return false;
		}else if (this.getAge() >= 16&&this.getAge() <= 25&&this.marital==true){
			System.out.println("������Ҫ����δ�飬����"+name + "�㲻���ϲ���������");
			return false;
		}
		System.out.println("�����ߵ�������25�������£�16�������ϣ���δ��δ��������"+name + "�㲻���ϲ���������");
		return false;
	}
	public boolean Education() { 	// �ж�ѧ���Ƿ�Ϊ��ר����
		if (this.education.endsWith("����")||this.education.endsWith("Сѧ")||this.education.endsWith("��")) {
			System.out.println("����������ר�����Ļ��̶ȣ�����"+name + "�㲻���ϲ���������");
			return false;
		}
		
		return true;
	}
	public boolean Behavior() { // �ж��Ƿ����л����񹲺͹�Ů�Թ���
		if (this.country.equals("�л����񹲺͹�")&&this.gender.endsWith("Ů")) {
						return true;
		}else if (this.country.equals("�л����񹲺͹�")&&!this.gender.endsWith("Ů")){
			System.out.println("����С��ֻ����Ů�Բμӣ����Ժܱ�Ǹ��"+name + "�㲻���ϲ���������");
			return false;
		}else if (!this.country.equals("�л����񹲺͹�")&&this.gender.endsWith("Ů")){
			System.out.println("�ܱ�Ǹ,��������С��ֻ�����л����񹲺͹�����μӣ�����"+name + "�㲻���ϲ���������");
			return false;
		}
		System.out.println( "�����������л����񹲺͹�Ů�Թ�������"+name+"�㲻���ϲ���������");
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

