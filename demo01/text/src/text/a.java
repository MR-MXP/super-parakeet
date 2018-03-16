package text;

import java.util.Scanner;

public class a {
    public static void main(String[] args) {
    	System.out.println("请输入一个整数：");
        Scanner a=new Scanner(System.in);
        int i=2;
        int n;
        n=a.nextInt();
        System.out.print(n+"质因数为：");
        for (i=2;i<=n;i++){
            while (n!=i){
                if(n%i==0) {
                    n = n / i;
                    System.out.print(i+"*");
                }
                else break;
            }
        }
        System.out.println(n);
    }
}