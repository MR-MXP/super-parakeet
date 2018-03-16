package day02;
//101-201之间的素数
public class demo01 {
	public static void main(String[] args) {
		other:for(int i=101;i<201;i++){
			for(int j=2;j<Math.sqrt(i);j++){
				if(i%j==0){
					continue other;
				}
			}
			System.out.println(i);
		}
	}
}
