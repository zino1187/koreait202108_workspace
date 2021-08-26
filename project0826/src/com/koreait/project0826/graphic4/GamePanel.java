package com.koreait.project0826.graphic4;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

//실제 게임이 그려질 패널
public class GamePanel extends JPanel implements KeyListener{
	public static final int WIDTH=1280;
	public static final int HEIGHT=640;
	
	Toolkit kit=Toolkit.getDefaultToolkit();
	Image bg_image; //게임 배경 이미지
	Image hero_image; 
	Hero hero;

	Image[] enemy_image=new Image[5];
	Enemy[] enemy=new Enemy[5];
	
	public GamePanel() {
		this.setPreferredSize(new Dimension(WIDTH, HEIGHT)); //너비와 높이 지정
		bg_image = kit.getImage("D:\\koreait2108_workspace\\project0826\\img\\shooting\\bg.jpg");
		hero_image = kit.getImage("D:\\koreait2108_workspace\\project0826\\img\\shooting\\plane.png");
		
		enemy_image[0]=kit.getImage("D:\\koreait2108_workspace\\project0826\\img\\shooting\\e1.png");
		enemy_image[1]=kit.getImage("D:\\koreait2108_workspace\\project0826\\img\\shooting\\e2.png");
		enemy_image[2]=kit.getImage("D:\\koreait2108_workspace\\project0826\\img\\shooting\\e3.png");
		enemy_image[3]=kit.getImage("D:\\koreait2108_workspace\\project0826\\img\\shooting\\e4.png");
		enemy_image[4]=kit.getImage("D:\\koreait2108_workspace\\project0826\\img\\shooting\\e5.png");
		
		//주인공 생성
		hero = new Hero(hero_image,100,200);
		
		//적군 생성
		enemy[0]=new Enemy(enemy_image[0], WIDTH-100, 100);
		enemy[1]=new Enemy(enemy_image[1], WIDTH-100, 180);
		enemy[2]=new Enemy(enemy_image[2], WIDTH-100, 290);
		enemy[3]=new Enemy(enemy_image[3], WIDTH-100, 390);
		enemy[4]=new Enemy(enemy_image[4], WIDTH-100, 450);
		
		//이벤트소스와 리스너와의 연결 
		this.addKeyListener(this);
		
		//프로그램 가동과 동시에 포커스가 프레임에 활성화되어 있기에, 현재 패널로 포커스를 이동시키자!!
		this.setFocusable(true);
	}
	
	public void paint(Graphics g) {
		g.drawImage(bg_image, 0, 0, WIDTH, HEIGHT, this);
		hero.render(g);
		
		for(int i=0;i<enemy.length;i++) {
			enemy[i].render(g);
		}
	}

	public void keyTyped(KeyEvent e) {}
	public void keyReleased(KeyEvent e) {}

	@Override
	public void keyPressed(KeyEvent e) {
		//조건 
		//System.out.println("키보드 눌렀?"+e.getKeyCode());
		int key=e.getKeyCode();
		
		switch(key) {
			case KeyEvent.VK_LEFT: 
				hero.x-=10; //10누적
				break;
			case KeyEvent.VK_RIGHT: 
				hero.x+=10; //10누적
				break;
			case KeyEvent.VK_UP: 
				hero.y-=10; //
				break;
			case KeyEvent.VK_DOWN: 
				hero.y+=10; //
				break;
		}
		repaint();
		
	}


	
	
}






