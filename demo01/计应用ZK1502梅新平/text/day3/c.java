package day3;

public class c {
	public static void main(String[] args) {
        int a = 1, b = 1, c = 0;  
        for (int i = 1; i <= 18; i++) {  
            c = a + b;  
            a = b;  
            b = c;  
            
        } 
        System.out.print(c); 
	}
}
