package text;

import java.util.Scanner;

public class textone {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();
		if (i<10) {
			for (int j = 0; j < 10; j++) {
				System.out.println("*");
				for (int k = j; k < 5; k++) {
					System.out.print("*");
				}
			}
		}
		System.out.println(i);
	}
}
