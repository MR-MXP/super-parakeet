package com.MoveCar.pack;

import com.car.pack.Car;
import com.people.pack.People;

public class MoveCar {
	People p1=new People();
	Car c=new Car("车门","油门","离合","刹车","方向盘","车轮");
	//打开车门
	public void Opendoor(){
		p1.moveHand();
		System.out.print("打开");
		c.CarDoor();
	}
	//关车门
	public void CloseDoor(){
		p1.moveHand();
		System.out.print("关上");
		c.CarDoor();
	}
	//踩下离合
	public void dBrake(){
		p1.dFoot();
		c.Clutch();
	}
	//踩下油门
	public void Depress(){
		p1.dFoot();
		c.Throttle();
	}
	//松开离合
	public void uBrake(){
		p1.uFoot();
		c.Clutch();
	}
	//向右转
	public void right(){
		p1.rHand();
		c.SteeringWheel();
	}
	//向右转
	public void left(){
		p1.lHand();
		c.SteeringWheel();
	}
	//停车
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