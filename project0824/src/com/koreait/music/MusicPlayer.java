package com.koreait.music;

/* 이 클래스는 모든 사원이 구현할 음향기기 클래스의 들어갈 
필수적인 기능을 강제할 수 있는 역할을 수행할 클래스!!
*/

//이 클래스는 의도하여 불완전하게 정의한 것이다!!
public abstract class MusicPlayer{
	// mp3 지원하는 기능 
	//볼륨을 올리는 기능
	//볼륨을 내리는 기능 

	//abstract 수식자를 이용하면, 컴파일러가 이 메서드를 추상메서드로 인식...
	public abstract void supportMp3();//미래의 어느 시점에 각각의 개발자들이 어떤 기기를
	//만들지 예측할 수 없으므로, 코드 내용또한 해당 기기마다 적절한 예측불가..
	public abstract void volumeUp();
	public abstract void volumeDown();
}	
