package com.koreait.project0827.thread;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class CounterPanel extends JPanel{
	int num;//기본 자료형..
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.YELLOW);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		g.setColor(Color.RED);
		g.setFont(new Font("Arial Black", Font.BOLD, 150));
		g.drawString("스트링 객체" ,150, 200);
	}

}
