package com.koreait.project0827.game;

import java.awt.Graphics;
import java.awt.Image;

//게임 배경을 제어하기 위해 객체로 정의한다..
public class GameBg extends GameObject{
	
	public GameBg(int x, int y, int width, int height, int velX, int velY, Image image){
		super(x, y, width ,height, velX, velY, image);
	}
	
	public void tick() { //물리값 변화시킬 메서드 
		this.x=this.x-this.velX;
		this.y=this.y-this.velY;
		
		if(this.x < -width ) { //화면에서 벗어나면, 다시 화면의 우측 끝으로 보내기 
			this.x=width;
		}
	}
	
	public void render(Graphics g) { //tick에 의해 변화된 물리값을 화면에 적용할 (그래픽처리)랜더링 메서드
		g.drawImage(image, x, y, width, height, null); //옵저벼는 비워놓기
	}
}






