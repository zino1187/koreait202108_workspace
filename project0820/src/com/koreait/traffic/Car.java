package com.koreait.traffic;

public class Car{
	String color;
	int speed; 
	int price;
	//생성자 
	
	public Car(){
		color="red";
	}
	
	
	//일반메서드 
	public void setColor(){
		color="red";
	}

	public static void main(String[] args){
		Car c = new Car();

		//c.setColor();//이미 태어난 후...
		System.out.println(c.color);

	}
}