package com.koreait.project0827.thread;

import java.util.ArrayList;
import java.util.List;

/*
자바의 모든 기본자료형은 각각 1:1 대응되는 Wrapper 클래스가 지원된다..
ex)   int --> Integer , byte --> Byte, short --> Short, long --> Long , float --> Float , double --> Double
		개발하다보면, 기본자료형을 객체자료형으로 형변환할 일이 생긴다...
*/
public class WrapperStudy {
	public static void main(String[] args) {
		/* 컬렉션 프레임웍 : 객체를 모아서 처리하는 데 유용한 라이브러리 , java.util 패키지 지원 
		 * 순서없는거: Set, 순서있는거 List, key-value의쌍 Map : 공통특징 오직 객체만을 대상으로 한다!!
		 * */
		
		//기본자료형을 객체자료형으로 사용할때..wrapper클래스를 이용 
		List list = new ArrayList();
		int x=1;//기본 자료형이다!!  <---> 객체자료형으로 자동 형변환 해줌.이때 사용된 객체가 바로 Wrapper 
		//Integer it=new Integer(x);  // 1 --> 1객체 
		list.add(x); //Boxing 내부적으로 발생..
		
		//  문자열  "1" ---> 정수형으로 변환하고자 할때 
		String k="5"; //정수랑 상관없다..   "5"  -- "벗기면"  5
		int y=7;
		int result=y+Integer.parseInt(k);
		
	}
}









