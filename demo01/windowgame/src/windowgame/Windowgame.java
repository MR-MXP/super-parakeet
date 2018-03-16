package windowgame;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Windowgame extends JFrame implements ActionListener{
	Container c;  //�����
	JPanel jp1,jp2;  //�������
	JButton[] jb;   //��ť����
	JButton jbx;   //��ʼ��ť
	String url="";   //װͼƬ��ַ
	//��д������
	public Windowgame(){
		//���ñ���
		this.setTitle("����С��Ϸ");
		//���ô�С
		this.setSize(350,350);
		//����λ��(����Ϊnull)
		this.setLocationRelativeTo(null);
		//���ùر�
		this.setDefaultCloseOperation(3);
		//���ÿ�����
		this.setResizable(true);
		//��ȡ�����
		c=this.getContentPane();
		//���ò��ָ�ʽ
		c.setLayout(new BorderLayout());
		//׼���������
		jp1=new JPanel();
		jp2=new JPanel();
		//���ø������ĸ�ʽ
		jp1.setLayout(new GridLayout(5,5));
		jp2.setLayout(new FlowLayout());
		//���������������
		c.add(jp1,BorderLayout.CENTER);
		c.add(jp2,BorderLayout.SOUTH);
		
		//׼�����
		//������ť����
		jb=new JButton[25];
		for(int i=1;i<=25;i++){
			jb[i-1]=new JButton(new ImageIcon("src/img/1.png"));
			//��ȡͼƬ��ַ
			url=jb[i-1].getIcon().toString();
			//����ť�����еİ�ť��������ֵ���Ӷ����ڵ����ʱ����ٷֱ����İ�ť
			jb[i-1].setActionCommand(i+"");
			jb[i-1].addActionListener(this);
			//������븨�����
			jp1.add(jb[i-1]);
		}
		//������ʼ��ť
		jbx=new JButton("��ʼ��Ϸ");
		jbx.addActionListener(this);
		//������븨�����
		jp2.add(jbx);

	}
	public static void main(String[] args) {
		//���ô���Ŀɼ���
		new Windowgame().setVisible(true);
	}
	
	//��д��굥���¼��ķ���
	public void actionPerformed(ActionEvent e) {
		//��ȡ����ֵ
		String num=e.getActionCommand();
		//�ַ�����Ϊ����
		int i=Integer.parseInt(num);
		if(e.getSource()==jbx){
			for( i=1;i<=25;i++){
			 jb[i].setIcon(new ImageIcon("src/img/1.png"));
			}
		}else{
			if(i==1){
				changeImg(jb[i-1]);
				changeImg(jb[i]);
				changeImg(jb[i+4]);
			}
			if(i==2||i==3||i==4){
				changeImg(jb[i-2]);
				changeImg(jb[i-1]);
				changeImg(jb[i]);
				changeImg(jb[i+4]);
			}
			if(i==22||i==23||i==24){
				changeImg(jb[i-1]);
				changeImg(jb[i]);
				changeImg(jb[i-2]);
				changeImg(jb[i-6]);
			}
			if(i==5){
				changeImg(jb[i-1]);
				changeImg(jb[i+4]);
				changeImg(jb[i-2]);
			}
			if(i==6||i==11||i==16){
				changeImg(jb[i-1]);
				changeImg(jb[i]);
				changeImg(jb[i+4]);
				changeImg(jb[i-6]);
			}
			if(i==10||i==15||i==20){
				changeImg(jb[i-2]);
				changeImg(jb[i-1]);
				changeImg(jb[i+4]);
				changeImg(jb[i-6]);
			}
			if(i==7||i==8||i==9||i==12||i==13||i==14||i==17||i==18||i==19){
				changeImg(jb[i-2]);
				changeImg(jb[i-1]);
				changeImg(jb[i]);
				changeImg(jb[i+4]);
				changeImg(jb[i-6]);
			}
			if(i==21){
				changeImg(jb[i-1]);
				changeImg(jb[i]);
				changeImg(jb[i-6]);
			}
			if(i==25){
				changeImg(jb[i-1]);
				changeImg(jb[i-2]);
				changeImg(jb[i-6]);
			}

		}
		
	}
	//�ı���ɫ����
	public void changeImg(JButton jb1){
		
		if(jb1.getIcon().toString().equals(url)){
			jb1.setIcon(new ImageIcon("src/img/2.png"));
		}else{
			jb1.setIcon(new ImageIcon("src/img/1.png"));
		}
		
	}
	
}

