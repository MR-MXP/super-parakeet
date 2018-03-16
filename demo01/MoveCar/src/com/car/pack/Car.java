package com.car.pack;

public class Car {
	String CarDoor;	//车门
	String Throttle;//油门
	String Clutch;	//离合
	String Brake;	//刹车
	String SteeringWheel;	//方向盘
	String Wheel;	//车轮
	
	public Car(String carDoor, String Throttle, String clutch, String brake,
			String steeringWheel, String wheel) {
		this.CarDoor = carDoor;
		this.Throttle = Throttle;
		this.Clutch = clutch;
		this.Brake = brake;
		this.SteeringWheel = steeringWheel;
		this.Wheel = wheel;
	}
	//车门
	public void CarDoor(){
		System.out.println(CarDoor);
	}
	
	//油门
	public void Throttle(){
		System.out.println(Throttle);
	}
	//离合
	public void Clutch(){
		System.out.println(Clutch);
	}
	//刹车
	public void Brake(){
		System.out.println(Brake);
	}
	//方向盘
	public void SteeringWheel(){
		System.out.println(SteeringWheel);
	}
}
