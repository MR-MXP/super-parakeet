package com.car.pack;

public class Car {
	String CarDoor;	//����
	String Throttle;//����
	String Clutch;	//���
	String Brake;	//ɲ��
	String SteeringWheel;	//������
	String Wheel;	//����
	
	public Car(String carDoor, String Throttle, String clutch, String brake,
			String steeringWheel, String wheel) {
		this.CarDoor = carDoor;
		this.Throttle = Throttle;
		this.Clutch = clutch;
		this.Brake = brake;
		this.SteeringWheel = steeringWheel;
		this.Wheel = wheel;
	}
	//����
	public void CarDoor(){
		System.out.println(CarDoor);
	}
	
	//����
	public void Throttle(){
		System.out.println(Throttle);
	}
	//���
	public void Clutch(){
		System.out.println(Clutch);
	}
	//ɲ��
	public void Brake(){
		System.out.println(Brake);
	}
	//������
	public void SteeringWheel(){
		System.out.println(SteeringWheel);
	}
}
