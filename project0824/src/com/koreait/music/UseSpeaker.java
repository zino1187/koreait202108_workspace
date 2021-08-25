package com.koreait.music;
import com.koreait.fly.Drone;
import com.koreait.ride.Roller;
class UseSpeaker{

	public static void main(String[] args){
		BSpeaker bs = new BSpeaker();
		bs.supportMp3();
		//bs.fly();
		//bs.run();

		Drone d=bs; //스피커는 드론 형이다!!
		d.fly();

		Roller r=bs; //스피커는 롤러 형이다! 
		r.run();
	}
}
