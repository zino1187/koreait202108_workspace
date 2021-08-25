package com.koreait.project0825.event2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;

public class MyActionListener implements ActionListener{
	JTextArea area; //null 
	
	public MyActionListener(JTextArea area) {
		this.area=area;
	}
	
	public void actionPerformed(ActionEvent e) {
		//area에 문자열을 출력하자!!
		area.append("클릭했네요\n");
		
	}
}
