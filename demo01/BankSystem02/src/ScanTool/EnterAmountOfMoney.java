package ScanTool;

import java.io.BufferedReader;
import java.io.InputStreamReader;

	//输入工具
public class EnterAmountOfMoney {
	public static String scan(){  //从键盘录入数据 
		String str="";
		try {	
			BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
			str=buf.readLine();
		} catch (Exception e) {
			
		}
		return str;
	}
	//将键盘中录入的数据转换为Int型
	public static int scanInt(){
		int temp=0;
		try {
			temp=Integer.parseInt(scan());
		} catch (Exception e) {
			System.out.println("输入不合法,请输入整数！");
		}
		return temp;
	}
}
