package text;

import java.util.Scanner;

public class three {
	public static void main(String[] args) {
		int[] a=new int[20];
		int[] b=new int[a.length+1];
		int x,y;
		System.out.println("������20�����֣�");
		for(int i=0;i<a.length;i++){
			a[i]=i;
			b[i]=a[i];
			System.out.print(a[i]+" ");
		}
		System.out.println("");
		System.out.println("��������������:");
		Scanner s=new Scanner(System.in);
		x=s.nextInt();
		System.out.println("������������λ��:");
		y=s.nextInt()-1;
		for(int i=0;i<b.length;i++){   //��b���鸳ֵ
			//yλ��ǰ�����ݲ���
			if(i<y){
				b[i]=a[i];
			}else if(i==y){
				b[i]=x;
			}else{
				b[i]=a[i-1];
			}
			System.out.print(b[i]+"  ");
		}
		
		
		
		
	}
}
