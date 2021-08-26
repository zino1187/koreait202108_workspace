package com.koreait.project0826.graphic2;

import java.awt.Canvas;

import javax.swing.JFrame;

public class PaintingApp extends JFrame{
	XCanvas can; //현실의 도화지를 표현한 객체, 개발자는 이 켄버스에 그림을 그릴수 있다... 
	
	public PaintingApp() {
		can  = new XCanvas();
		add(can); //센터 영역에서 확장!!! 화면 전체를 차지.. BorderLayout 이므로...
		
		setSize(600,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new PaintingApp();
	}
	
}
