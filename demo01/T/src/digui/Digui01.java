package digui;
//101-201֮�������
public class Digui01 {

		/**
		 * @param args
		 */
		public static void main(String[] args) {		
				System.out.println(sum(100));
		}
		/**
		 * @param ��ͷ���
		 */
		public static int sum(int num){
			if(num == 1){
				return 1;
			}
			return num + sum(num-1);
			
		}

	}
