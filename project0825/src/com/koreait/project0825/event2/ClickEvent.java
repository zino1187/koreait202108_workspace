package com.koreait.project0825.event2;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

//프레임이자, 액션리스너로 정의
public class ClickEvent extends JFrame implements ActionListener{
	JButton bt;
	JTextArea area;
	int x=0;

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
		
		//버튼과 리스너 연결 
		//MyActionListener listener = new MyActionListener(area);
		bt.addActionListener(this);//버튼과 리스너 연결
	}	

	
	@Override
	public void actionPerformed(ActionEvent e) {
		x++;
		area.append(x+"번 클릭했네요\n");
	}
	
	public static void main(String[] args) {
		new ClickEvent();
	}
}







