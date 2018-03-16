package arr01;

import java.util.Arrays;

public class demo08 {
	public static void main(String[] args) {
		int a[] = {1,3,5,7,9};
		int b[] = {0,2,4,6,8};
		int all[]=new int[10];
		System.arraycopy(a, 0, all, 0, a.length);
		System.arraycopy(b, 0, all, a.length, b.length);
		System.out.println(Arrays.toString(all));
	}
}
