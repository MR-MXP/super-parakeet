package text;

import java.util.Random;

public class sj {
	public static void main(String[] args) {
		//����һ�������
		Random r=new Random();
		//����һ������Ϊ9������
		int[] a=new int[9];
		for(int i=0;i<a.length;i++){
			//��Ԫ�ظ����ֵ
			a[i]=r.nextInt(10);
			for(int j=0;j<i;j++){
				//�ж����ֵ�Ƿ��ظ�
				if(a[i]==a[j]){
					i--;
					break;
				}
			}
		}
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+"  ");
		}
	}
}
