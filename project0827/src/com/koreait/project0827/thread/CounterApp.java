package com.koreait.project0827.thread;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CounterApp extends JFrame{
	JButton bt_manual; //수동 버튼
	JButton bt_auto;//자동 버튼
	JPanel counterPanel;
	int num;//기본 자료형..
	
	public CounterApp() {
		//생성
		bt_manual = new JButton("수동");
		bt_auto = new JButton("자동");
		
		//내부익명클래스란? 클래스 내에 정의하는 클래스이며 이름이 없다..
		//why? 재사용성이 떨어질때 굳이 .java 원본소스로까지 만들필요가 있나?...
		//장점: 내부익명클래스의 멤버들은, 자기를 포함하고 있는 바깥쪽 외부클래스의 멤버들을 접근할 수 잇다..
		counterPanel = new JPanel(){
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.setColor(Color.YELLOW);
				g.fillRect(0, 0, this.getWidth(), this.getHeight());
				
				g.setColor(Color.RED);
				g.setFont(new Font("Arial Black", Font.BOLD, 120));
				//정수 --> String
				g.drawString(Integer.toString(num) ,50, 200);
			}
		};
		
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
		bt_manual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num++;
				counterPanel.repaint(); //  update() --> paint()
			}	
		});
		
		bt_auto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}	
		});
	}
	
	public static void main(String[] args) {
		new CounterApp();
	}
}
