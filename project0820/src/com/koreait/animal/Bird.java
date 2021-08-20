package com.koreait.animal;

public class Bird{
	
	//소중하게...정의함..
	//메서드들간의 로직의 큰 차이가 없음에도, 새로운 메서드명을 정의해야 한다면, 오히려 
	//개발에 장애요인이 될 수 있다..따라서 sun에서는 하나의 클래스내에 메서드명을  중복정의할
	//수 있는 기법을 제공해준다...이를 가리켜 
	//메서드 오버로딩 (OrverLoading) , 단 오버로딩을 인정해주는 조건 
	//메서드명은 같되, 매개변수의 자료형 및 개수는 달라야한다...
	public void fly(){
		System.out.println("새가 날아갑니다");
	}
	//조금 더 높이 날자..
	public void fly(int height){
		System.out.println("새가 쪼금 더 높이 날아갑니다");
	}
	public void fly(String stop){
		System.out.println("새가 더욱 쪼금 더 높이 날아갑니다");
	}

}