package com.koreait.gui;
import java.awt.Frame;
import java.awt.Button;
import java.awt.BorderLayout;

class BorderTest{
	public static void main(String[] args){
		Frame frame=new Frame(); //null
		Button bt_north=new Button("North");
		Button bt_east=new Button("East");
		Button bt_west=new Button("West");
		Button bt_south=new Button("South");
		Button bt_center=new Button("Center");

		//조립 전에 프레임의 레이아웃을 결정짓자!! 
		BorderLayout layout=new BorderLayout();
		frame.setLayout(layout); //원하는 레이아웃 객체

		//동서남북센터의 위치를 갖는 레이아웃 적용되었으므로, 버튼을 각 방위에 자리시켜보자!!
		frame.add(bt_north, BorderLayout.NORTH);
		frame.add(bt_east, BorderLayout.EAST);
		frame.add(bt_south, BorderLayout.SOUTH);
		frame.add(bt_west, BorderLayout.WEST);
		frame.add(bt_center);
		
		//크기 및 보이게 
		frame.setSize(500,450);
		frame.setVisible(true);
	}
}
