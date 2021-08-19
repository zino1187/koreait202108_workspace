package com.koreait.use;
/*  -d 옵션
	1) 해당 클래스를 컴파일시, 선언된 패키지를 자동으로 생성해준다!!
	2) 지정한 디렉토리로 .class 파일을 생성해 준다
*/
import com.koreait.animal.Cat;  // Cat.java(X),  Cat.class(O)

class UseCat{

	public static void main(String[] args){
		Cat c1=new Cat();
		System.out.println("지금 살아있는 고양이는 "+c1); 
	}
}