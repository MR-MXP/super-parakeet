package day02;

import java.util.Scanner;

//∑÷÷ß”Ôæ‰≈–∂œ≥…º®
public class demo04 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();
		int x=i/10;
		switch (x) {
		case 10:
		case 9:
			System.out.println("A+");
			break;
		case 8:
			System.out.println("A");
			break;
		case 7:
			System.out.println("B");
			break;
		case 6:
			System.out.println("C");
			break;
		default:
			System.out.println("NB");
			break;
		}
	}
}
