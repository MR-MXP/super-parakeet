package com.day01;

public class AutoBoxing {
	public static void main(String[] args) {
		//�ַ���ת��Ϊ������������
		String intStr="123";
		int it2 = Integer.parseInt(intStr);//ͨ��parseInt()
		System.out.println(it2);
		
		int it3 = new Integer(intStr);//ͨ�����췽������ʽ
		System.out.println(it3);
		//��������������ת��Ϊ�ַ���
		String ftStr= String.valueOf(12.1231f);   //valeOf()����
		System.out.println(ftStr);
		
		int i=4;
		System.out.println(i+" ");   //�ַ�������
	}
}
