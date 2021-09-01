package com.koreait.bookapp.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//어플리케이션의 메인 윈도우 ( View == 디자인 ) 
public class MainFrame extends JFrame implements ActionListener{
	JPanel p_north;
	JPanel p_center; //모든 페이지가 공존할 컨테이너 역할
	JButton bt_main; //도서관리 메인페이지
	JButton bt_schedule; //일정관리  - 달력화면 
	JButton bt_regist; //회원가입 
	JButton bt_cs;//고객센터
	JButton bt_login; //로그인 or 로그아웃
	
	BookMain bookMain; //도서관리 페이지
	Schedule schedule;
	MemberJoin memberJoin;
	CSMain csMain;
	LoginForm loginForm;
	
	public MainFrame() {
		//생성 
		p_north = new JPanel();
		p_center = new JPanel();
		bt_main =new JButton("도서관리메인");
		bt_schedule =new JButton("일정관리");
		bt_regist =new JButton("회원가입");
		bt_cs =new JButton("고객센터");
		bt_login =new JButton("Login");
		
		bookMain = new BookMain();
		schedule = new Schedule();
		memberJoin = new MemberJoin();
		csMain = new CSMain();
		loginForm = new LoginForm();
		
		//스타일 
		p_north.setBackground(Color.GRAY);
		p_center.setBackground(Color.BLACK);
		
		//조립 
		p_north.add(bt_main);
		p_north.add(bt_schedule);
		p_north.add(bt_regist);
		p_north.add(bt_cs);
		p_north.add(bt_login);
		add(p_north, BorderLayout.NORTH);
		
		p_center.add(bookMain);
		p_center.add(schedule);
		p_center.add(memberJoin);
		p_center.add(csMain);
		p_center.add(loginForm);
		
		//프레임에 페이지 부착 
		add(bookMain);
		add(p_center);
		
		setSize(1200, 800);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//이벤트 소스와 리스너 연결
		bt_main.addActionListener(this);
		bt_schedule.addActionListener(this);
		bt_regist.addActionListener(this);
		bt_cs.addActionListener(this);
		bt_login.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		System.out.println("나 눌렀어?");
	}
	public static void main(String[] args) {
		new MainFrame();
	}
}













