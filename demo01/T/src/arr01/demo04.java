package arr01;

import java.util.Arrays;

//ц╟ещеепР
public class demo04 {
	public static void main(String[] args) {
		int[] a={4,6,3,1,2,5};
		for(int i=0;i<a.length-1;i++){
			for(int j=0;j<a.length-1-i;j++){
				if(a[j]<a[j+1]){
					int t=a[j+1];
					a[j+1]=a[j];
					a[j]=t;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
