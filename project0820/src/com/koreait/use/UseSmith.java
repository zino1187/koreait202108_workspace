package com.koreait.use;

import com.koreait.member.Smith;//쓰기 위해..
import com.koreait.animal.Dog;//쓰기 위해..

class UseSmith{
	public static void main(String[] args){
		//스미스의 급여를 바꿔보자!!
		Smith s = new Smith(); //인스턴스 생성 
		s.setSal(6000);//call by value 값에 의한 호출
		System.out.println("스미스의 급여는 "+s.getSal());

		//스미스가 보유한 love() 메서드를 호출하여 실행해보자!!
		Dog dog = new Dog(); //인스턴스 1개 생성
		dog.setName("뽀미");

		s.love(new Dog());//call by reference 주소값에 의한 호출

	}	
}