package arr01;

import java.util.Arrays;

public class demo09 {
	public static void main(String[] args) {
		int oldArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
		int newArr[]=new int[12];
		int j=0;
		for(int i=0;i<oldArr.length;i++){
			if(oldArr[i]!=0){
					newArr[j]=oldArr[i];
					j++;
			}
		}
		System.out.println(Arrays.toString(newArr));
	}
}
