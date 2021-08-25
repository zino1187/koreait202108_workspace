package com.koreait.project0825.login;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginForm extends JFrame{
	
	JPanel p_center;
	JPanel p_south;
	JLabel la_id;
	JLabel la_pass;
	JTextField t_id;
	JTextField t_pass;
	JButton bt_login;
	JButton bt_regist;
	
	public LoginForm() {
		p_center = new JPanel();	
		p_south = new JPanel();
		la_id = new JLabel("ID");
		la_pass = new JLabel("Pass");
		t_id = new JTextField();
		t_pass = new JTextField();
		bt_login = new JButton("Login");
		bt_regist = new JButton("Regist");
		
		//스타일...
		p_center.setBackground(Color.WHITE);
		Dimension d=new Dimension(130,20);
		
		la_id.setPreferredSize(d); //Dimension 크기를 설정하는 객체
		t_id.setPreferredSize(d); //Dimension 크기를 설정하는 객체
		la_pass.setPreferredSize(d); //Dimension 크기를 설정하는 객체
		t_pass.setPreferredSize(d); //Dimension 크기를 설정하는 객체
		
		
		//조립 
		p_center.add(la_id);
		p_center.add(t_id);
		p_center.add(la_pass);
		p_center.add(t_pass);
		
		p_south.add(bt_login); //패널에 버튼 부착
		p_south.add(bt_regist);//패널에 버튼 부착
		
		this.add(p_center);//패널을 프레임의 센터에 부착!!
		this.add(p_south, BorderLayout.SOUTH); //패널을 프레임의 남쪽에 부착
		
		//윈도우 설정
		this.setSize(300, 165);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new LoginForm();
	}
}








