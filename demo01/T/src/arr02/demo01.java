package arr02;

import java.util.Scanner;

public class demo01 {  
    public static void main(String[] args) {  
        Scanner in = new Scanner(System.in);  
          
        System.out.println("����֪��ǰ�����µ����ӵ�����");  
        int month = in.nextInt();  
          
        int[] mon = new int[month];  
        if(month < 3){  
            System.out.println("��" + month + "������ 1 �����ӣ��� 2 ֻ");  
        }  
        else  
            for(int i = 2; i < month; i++){  
                mon[0] = mon[1] = 1;  
                mon[i] = mon[i - 1] + mon[i - 2];  
                System.out.printf("�� %d ������ %d �����ӣ��� %d ֻ����\n", i + 1, mon[i], 2 * mon[i]);  
            }  
    }  
} 
