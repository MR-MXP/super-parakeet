package obj01;

public class Test {
	public static void main(String[] args) {
		Mathematics m1=new Mathematics();
//		m1.a=15.12;
//		System.out.println(Math.ceil(m1.a));
		System.out.println(m1.ceil(15.21));	
		System.out.println(m1.floor(15.21));	
		System.out.println(m1.rint(15.71));	
		System.out.println(m1.pow(2,2));	
		System.out.println(m1.abs(-15.21));	
		System.out.println(m1.max(123,132));
		System.out.println(m1.min(123,132));
	}
}
