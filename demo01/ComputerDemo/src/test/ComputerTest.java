package test;

import java.util.Scanner;

import biz.ComputerBiz;
import entity.Computer;

public class ComputerTest {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		ComputerBiz cb=new ComputerBiz();
		System.out.println("*********************添加电脑信息*********************");
		for(int i=0;i<3;i++){	
			System.out.println("====请输入第"+(i+1)+"个用户信息====");
			cb.addComputer(InputCp());	
		}
		showAllUser(cb.getComputer());
		
/*		System.out.println("修改电脑信息：");
		cb.modifyComputer(new Computer("192.168.0.1",12));
		showAllUser(cb.getComputer());*/
	}
	//输入信息
	public static Computer InputCp(){
		Computer cp=new Computer();
		System.out.print("请输入IP:");
		cp.setIP(s.next());
		System.out.print("请输入编号:");
		cp.setNum(s.nextInt());
		return cp;
	}
	//显示所有电脑信息
	public static void showAllUser(Computer[] computers){
		for(int i=0;i<computers.length;i++){
			if(computers[i]!=null){
				System.out.println("第"+(i+1)+"台电脑信息：");
				System.out.print("电脑IP："+computers[i].getIP());
				System.out.print("电脑编号："+computers[i].getNum());
			}
		}
	}
}
