package com.koreait.db1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

//원격지에 떨어진, 오라클 데이터베이스에 DML 작업을 수행해보자!!
public class BookApp extends JFrame implements ActionListener{
	JTextField book_name;
	JTextField price;
	JButton bt_regist;
	
	public BookApp() {
		//생성 
		book_name = new JTextField(40);
		price = new JTextField(40);
		bt_regist = new JButton("등록");
		
		//스타일 
		setLayout(new FlowLayout());
		
		//조립 
		add(book_name);
		add(price);
		add(bt_regist);
		
		//윈도우설정
		setSize(450, 150);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		bt_regist.addActionListener(this);//연결
	}
	//쿼리 실행에 앞서, 오라클서버에 먼저 접속을 성공해야 한다..
	public void connect() {
		
	}
	
	public void insert() {
		
	}
	
	public void actionPerformed(ActionEvent e) {
	
	}
	
	public static void main(String[] args) {
		new BookApp();
	}
	
}
