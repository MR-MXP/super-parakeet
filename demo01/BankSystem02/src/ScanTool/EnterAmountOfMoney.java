package ScanTool;

import java.io.BufferedReader;
import java.io.InputStreamReader;

	//���빤��
public class EnterAmountOfMoney {
	public static String scan(){  //�Ӽ���¼������ 
		String str="";
		try {	
			BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
			str=buf.readLine();
		} catch (Exception e) {
			
		}
		return str;
	}
	//��������¼�������ת��ΪInt��
	public static int scanInt(){
		int temp=0;
		try {
			temp=Integer.parseInt(scan());
		} catch (Exception e) {
			System.out.println("���벻�Ϸ�,������������");
		}
		return temp;
	}
}
