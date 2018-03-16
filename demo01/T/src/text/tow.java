package text;

import java.util.Scanner;

public class tow {
	
	public static void main(String[] args) {
/*		int math=0,day=0,sum=0;
		int y,m,d;
		Scanner s=new Scanner(System.in);
		System.out.println("请输入年份:");
		y=s.nextInt();
		System.out.println("请输入月份:");
		m=s.nextInt();
		System.out.println("请输入日:");
		d=s.nextInt();	
			for(int i=1;i<m;i++){
				math=i;
				if(math==1&&math==3&&math==5&&math==7&&math==8&&math==12){
					day=31;
				}else if(math==2){
					if(y%4==0&&y%100!=0||y%400==0){
						day=29;	
					}else{
						day=28;	
					}
				}else if(math==4&&math==6&&math==9&&math==11){
					day=30;
				}
				sum=sum+day;
			}
			System.out.println("今天是"+(sum+d)+"天");*/
	    int year,month,day,a=0,b=0;
			Scanner reader=new Scanner(System.in);
			System.out.println("请输入年份");
			year=reader.nextInt();
			System.out.println("请输入月份");
			month=reader.nextInt();
			System.out.println("请输入日");
			day=reader.nextInt();
		 for(int i=1;i<month;i++){                                                              
			switch(month){
			 case 1:
			 case 3:
			 case 5:
			 case 7: 
			 case 8:
			 case 10:
				case 12: 
				a=31;
			 break;
			 case 2:
			  if(year%4==0&&year%100!=0||year%400==0)
			   a=29;
			  else
			   a=28;
			 break;
			 case 4:
			 case 6:
			 case 9:
			 case 11:
			  a=30;
			 break;
		  }
		  b=b+a;
		 }
			b=b+day;
			System.out.println("这是这一年的第"+b+"天");
	}
}
