package com.koreait.db1;

public class OperTest {

	public static void main(String[] args) {
		
		//3가지 (기본자료형) 
		//기본 자료형 데이터들간에는 서로 맞붙을수가 없다..
		int x=3;
		int y=5;
		System.out.println(x+y); //모든 연산 다 올수 잇다..
		
		
		//단) 문자열과 기본자료형간 생각..
		String s="apple";
		System.out.println(s+x); //에러 났어야 한다!!   "apppe" 연결해 "3" -->  "apple3" 
		//단 더하기 연산자는 연결자로 동작을 수행..

	}

}
