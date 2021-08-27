package com.koreait.project0827.game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GamePanel extends JPanel{
	public static final int WIDTH=1280;
	public static final int HEIGHT=640;
	Thread gameThread;//게임 운영 용 쓰레드정의
	boolean flag=true;
	
	public GamePanel() {
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		
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
	
	protected void paintComponent(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillRect(0, 0, WIDTH, HEIGHT);
	}
	
	//게임의 심장역할을 해줄, 게임루프 정의...
	public void gameLoop() {
		System.out.println("gameLoop() 호출...");
	}
}












