package com.koreait.project0827.game;

import java.awt.Graphics;
import java.awt.Image;

//게임 배경을 제어하기 위해 객체로 정의한다..
public class GameBg {
	int x;
	int y;
	int velX; //x축으로의 변화량 
	int velY; //y축으로의 변화량
	int width;
	int height;
	Image image;
	
	public GameBg(int x, int y, int width, int height, int velX, int velY, Image image){
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
		this.velX=velX;
		this.velY=velY;
		this.image=image;
	}
	
	public void tick() { //물리값 변화시킬 메서드 
		this.x=this.x-this.velX;
		this.y=this.y-this.velY;
	}
	
	public void render(Graphics g) { //tick에 의해 변화된 물리값을 화면에 적용할 (그래픽처리)랜더링 메서드
		g.drawImage(image, x, y, width, height, null); //옵저벼는 비워놓기
	}
}






