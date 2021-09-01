package com.koreait.bookapp.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

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
	
	ArrayList<JButton> btnList; //버튼을 가리킴에 있어 규칙을 만들기 위해
	ArrayList<Page> pageList;//페이지를 가리킴에 있어 규칙을 만들기 위해
	
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
		
		btnList = new ArrayList<JButton>();
		pageList=new ArrayList();
		
		//버튼을 개성있는 이름이 아닌, 규칙있는 숫자로 가리키기 위해..
		btnList.add(bt_main);
		btnList.add(bt_schedule);
		btnList.add(bt_regist);
		btnList.add(bt_cs);
		btnList.add(bt_login);
		
		//페이지들을 개성있는 이름이 아닌, 규칙있는 숫자로 가리키기 위해..
		pageList.add(bookMain);
		pageList.add(schedule);
		pageList.add(memberJoin);
		pageList.add(csMain);
		pageList.add(loginForm);
		
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
		add(p_center);
		
		setSize(1200, 800);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//이벤트 소스와 리스너 연결
		for(JButton bt : btnList) {
			bt.addActionListener(this);
		}
		
	}
	
	//페이지 보이고, 않보이게 처리  n의 값은 visible을 true로 놓을 대상 페이지값..
	public void showHide(int n) {
		for(int i=0;i<pageList.size();i++) {
			Page page=pageList.get(i);
			if(i==n) {//넘겨받은 값과 일치한 경우만..
				page.setVisible(true);
			}else {
				page.setVisible(false);
			}
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		JButton btn=(JButton)e.getSource();
		//System.out.println("지금 누르신 버튼의 리스트 내에서의 위치는 "+btnList.indexOf(btn));
		int index=btnList.indexOf(btn);
		showHide(index);
	}
	
	public static void main(String[] args) {
		new MainFrame();
	}
}













