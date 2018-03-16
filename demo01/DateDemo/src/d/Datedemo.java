package d;

import java.util.Date;

public class Datedemo {
	public static void main(String[] args) {
		Date d=new Date();
		System.out.println(d.toString());
		System.out.println(d.getTime());
		System.out.println(d.hashCode());
	}
}
