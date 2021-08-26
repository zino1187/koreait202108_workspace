package com.koreait.project0826.graphic;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JButton;

/*현실에서의 그래픽의 구성요소와 프로그래밍 언어에서의 그래픽의 구성요소간 이해...
 * 현실  										전산
 * 그래픽의 주체: 			화가  ----   UI 컴포넌트
 * 그래픽 그림의 대상 :   도화지  ----  UI 컴포넌트 
 * 팔레트				: 팔레트(색) 	---   색상, 도형, 문자열,이미지.. Graphics 객체로 지원
 * 그리는 행위       : 붓           ---    paint() 메서드     
 * */

//버튼의 그림 그리는 행위를 방해해보자!!
public class CustomButton extends JButton{
	//부모인  JButton 은 그리는 메서드를 자식에서 재정의했으므로(오버라이드) 업그레이드로 간주되어
	//추후,  paint메서드 호출시 자식것이 호출됨..
	public CustomButton(String title){
		super(title);  // JButton의 생성자에 제목 전달!!
	}
	

	//paint메서드는 그림그리는 행위에 불과하고, 사실상의 그림의 효과는 팔레트인 Graphics객체가 전담
	public void paint(Graphics g) {
		//System.out.println("버튼이 그려지고 있어..");
		g.setColor(Color.RED);//색상결정(페인트 색상) 
		g.fillRect(0,0, 100, 45);
	}
}









