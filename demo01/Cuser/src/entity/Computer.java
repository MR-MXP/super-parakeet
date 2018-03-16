package entity;

public class Computer {
	String ip;
	int Cnum;

	public Computer() {
		
	}
	public Computer(String ip, int cnum) {
		super();
		this.ip = ip;
		this.Cnum = cnum;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public int getCnum() {
		return Cnum;
	}
	public void setCnum(int cnum) {
		this.Cnum = cnum;
	}
}
