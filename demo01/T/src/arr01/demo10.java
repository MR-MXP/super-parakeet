package arr01;

import java.util.Arrays;
import java.util.Scanner;

public class demo10 {
	public static void main(String[] args) {
		String name[] = new String []{"����0","�Ϻ�1","����2","���3","�人4","�Ĵ�5"};
		System.out.println("������Ҫɾ���ĵط���");
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		for(int i=0;i<name.length;i++){
			if(x==i){
				name[i]=null;
			for(int j=i;j<name.length-1;j++){
				String t;
				t=name[j];
				name[j]=name[j+1];
				name[j+1]=t;	
			}	
			}
		}
		System.out.println(Arrays.toString(name));
	}
}
