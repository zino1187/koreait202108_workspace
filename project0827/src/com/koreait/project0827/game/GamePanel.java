package com.koreait.project0827.game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class GamePanel extends JPanel{
	public static final int WIDTH=1280;
	public static final int HEIGHT=640;
	Thread gameThread;//게임 운영 용 쓰레드정의
	boolean flag=true;
	GameBg[] gameBg=new GameBg[2];
	
	public GamePanel() {
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		
		//배경생성 
		createBg();
		
		gameThread=new Thread(){
			public void run() {
				while(true) {
					if(flag){
						gameLoop();
					}
					try {
						Thread.sleep(10); //게임의 속도 조절  FPS 빠르게 게임하려면 숫자를 낮춰야 한다..
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		gameThread.start();
	}
	
	//배경을 생성한다..
	public void createBg() {
		//GameBg(int x, int y, int width, int height, int velX, int velY, Image image)
		//Class myClass=this.getClass();
		
		//URL은 자원의 위치 정보를 담는 객체
		URL url=this.getClass().getClassLoader().getResource("game_bg.jpg");
		try {//에러가 날 가능성이 있는 코드임..
			BufferedImage buffImg=ImageIO.read(url);
			gameBg[0] = new GameBg(0, 0, WIDTH, HEIGHT, 2, 0, buffImg);
			
		} catch (IOException e) { //혹여나 에러가 나면 비정상적으로 종료하지말고, catch문영역을 수행해...
			e.printStackTrace();
		}
	}
	//repaint()  --> update()  --> paint();
	protected void paintComponent(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		
		gameBg[0].tick();
		gameBg[0].render(g);
	}
	
	//게임의 심장역할을 해줄, 게임루프 정의...
	public void gameLoop() {
		//System.out.println("gameLoop() 호출...");
		repaint();
	}
}












