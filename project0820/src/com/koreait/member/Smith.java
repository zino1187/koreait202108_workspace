package com.koreait.member;

import com.koreait.animal.Dog;

public class Smith{
	String name="스미스";
	int sal=800; //default  묻지 땉ㅌ  같은 패키지에 있는 클래스만이 얘를 접근가능..

	/**
	이 메서드는 불쌍한 우리 스미스의 급여를 변경하기 위함임
	*/ 
	public void setSal(int sal){
		this.sal=sal;
	}

	public int getSal(){
		return sal;
	}

	/**Dog 도 자료형이므로, 당연히 매개변수로 사용가능..*/
	public void love(Dog d){
		System.out.println("내가 사랑하는 강아지 이름은"+d.getName());
	}
}