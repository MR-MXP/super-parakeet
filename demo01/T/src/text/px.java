package text;

public class px {
	public static void main(String[] args) {
		
		int a[]={4,6,2,1,3,5};
		//����
		for(int i=0;i<a.length;i++){  //��һ���Ƚϵ�Ԫ��
			for(int j=0;j<a.length;j++){ //  ����Ԫ��
				if(a[i]<a[j]){
					int t=a[i];
					a[i]=a[j];  
					a[j]=t;
				}
			}
		}
		//ð��
/*		for(int i=0;i<a.length-1;i++){ //�Ƚϵ�����
			for(int j=0;j<a.length-1-i;j++){ // ÿ�ֵĴ���
				if(a[j]>a[j+1]){
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;	
				}
			}
		}*/
		for(int i=0;i<a.length;i++){  //��������
			System.out.print(a[i]);
		}
	}
}
