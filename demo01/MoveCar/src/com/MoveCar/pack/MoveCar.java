package com.MoveCar.pack;

import com.car.pack.Car;
import com.people.pack.People;

public class MoveCar {
	People p1=new People();
	Car c=new Car("����","����","���","ɲ��","������","����");
	//�򿪳���
	public void Opendoor(){
		p1.moveHand();
		System.out.print("��");
		c.CarDoor();
	}
	//�س���
	public void CloseDoor(){
		p1.moveHand();
		System.out.print("����");
		c.CarDoor();
	}
	//�������
	public void dBrake(){
		p1.dFoot();
		c.Clutch();
	}
	//��������
	public void Depress(){
		p1.dFoot();
		c.Throttle();
	}
	//�ɿ����
	public void uBrake(){
		p1.uFoot();
		c.Clutch();
	}
	//����ת
	public void right(){
		p1.rHand();
		c.SteeringWheel();
	}
	//����ת
	public void left(){
		p1.lHand();
		c.SteeringWheel();
	}
	//ͣ��
	public void stop(){
		p1.dFoot();
		c.Brake();
	}
	public static void main(String[] args) {
	MoveCar mc=new MoveCar();
	mc.Opendoor();
	mc.CloseDoor();
	mc.dBrake();
	mc.Depress();
	mc.uBrake();
	mc.right();
	mc.left();
	mc.stop();
	}
}