package com.koreait.project0827.game;

import java.lang.reflect.Method;

public class Test { //Object
	
	public void getName() {
	}
	public void getAge() {
	}
	
	public Test() {
		//현재 클래스에 대한 정보를 추출해보자!!
		Class myClass=this.getClass(); //Test 클래스 반환
		Method[] method=myClass.getMethods(); //Test클래스의 보유 메서드 목록 
		System.out.println("제가 가진 메서드는 "+method.length);
		for(Method obj :method) {
			System.out.println(obj.getName());
		}
		
	}
	
	public static void main(String[] args) {
		new Test();
	}
}
