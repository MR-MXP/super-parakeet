package text;

public class px {
	public static void main(String[] args) {
		
		int a[]={4,6,2,1,3,5};
		//插入
		for(int i=0;i<a.length;i++){  //第一个比较的元素
			for(int j=0;j<a.length;j++){ //  所有元素
				if(a[i]<a[j]){
					int t=a[i];
					a[i]=a[j];  
					a[j]=t;
				}
			}
		}
		//冒泡
/*		for(int i=0;i<a.length-1;i++){ //比较的轮数
			for(int j=0;j<a.length-1-i;j++){ // 每轮的次数
				if(a[j]>a[j+1]){
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;	
				}
			}
		}*/
		for(int i=0;i<a.length;i++){  //遍历数组
			System.out.print(a[i]);
		}
	}
}
