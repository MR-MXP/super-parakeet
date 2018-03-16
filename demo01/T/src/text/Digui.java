package text;

public class Digui {
    public static int Fribonacci(int n){
        if(n<=2)
            return 1;
        else
     	   //µÝÍÆ
           return Fribonacci(n-1)+Fribonacci(n-2);

   }
	  public static void main(String[] args){
		           System.out.println(Fribonacci(6));
		           }

}
