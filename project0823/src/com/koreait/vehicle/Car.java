package com.koreait.vehicle;

//has a 특정 객체가 멤버변수로 객체를 보유한 상태를 가리켜 has a
public class Car{
	int price; //price 는 기본자료형이므로, 즉 사물이 아니므로  has a 관계로
	//보지 않는다!!!
	Wheel w; //has a 
	Engine e; //has a

	//생성자의 목적? 객체의 인스턴스가 생성될때 초기화를 담당!!!
	//따라서 현재 Car라는 클래스가 부품을 가지고 있다면, 이 부품은 차가 생성될때 같이 태어나야 한다..
	public Car(){
		w=new Wheel();
		e=new Engine();
	}
}
