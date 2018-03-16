package biz;

import java.util.Scanner;

import entity.Computer;

public class ComputerBiz {
	Computer[] pc=new Computer[3];
	Scanner s=new Scanner(System.in);
	//增加计算机信息
	public void addComputer(Computer computer){
		for(int i=0;i<pc.length;i++){
			//初始化数组
			pc[i]=new Computer();
			System.out.println("====================请输入第"+(i+1)+"个用户信息====================");
			System.out.print("请输入Ip地址：");
			pc[i].setIp(s.next());
			System.out.print("请输入计算机编号：");
			pc[i].setCnum(s.nextInt());
			
		}
/*		System.out.println("添加计算机：");
		for(int i=0;i<pc.length;i++){
			System.out.println("====================请输入第"+(i+1)+"个用户信息====================");
			System.out.print("请输入Ip地址：");
			pc[i].setIp(s.next());
			System.out.print("请输入计算机编号：");
			pc[i].setCnum(s.nextInt());
		}*/
	}
	//显示计算机
	public void ShowComputer(Computer computer){
		System.out.println("====================现有计算机信息====================");
		for(int i=0;i<pc.length;i++){
			System.out.print("第"+(i+1)+"台计算机为：   ");
			System.out.print("ip地址为："+pc[i].getIp()+";");
			System.out.println("编号为为："+pc[i].getCnum()+";");
		}
	}
	//删除计算机信息
	public void delComputer(int num){
		for(int i=0;i<pc.length;i++){
			if(num==pc[i].getCnum()){
				pc[i]=null;
				clear();
			}
		}
	}
	 private void clear() {
	        for (int i = 0; i < pc.length - 1; i++) {
	            if (null == pc[i]) {
	            	pc[i] = pc[i + 1];
	            	pc[i + 1] = null;
	            }
	        }
	    }

	
}
