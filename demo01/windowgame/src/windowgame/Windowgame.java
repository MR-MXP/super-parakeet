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
	Container c;  //主面板
	JPanel jp1,jp2;  //辅助面板
	JButton[] jb;   //按钮数组
	JButton jbx;   //开始按钮
	String url="";   //装图片地址
	//编写构造器
	public Windowgame(){
		//设置标题
		this.setTitle("翻窗小游戏");
		//设置大小
		this.setSize(350,350);
		//设置位置(居中为null)
		this.setLocationRelativeTo(null);
		//设置关闭
		this.setDefaultCloseOperation(3);
		//设置可拉伸
		this.setResizable(true);
		//获取主面板
		c=this.getContentPane();
		//设置布局格式
		c.setLayout(new BorderLayout());
		//准备辅助面板
		jp1=new JPanel();
		jp2=new JPanel();
		//设置辅助面板的格式
		jp1.setLayout(new GridLayout(5,5));
		jp2.setLayout(new FlowLayout());
		//辅助面板放入主面板
		c.add(jp1,BorderLayout.CENTER);
		c.add(jp2,BorderLayout.SOUTH);
		
		//准备组件
		//创建按钮数组
		jb=new JButton[25];
		for(int i=1;i<=25;i++){
			jb[i-1]=new JButton(new ImageIcon("src/img/1.png"));
			//获取图片地址
			url=jb[i-1].getIcon().toString();
			//将按钮数组中的按钮赋予隐藏值，从而能在点击的时候快速分辨点击的按钮
			jb[i-1].setActionCommand(i+"");
			jb[i-1].addActionListener(this);
			//组件放入辅助面板
			jp1.add(jb[i-1]);
		}
		//创建开始按钮
		jbx=new JButton("开始游戏");
		jbx.addActionListener(this);
		//组件放入辅助面板
		jp2.add(jbx);

	}
	public static void main(String[] args) {
		//设置窗体的可见性
		new Windowgame().setVisible(true);
	}
	
	//重写鼠标单击事件的方法
	public void actionPerformed(ActionEvent e) {
		//获取隐藏值
		String num=e.getActionCommand();
		//字符串改为整数
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
	//改变颜色方法
	public void changeImg(JButton jb1){
		
		if(jb1.getIcon().toString().equals(url)){
			jb1.setIcon(new ImageIcon("src/img/2.png"));
		}else{
			jb1.setIcon(new ImageIcon("src/img/1.png"));
		}
		
	}
	
}

