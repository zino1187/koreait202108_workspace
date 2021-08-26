package com.koreait.project0826.graphic3;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.koreait.project0826.graphic.CustomButton;

//이미지 사진을 교체하며 볼수 있는 겔러리 제작해본다
public class Gallery extends JFrame implements ActionListener{
	MyPanel can; //그림을 그릴 패널..
	JPanel p_south; //버튼을 담을 패널 
	JButton bt_prev, bt_next;
	
	public Gallery() {
		//생성
		can = new MyPanel();
		p_south = new JPanel();
		bt_prev = new JButton("이전사진");
		bt_next = new JButton("다음사진");
		
		//스타일
		
		//조립
		add(can);
		p_south.add(bt_prev);
		p_south.add(bt_next);
		add(p_south, BorderLayout.SOUTH);
		
		//윈도우설정 
		setSize(500,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//이벤트 연결
		bt_prev.addActionListener(this);
		bt_next.addActionListener(this);
	}

	public void prev() {
		//현재 보고있는 사진보다 이전 사진
		if(can.index>0) {
			can.index--;
			can.repaint();
			this.setTitle("현재까지의 index"+can.index);
		}else {
			JOptionPane.showMessageDialog(this , "이전 사진이 없습니다");
		}
	}
	
	public void next() {
		//현재 보고있는 사진보다 다음 사진
		if(can.index< can.image.length-1 ) {
			can.index++; //6
			//can.paint(getGraphics());//paint메서드는 개발자가 아닌, 다시 그려져할 타이밍에 시스템이 호출
			//그렇다면 개발자가 paint메서드를 직접 호출하는 방법은? 따로 없고 간접적으로 호출하는 방법을 이용한다. 
			//즉 paint메서드가 호출될 수 있도록 시스템에 요청하면 된다.. 
			//repaint()  --> update()호출로 기존 그림을 싹 지움 --> paint() 호출하여 다시 그림을 그림..
			can.repaint();
		}else {
			//욕하자!!
			JOptionPane.showMessageDialog(this , "다음 사진이 없습니다");
		}
		this.setTitle("현재까지의 index"+can.index);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object obj=e.getSource();
		
		if(obj.equals(bt_prev)) {
			prev();
		}else if(obj.equals(bt_next)){
			next();
		}
	}
	
	public static void main(String[] args) {
		new Gallery();
	}
	
}











