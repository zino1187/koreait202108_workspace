package com.koreait.animal;

public class Dog{
	String name="루이";  //default
	int age=1;

	public String getName(){
		return name;
	}
	
	//이름을 변경할 수 있도록 허용해주는  setter 메서드
	//정의 이유: name 은 default로 선언되어 잇어서, 같은 패키지가 아니면 절대 접근이 불가능하기 때문에 
	//public으로 선언된 메서드를 제공해주자...
	public void setName(String name){
		this.name=name;
	}
}