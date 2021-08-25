/*
윈도우 안에 버튼을 하나 넣어보기
자바에서 GUI관련된 객체들은 java.awt 패키지에서 지원함..
*/
package com.koreait.gui;
import java.awt.Frame;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.TextArea;

class GuiTest1{
	public static void main(String[] args){
		//난생처음 보는 객체를 만났을때 대처법 
		//1) 대상 객체가 무엇인지 파악..어떤 목적의 객체인지..
		//2) 메모리에 올리기
		//자바의 객체는 
		//일반클래스 : new 하면 됨   new 연산자 뒤에 생성자() 선택 고려..
		//추상클래스 : new 불가,,따라서 추상클래스를 상속받는 자식을 new  or 기타 방법
		//인터페이스 : new 불가, 따라서 인터페이스를 구현한 자식을 new or 기타 방법
		Frame frame=new Frame(); //gui에서 윈도우 역할을 하는 객체
		//윈도우창은 기본이 즉 default가 보이지 않는 속성이 적용됨 
		frame.setVisible(true); //부모인 Window클래스로부터 물려받은 , 보이게 하는 메서드!!
		frame.setSize(300,400);

		FlowLayout flow=new FlowLayout();
		frame.setLayout(flow); //프레임 안쪽의 배치방법을 결정 짓자!!

		//버튼을 선언하자 
		Button bt=new Button("나버튼");
		TextField t_id=new TextField(20); //입력 텍스트 컴포넌트
		Checkbox ch1=new Checkbox("딸기", true);//체크박스
		Choice ch=new Choice(); //select박스
		TextArea area=new TextArea(7, 20); //7줄의 20열

		ch.add("이메일 선택");
		ch.add("google.com");
		ch.add("naver.com");
		ch.add("daum.net");

		frame.add(bt);//생성된 버튼을 프레임에 부착하자!!
		frame.add(t_id);//생성된 텍스트필드를 프레임에 부착 
		frame.add(ch1);
		frame.add(ch);
		frame.add(area);


	}
}
