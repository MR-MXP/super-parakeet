package obj01;

public class Pen{
	int psize;//�ʼ��ϸ
	int pcontent;//īˮ��
	int plength; //����
	int pradius; //�뾶
	String pcolor; //��ɫ
	String pcap; //���ޱ�ñ


/*	public Pen(int psize, int pcontent, int plength, int pradius,
			String pcolor, String pcap) {
		this.psize = psize;
		this.pcontent = pcontent;
		this.plength = plength;
		this.pradius = pradius;
		this.pcolor = pcolor;
		this.pcap = pcap;
	}*/
	//����
	public void Draw(){
		System.out.println("����");
	}
	//д��
	public void Write(){
		System.out.println("д��");
	}
	//����īˮ
	public void Cc(){
		System.out.println("����īˮ");
	}
	public void show(){
		System.out.println("����һֻ"+psize+"cm��"+pcontent+"����"+pcolor+"ɫ�ı�");
	}
	public static void main(String[] args) {
		Pen p1=new Pen();
		p1.psize=10;
		p1.pcontent=20;
		p1.pcolor="��ɫ";
		p1.show();
	}
}
