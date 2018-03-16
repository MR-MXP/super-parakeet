package arr01;

public class demo07 {
	public static void main(String[] args) {
		int[][] a=new int[][]{{22,18,36},{27,34,58},{12,51,32},{14,52,64}};
		int[][] b=new int[3][4];
		System.out.println("4行3列：");
		for(int i=0;i<4;i++){
			for(int j=0;j<3;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("3行4列：");
		for(int i=0;i<b.length;i++){
			for(int j=b[i].length-1;j>=0;j--){
				b[i][j]=a[j][i];
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
}
