package com.koreait.gui;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.Button;
import java.awt.Color;

/* gui 컴포넌트 중, Panel 을 이해해 본다 */
class PanelTest{
			
	public static void main(String[] args){
		Frame frame=new Frame(); //디폴트 배치는 BorderLayout이 적용됨(독립)
		Panel panel=new Panel(); // 디폴트 배치는 FlowLayou이 적용됨(Frame에 의존)
		Button bt=new Button("나버튼");

		//패널이 눈에 보이지 않으므로, 투명이므로 배경색을 적용해보자!!
		panel.setBackground(Color.YELLOW);
		//패널없이 그냥 버튼을 프레임에 부착해보자
		//프레임의 디폴트는 BorderLayout 이므로, 대왕버튼으로 존재 즉 센터에 붙어서 확장함!!
		panel.add(bt);//패널에 버튼 부착!!
		frame.add(panel); //디폴트가 Center임..
		frame.setSize(500,450);
		frame.setVisible(true);				
	}
}
