package com.koreait.project0825.event2;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class ClickEvent extends JFrame{
	JButton bt;
	JTextArea area;
		
	public ClickEvent() {
		bt = new JButton("나 눌러봐");
		area = new JTextArea(30,25);
		
		//스타일
		area.setPreferredSize(new Dimension(450,550));
		
		setLayout(new FlowLayout());
		
		//조립
		add(bt);
		add(area);
		
		//윈도우 설정
		setSize(500,600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new ClickEvent();
	}
}







