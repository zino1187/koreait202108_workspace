package com.koreait.project0825.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//자바에서는 버튼 등에 발생하는 이벤트를 클릭이라는 용어를 쓰지 않고, 대신 Action이라 한다 
//주의할 점은 Action이벤트가 버튼에 국한된것은 아니고 이미지, 텍스트 필드 등등 마우스로 클릭가능한
//거의 모든 대상은 Action 이벤트를 발생시킬 수 있다..

//ActionListener란 , 수많은 이벤트 중 오직 ActionEvent 만을 감지하는 리스너 인터페이스이다.
//Sun에서 개발자에게 불완전한 형태의 인터페이스로 제공하는 이유는? 이벤트 발생시 어떠한 프로그램을 
//작성할지는 즉 어떤 기능을 구현할지는, 개발자의 몫이기 때문에..즉 개발자에게 완성할 의무를 부여함..
public class MyActionListener implements ActionListener{

	//개발자가 원하는 기능을 아래의 메서드에 재정의하자!
	//actionPerformed() 메서드는 이벤트발생시 jvm에 의해 호출되며, 이때 jvm이 생성한 이벤트 객체도
	//매개변수로 전달되어 진다..
	public void actionPerformed(ActionEvent e) {
		System.out.println("나 눌렀어"+e);		
	}
	
}








