package arr01;

import java.util.Scanner;

public class demo11 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String password=s.next();
		char[] p=password.toCharArray();
		for(int i=0;i<p.length;i++){
			p[i]=(char)(p[i]^2000);
			System.out.print(p[i]);
		}
	}

}
