package arr03;

public class test01 {
	public static void main(String[] args) {
		int[] arr1=new int[]{5,6,3,7,23};
		int[] arr2=new int[5];
		arr2=arr1;
		for(int i=0;i<arr1.length;i++){
			System.out.print(" "+arr1[i]);	
		}
		System.out.println();
		for(int i=0;i<arr2.length;i++){
			System.out.print(" "+arr2[i]);
		}
		System.out.println();
	}
}
