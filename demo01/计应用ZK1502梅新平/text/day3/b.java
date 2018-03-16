package day3;

public class b {
	public static void main(String[] args) {
		int x = 0;        
        for(int i=100;i<1000;i++){
            int b = i/100;        
            int s = (i-100*b)/10;        
            int g = (i-s*10-b*100);      
            
            if(i==g*g*g+s*s*s+b*b*b){
                x++;   
                System.out.print(i+" ");
            }
        }
//        System.out.println("¹²ÓÐ"+x+"¸ö");
	}
}
