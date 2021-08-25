package com.koreait.project0825.event3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

//대화내역이 출력될 , 채팅 메인 화면 
public class ChatMain extends JFrame implements ActionListener{
	JButton bt;
	JTextArea area;
	PopUp p; //null
	
	public ChatMain() {
		//생성
		bt = new JButton("대화상대 띄우기");
		area = new JTextArea();
		
		//스타일
		area.setPreferredSize(new Dimension(380, 420));
		area.setBackground(Color.YELLOW);
		
		//조립
		this.setLayout(new FlowLayout());
		add(bt);
		add(area);
		
		//윈도우설정
		this.setBounds(200, 100, 400, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//이벤트를 일으킬 수 있는 UI컴포넌트를 가리켜 Event Source라 한다 
		//이벤트 연결의 제일 마지막단계는, 이벤트소스와 리스너와의 연결...플러그인..
		bt.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		//대화 상대방 띄우기!!!
		System.out.println("나 눌렀어?");
		
		if(p==null){//아무것도 없을때만 태어나라...
			p=new PopUp(area); //무조건 수행...
		}else {
			System.out.println("이미 존재해서 ,안올릴꺼얌!!");
		}
		
	}
	
	public static void main(String[] args) {
		new ChatMain();
	}
}





