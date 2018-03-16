package arr02;

import java.util.Scanner;

public class demo01 {  
    public static void main(String[] args) {  
        Scanner in = new Scanner(System.in);  
          
        System.out.println("你想知道前几个月的兔子的数量");  
        int month = in.nextInt();  
          
        int[] mon = new int[month];  
        if(month < 3){  
            System.out.println("第" + month + "个月有 1 对兔子，共 2 只");  
        }  
        else  
            for(int i = 2; i < month; i++){  
                mon[0] = mon[1] = 1;  
                mon[i] = mon[i - 1] + mon[i - 2];  
                System.out.printf("第 %d 个月有 %d 对兔子，共 %d 只兔子\n", i + 1, mon[i], 2 * mon[i]);  
            }  
    }  
} 
