package com.koreait.project0827.thread;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CounterApp extends JFrame{
	JButton bt_manual; //수동 버튼
	JButton bt_auto;//자동 버튼
	CounterPanel counterPanel;
	
	public CounterApp() {
		//생성
		bt_manual = new JButton("수동");
		bt_auto = new JButton("자동");
		counterPanel = new CounterPanel();
		
		//스타일
		setLayout(new FlowLayout());
		counterPanel.setPreferredSize(new Dimension(390, 450));
		
		//조립
		add(bt_manual);
		add(bt_auto);
		add(counterPanel);
		
		//윈도우설정
		setSize(400,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//이벤트 연결
	}
	
	public static void main(String[] args) {
		new CounterApp();
	}
}
