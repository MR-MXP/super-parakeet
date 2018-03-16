package com.person;

public class person {
	private String name;
	private String ID;
	public void sum(String ... nunberStrings){
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public void show(){
		System.out.println(name+" "+ID);
	}
}
