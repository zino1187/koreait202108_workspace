package com.koreait.project0827.game;

import java.awt.Graphics;
import java.awt.Image;

//주인공을 정의한다
public class Hero {
	int x;
	int y;
	int width;
	int height;
	int velX;
	int velY;
	Image image;
	
	public Hero(int x, int y, int width, int height, int velX, int velY, Image image) {
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
		this.velX=velX;
		this.velY=velY;
		this.image=image;
	}
	
	public void tick() {
		this.x+=this.velX;
		this.y+=this.velY;
	}
	public void render(Graphics g) {
		g.drawImage(image, x, y, width, height, null);
	}
}






