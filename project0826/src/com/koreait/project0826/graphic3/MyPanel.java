package com.koreait.project0826.graphic3;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;

//그림을 그려넣기 위한 커스텀 패널
public class MyPanel extends JPanel{
	Toolkit kit=Toolkit.getDefaultToolkit();
	Image[] image=new Image[7];
	int index; //어떤 사진을 나오게 할지를 결정짓는 변수
	
	public MyPanel() {
		image[0]=kit.getImage("D:\\koreait2108_workspace\\project0826\\img\\shurek\\img0.jpg");
		image[1]=kit.getImage("D:\\koreait2108_workspace\\project0826\\img\\shurek\\img1.jpg");
		image[2]=kit.getImage("D:\\koreait2108_workspace\\project0826\\img\\shurek\\img2.jpg");
		image[3]=kit.getImage("D:\\koreait2108_workspace\\project0826\\img\\shurek\\img3.jpg");
		image[4]=kit.getImage("D:\\koreait2108_workspace\\project0826\\img\\shurek\\img4.jpg");
		image[5]=kit.getImage("D:\\koreait2108_workspace\\project0826\\img\\shurek\\img5.jpg");
		image[6]=kit.getImage("D:\\koreait2108_workspace\\project0826\\img\\shurek\\img6.jpg");
	}
	
	public void paint(Graphics g) {		
		g.drawImage(image[index] , 0,0,500, 340, this);
	}
}













