package day02;

//Ë®ÏÉ»¨
public class demo02 {
	public static void main(String[] args) {
		int a,b,c,sum;
		for(int i=100;i<1000;i++){
			a=i/100;
			b=(i/10)%10;
			c=i%10;
			sum=a*a*a+b*b*b+c*c*c;
			if(i==sum){
				System.out.println(sum);
			}
		}
	}
}
