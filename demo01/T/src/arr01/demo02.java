package arr01;

//—°‘Ò≈≈–Ú
public class demo02 {
	public static void main(String[] args) {
		int[] a={9,4,2,5,6,8,1,3,7};
		for(int i=0;i<a.length-1;i++){
			for(int j=i+1;j<a.length-1;j++){
				if(a[i]>a[j]){
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
//		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++){
			System.out.print(" "+a[i]);
		}
		//foreach—≠ª∑
/*		for (int i : a) {
			System.out.print(i);
		}*/
		
	}
}
