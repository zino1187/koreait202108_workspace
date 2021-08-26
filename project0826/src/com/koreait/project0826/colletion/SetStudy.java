package com.koreait.project0826.colletion;

import java.util.HashSet;
import java.util.Iterator;

//객체를 모아서 처리하는데 유용한 객체들을 지원해주는 라이브러리인 컬렉션 프레임웍
//중 순서가 없는 객체를 처리하는 Set 을 배워보자!!
public class SetStudy {
	
	public static void main(String[] args) {
		HashSet set=new HashSet();
		String s="사과";
		
		set.add(s); //Object 형을 넣을수 있다는 것은 넣을 엘리먼트에 제한이 없다... 
		set.add("오렌지"); 
		set.add("딸기"); 
		set.add("포도"); 
		
		//순서없이 모여있는 객체를 모두 출력해본다!!!
		//총 몇개이고, 반복문으로 가져오는 방법
		//Set은 순서가 없으므로, 반복문등을 이용하여 처리하려면 순서있게 정렬해야 함. 이때 사용되는 객체가 바로 Iterator
		//Iterator(jdk 5) 이전에는 Enumeration이 사용됨 
		Iterator it=set.iterator();
		
		while(it.hasNext()) {
			String e = (String)it.next(); //요소를 꺼낸다
			System.out.println(e);
		}
		
	}
}




