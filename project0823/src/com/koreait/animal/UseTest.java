package com.koreait.animal;
class UseTest{
	public static void main(String[] args){
		//자바는 자료형의 총 4가지 이다~!!
		//객체자료형도 자료형이다...
		//객체자료형도 같은 종류의 자료형이라는 개념이 존재할까? 
		//즉 기본자료형인 char 와 숫자형 자료형간에는 같은 종류의 자료형관계가 성립하므로, 따라서 서로
		//형변환이 가능...
		//객체자료형도 같은 종류의 자료형이라는 개념이 존재할까? 
		Bird bird = new Bird();
		Duck duck = new Duck();

		//duck=bird; //현재로써는 불가 

		//기본자료형을 이해해보자 
		byte b = 5;//1byte
		int x=6; //4byte
		b=(byte)x; 

		duck=(Duck)bird;
	
	}
}
