package text;

public class digui2 {
	public static int digui(int n){
		if(n<=1){
			return 1;
		}else{
			return n*digui(n-1);
		}
	}
	public static void main(String[] args) {
		System.out.println(digui(4));
	}
}
