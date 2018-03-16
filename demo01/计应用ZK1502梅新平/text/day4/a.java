package day4;

import java.util.Scanner;

public class a {

	public static void main(String[] args) {

		int n,i;
		int a;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(i=2;i<=n;i++){
			if(n%i==0){
				System.out.print(i+",");
				n=n/i;
				i--;

			}
		}
	}

}
