package com.koreait.project0827.thread2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TimerAndCounter extends JFrame{
	JLabel la_counter;
	JLabel la_timer;
	Thread counterThread;
	Thread timerThread;
	int num;
	
	public TimerAndCounter() {
		la_counter = new JLabel("0");
		la_timer = new JLabel("0");
		
		//스타일 
		Dimension d = new Dimension(330,200);
		la_counter.setPreferredSize(d);
		la_timer.setPreferredSize(d);
		
		la_counter.setBackground(Color.YELLOW);
		la_timer.setBackground(Color.PINK);
		Font font=new Font("Arial black", Font.BOLD, 100);
		la_counter.setFont(font);
		la_timer.setFont(font);
		
		
		setLayout(new FlowLayout());
		add(la_counter);
		add(la_timer);
		
		setSize(350,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		//쓰레드 생성하기 
		counterThread= new Thread() {
			public void run() {
				while(true) {//무한루프..
					num++;
					//증가된 숫자를 라벨에 반영하자!
					la_counter.setText(Integer.toString(num));  // 5 --> "5"
					
					try {
						Thread.sleep(100); // 100/1000 초 동안 멈춤
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		counterThread.start(); //Runnable 영역으로 밀어넣기!!
	}
	
	public static void main(String[] args) {
		new TimerAndCounter();
		Calendar cal=Calendar.getInstance();//날짜 객체
		int min=cal.get(Calendar.MINUTE); //분
		int sec=cal.get(Calendar.SECOND); //초
		System.out.println(min+"분 "+sec+"초");
	}
}
