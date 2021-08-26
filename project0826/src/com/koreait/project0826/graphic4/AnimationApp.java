package com.koreait.project0826.graphic4;

import javax.swing.JFrame;

public class AnimationApp extends JFrame{
	GamePanel gamePanel;
	
	
	public AnimationApp() {
		gamePanel = new GamePanel();
		add(gamePanel); //center
		
		this.pack(); //프레임의 안쪽의 내용물만큼 줄어든다..
		//프레임을 모니터의 정중앙에 오게하는 법
		this.setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new AnimationApp();
	}
}
