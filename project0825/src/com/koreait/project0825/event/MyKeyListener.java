package com.koreait.project0825.event;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

//여러 이벤트 중, 오직 키이벤트만 청취하는 리스너를 재정의한다!!
public class MyKeyListener implements KeyListener{

	public void keyTyped(KeyEvent e) {//타이핑 할때..
		System.out.println("keyTyped 호출");
	}
	public void keyPressed(KeyEvent e) {//키보드를 누를때 호출...
		System.out.println("keyPressed 호출");
	}
	public void keyReleased(KeyEvent e) { //키보드를 눌렀다가 뗄때..호출됨
		System.out.println("keyReleased 호출");
	}

}
