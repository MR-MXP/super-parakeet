package obj01;

public class Pen{
	int psize;//笔尖粗细
	int pcontent;//墨水量
	int plength; //长度
	int pradius; //半径
	String pcolor; //颜色
	String pcap; //有无笔帽


/*	public Pen(int psize, int pcontent, int plength, int pradius,
			String pcolor, String pcap) {
		this.psize = psize;
		this.pcontent = pcontent;
		this.plength = plength;
		this.pradius = pradius;
		this.pcolor = pcolor;
		this.pcap = pcap;
	}*/
	//画画
	public void Draw(){
		System.out.println("画画");
	}
	//写字
	public void Write(){
		System.out.println("写字");
	}
	//更换墨水
	public void Cc(){
		System.out.println("更换墨水");
	}
	public void show(){
		System.out.println("这是一只"+psize+"cm长"+pcontent+"毫升"+pcolor+"色的笔");
	}
	public static void main(String[] args) {
		Pen p1=new Pen();
		p1.psize=10;
		p1.pcontent=20;
		p1.pcolor="紫色";
		p1.show();
	}
}
