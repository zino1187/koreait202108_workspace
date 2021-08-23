package com.koreait.human;

//백인,흑인,동양인의 모든 특징을 보유한 보편적 특징...
public class Man{
	//생성자 오버로딩!

	public Man(){

	}	
	
	public Man(int age){
		System.out.println("Man의 생성자 호출");
	}
	
	public void walk(){
		System.out.println("걸을 수 있다");
	}
	public void talk(){
		System.out.println("말할 수 있다");
	}
	
}
