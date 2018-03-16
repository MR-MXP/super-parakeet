package test;

import java.util.Scanner;

import entity.Computer;
import biz.ComputerBiz;

public class ComputerTest {
	public static void main(String[] args) {
		ComputerBiz cb=new ComputerBiz();
		Computer pc=new Computer();
		Scanner s=new Scanner(System.in);
		//添加计算机
		cb.addComputer(pc);
		//显示计算机
		cb.ShowComputer(pc);
		//删除计算机
		System.out.println("请输入要删除的计算机编号：");	
		cb.delComputer(s.nextInt());
		cb.ShowComputer(pc);
	}
}
