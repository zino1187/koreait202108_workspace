package com.koreait.project0825.event4;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatA extends JFrame implements ActionListener, KeyListener{
	JTextArea area;
	JScrollPane scroll;
	JTextField t_input;
	JButton bt;
	ChatB chatB;//null  has a
	
	
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
		
		bt.addActionListener(this);//버튼과 리스너와의 연결 
		t_input.addKeyListener(this);//텍스트필드와 리스너와의 연결
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("눌럿어?");
		
		//대화상대방 띄우기
		if(chatB==null) {
			chatB=new ChatB();
			System.out.println("보내기전 chatA주소값"+this);
			chatB.setChatA(this);
		}
	}
	

	public void keyTyped(KeyEvent e) {}
	public void keyPressed(KeyEvent e) {}
	
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_ENTER) {
			String msg=t_input.getText();//입력값 가져오기
			//System.out.println(msg);
			
			chatB.area.append(msg+"\n");//ChatB의 area에 출력하자!!
			this.area.append(msg+"\n");//나의 area에 출력하자!!
			
			t_input.setText("");//입력했던 데이터 다시 지우기 
		}
	}
	
	public static void main(String[] args) {
		new ChatA();
	}
	
}












