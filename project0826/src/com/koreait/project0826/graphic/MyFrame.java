package com.koreait.project0826.graphic;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

//우리가 재정의한 즉 커스터마이징한 버튼을 화면에 등장시켜보자!!!
//과연 sun사보다 잘 그렷을까?
public class MyFrame extends JFrame{
	JButton bt; //원래의 네이티브 버튼 
	CustomButton custom; //우리가 재정의한 커스텀 버튼
	
	public MyFrame() {
		bt=new JButton("난 원래버튼");
		custom=new CustomButton("난 커스텀 버튼");
			
		setLayout(new FlowLayout());
		add(bt);
		add(custom);
		
		setSize(300,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new MyFrame();
	}
}




