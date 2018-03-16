package entity;

public class Computer{
	private String IP;
	private int Num;
	
	public Computer() {
		
	}
	public Computer(String iP, int num) {
		IP = iP;
		Num = num;
	}
	public int getNum() {
		return Num;
	}
	public void setNum(int num) {
		Num = num;
	}
	public String getIP() {
		return IP;
	}
	public void setIP(String iP) {
		IP = iP;
	}
}
