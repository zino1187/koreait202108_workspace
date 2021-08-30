package com.koreait.project0827.game;

import java.awt.Graphics;
import java.awt.Image;

//총알을 정의한다
public class Bullet extends GameObject{

	public Bullet(int x, int y, int width, int height, int velX, int velY, Image image) {
		super(x, y, width, height, velX, velY, image);
	}

	@Override
	public void tick() {
		this.x+=this.velX;
		this.y+=this.velY;
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(image, x, y, width, height, null);
	}
	
}
