package com.koreait.project0825.event;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//여러 이벤트 중 윈도우와 관련된 이벤트를 감지할 리스너를 재정의해보자!!
public class MyWindowListener implements WindowListener {

	public void windowOpened(WindowEvent e) {
		System.out.println("windowOpened 호출");
	}

	public void windowClosing(WindowEvent e) {
		System.out.println("windowClosing 호출");
	}

	public void windowClosed(WindowEvent e) {
		System.out.println("windowClosed 호출");
	}

	public void windowIconified(WindowEvent e) {
		System.out.println("windowIconified 호출");
	}

	public void windowDeiconified(WindowEvent e) {
		System.out.println("windowDeiconified 호출");
	}

	public void windowActivated(WindowEvent e) {
		System.out.println("windowActivated 호출");
	}

	public void windowDeactivated(WindowEvent e) {
		System.out.println("windowDeactivated 호출");
	}

}
