package day02;

public class demo05 {
	 public static void main(String[] args) {  
	        System.out.println("1000以内的完数有：");  
	        for(int num = 1; num < 1000; num++){  
	            isWholeNumber(num);  
	        }  
	    }  
	  
	    private static void isWholeNumber(int num) {  
	        // TODO Auto-generated method stub  
	        int sum = 0;  
	        for(int i = 1; i <= num / 2; i++){  
	            if(num % i == 0){  
	                sum += i;  
	            }  
	        }  
	          
	        if(sum == num)  
	            System.out.println(num);  
	    }  
}
