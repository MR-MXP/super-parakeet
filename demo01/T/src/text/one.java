package text;

import java.util.Arrays;

public class one {
	public static void main(String[] args) {
/*		int i,j;
		int a;
		for(i=1;i<10;i++){
			for(j=1;j<10;j++){
				a=i*j;
				System.out.println(i+"*"+j+"="+a);
			}
			System.out.println("\r");
		}*/
		        int[] arr = new int[] {17, 21, 6, 59, 31, 13, 3};
		         
		         System.out.println("ԭʼ���飺");
		         for(int i=0; i<arr.length; i++) {
		             System.out.print(arr[i] + " ");
		         }
		        
		        Arrays.sort(arr);        // ���ֵ�˳������
		        
		        System.out.println("\n���������飺");
		        for(int i=0 ; i<arr.length; i++) {
		            System.out.print(arr[i] + " ");
		        }
	}
}
