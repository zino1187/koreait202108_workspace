package com.koreait.bookapp.view;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

//도서관리 페이지
public class LoginForm extends Page{
	JTextField t_id;
	JPasswordField t_pass;
	JButton bt_login;
	JPanel content;
	
	
	public LoginForm(MainFrame mainFrame) {
		super(mainFrame);
		
		//생성
		t_id = new JTextField();
		t_pass  = new JPasswordField();
		bt_login = new JButton("Login");
		content = new JPanel();
		
		//스타일
		Dimension d = new Dimension(500,230);
		content.setBackground(Color.YELLOW);
		content.setPreferredSize(new Dimension(getPreferredSize()));
		
		
	}
}









