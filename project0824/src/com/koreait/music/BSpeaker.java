package com.koreait.music;
import com.koreait.ride.Roller;
import com.koreait.fly.Drone;

//블루투스 스피커 음향기기를 정의..
//부모클래스가 추상클래스인 경우, 자식객체는 부모가 완성하지 못한, 불완전한 부분을
//완성을 의무를 부여받는다..즉 구현강제 받는다...
public class BSpeaker extends MusicPlayer implements Roller, Drone{
								/* is a */                  /* is a */
	public void connect(){
		System.out.println("근거리 블루투스 네트웍 연결");
	}
	
	//오버라이딩..
	public void supportMp3(){
		System.out.println("블루투스를 연동한 MP3 파일 로드");
	}
	public void volumeUp(){
		System.out.println("블루투스를 연동한 볼륨 올리기");
	}
	public void volumeDown(){
		System.out.println("블루투스를 연동한 볼륨 내리기");
	}
	public void run(){
		System.out.println("블루투스 기기를 타고 달립니다");
	}
	public void fly(){
		System.out.println("블루투스 기기를 타고 하늘을 납니다");
	}
}
