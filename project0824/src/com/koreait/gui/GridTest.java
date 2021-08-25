package com.koreait.gui;
import java.awt.*;

class GridTest{
	public static void main(String[] args){
		//자바 AWT의 배치관리자 중, GridLayout을 사용해보자 
		Frame frame=new Frame("GridLayout 사용해보기");
		Button bt1=new Button("1행1열");
		Button bt2=new Button("1행2열");
		Button bt3=new Button("2행1열");
		Button bt4=new Button("2행2열");
		Button bt5=new Button("3행1열");
		Button bt6=new Button("3행2열");
		
		GridLayout layout=new GridLayout(3,2); //3층 2호수짜리 건물
		frame.setLayout(layout);//프레임에 배치관리자 적용
		frame.add(bt1);
		frame.add(bt2);
		frame.add(bt3);
		frame.add(bt4);
		frame.add(bt5);
		frame.add(bt6);
		
		frame.setSize(400,350);
		frame.setVisible(true);

	}
}
