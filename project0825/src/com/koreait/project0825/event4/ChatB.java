package com.koreait.project0825.event4;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatB extends JFrame implements KeyListener{
	JTextArea area;
	JScrollPane scroll;
	JTextField t_input;
	ChatA chatA; //null
	
	public ChatB() {
		//생성 
		area = new JTextArea();
		scroll = new JScrollPane(area);
		t_input = new JTextField(20);
		
		//스타일
		area.setPreferredSize(new Dimension(280, 320));
		area.setBackground(Color.CYAN);
		
		//조립
		setLayout(new FlowLayout());//플로우 레이아웃 적용
		add(scroll);
		add(t_input);
		
		//윈도우 설정 
		this.setBounds(500, 100, 300, 400);
		setVisible(true);
		
		//연결~~
		t_input.addKeyListener(this);
	}
	
	//누군가에 의해 ChatA를 넘겨받을 수 있는  setter메서드 정의 
	public void setChatA(ChatA chatA) {
		this.chatA = chatA;
		System.out.println("넘겨받은 ChatA주소값"+chatA);
	}
	
	public void keyTyped(KeyEvent e) {}
	public void keyPressed(KeyEvent e) {}
	
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_ENTER) {
			//chatA의 area에 입력값 대입 
			String msg=t_input.getText();
			chatA.area.append(msg+"\n");
			this.area.append(msg+"\n");
			t_input.setText("");//초기화(입력한 값 지우기)
		}
	}

}












