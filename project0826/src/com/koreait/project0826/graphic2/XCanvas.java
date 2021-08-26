package com.koreait.project0826.graphic2;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

//켄버스는 버튼과는 달리, 개발자가 적극 그림을 뺏어서 그려야 하므로, 즉 오버라이드해야 하므로, 
//별로의 클래스로 재정의한다!!
public class XCanvas extends Canvas{
	Toolkit kit=Toolkit.getDefaultToolkit();
	Image image; //이미지 객체 ,추상클래스이므로 인스턴스를 얻는 법이 쉽지 않음...
	
	public void paint(Graphics g) {
		//개발자가 주도하여 원하는 그림을 그려야 함...
		g.setColor(Color.YELLOW); //페인트통을 노란색으로 교체, 따라서 이 시점부터 그려지는 모든
		//것들은 노란색을 이용하게 됨..
		g.fillOval(0, 100, 100, 100);
		
		//빨간색 물감으로 교체 
		g.setColor(Color.RED);
		g.fillRect(200, 250, 50,100);
		image=kit.getImage("D:\\koreait2108_workspace\\project0826\\img\\bbomi.png");
		g.drawImage(image, 300, 50, 200,200, this); //이미지 감시자
	}
}










