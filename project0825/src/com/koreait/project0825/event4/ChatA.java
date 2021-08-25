package com.koreait.project0825.event4;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatA extends JFrame{
	JTextArea area;
	JScrollPane scroll;
	JTextField t_input;
	JButton bt;
	
	public ChatA() {
		//생성 
		area = new JTextArea();
		scroll = new JScrollPane(area);
		t_input = new JTextField(20);
		bt = new JButton("open");
		
		//스타일
		area.setPreferredSize(new Dimension(280, 320));
		area.setBackground(Color.YELLOW);
		
		//조립
		setLayout(new FlowLayout());//플로우 레이아웃 적용
		add(scroll);
		add(t_input);
		add(bt);
		
		//윈도우 설정 
		this.setBounds(200, 100, 300, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);		
	}
	
	public static void main(String[] args) {
		new ChatA();
	}
}












