package arr01;
//×î´óÖµ
public class demo01 {
	public static void main(String[] args) {
		int[] a={9,4,2,5,6,8,1,3,7};
		int max=a[0];
		for(int i=1;i<a.length;i++){
			if(a[i]>=max){
				max=a[i];
			}
		}
	System.out.println(max);
	}
}
