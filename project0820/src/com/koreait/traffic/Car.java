package com.koreait.traffic;

public class Car{
	String color;
	int speed; 
	int price;
	//������ 
	
	public Car(){
		color="red";
	}
	
	
	//�Ϲݸ޼��� 
	public void setColor(){
		color="red";
	}

	public static void main(String[] args){
		Car c = new Car();

		//c.setColor();//�̹� �¾ ��...
		System.out.println(c.color);

	}
}