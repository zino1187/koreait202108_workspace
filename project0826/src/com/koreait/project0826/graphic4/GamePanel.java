package com.koreait.project0826.graphic4;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;

//실제 게임이 그려질 패널
public class GamePanel extends JPanel{
	public static final int WIDTH=1280;
	public static final int HEIGHT=640;
	
	Toolkit kit=Toolkit.getDefaultToolkit();
	Image bg_image; //게임 배경 이미지
	Image hero_image; //주인공 우주선 이미지
	
	public GamePanel() {
		this.setPreferredSize(new Dimension(WIDTH, HEIGHT)); //너비와 높이 지정
		bg_image = kit.getImage("D:\\koreait2108_workspace\\project0826\\img\\shooting\\bg.jpg");
		hero_image = kit.getImage("D:\\koreait2108_workspace\\project0826\\img\\shooting\\plane.png");
	}
	
	public void paint(Graphics g) {
		//우주선 올려놓기!!
		g.drawImage(bg_image, 0, 0, WIDTH, HEIGHT, this);
		
		//g.setColor(Color.YELLOW);
		//g.fillRect(0, 0, WIDTH, HEIGHT);
		g.drawImage(hero_image, 200, 150, 120, 75, this);
		
	}
}






