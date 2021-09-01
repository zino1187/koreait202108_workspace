package com.koreait.bookapp.view;

import java.awt.Dimension;

import javax.swing.JPanel;

//앞으로 어플리케이션에서 사용될 모든 ~~ 페이지들의 어버이 클래스 
//이 클래스에는 가장 공통적이면서 보편적 기능을 부여한다..
public class Page extends JPanel{
	public Page() {
		setPreferredSize(new Dimension(1200, 750));
	}
}
