package com.koreait.project0826.colletion;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;

//컬렉션 프레임웍이 지원하는 객체 중 List계열의 객체를 학습한다!! 참고로  List는 순서가 있는 객체집합을 처리하므로, 
//배열과 거의 같다!! [0][1][2][3]

public class ListStudy {
	public static void main(String[] args) {
		//배열과의 차이점??? 
		//1) 생성시 크기를 명시하지 않아도 된다. 즉 크기가 유동적이다.. 
		//2) 배열은 기본자료형 및 객체자료형을 대상으로 데이터를 넣을 수 있지만, 컬럭션프레임웍의 대상은 오직 객체만을 대상으로 함.. 
		List<String> list=new ArrayList<String>(); //크기를 명시하지 않아도 됨..즉 크기가 유동적으로 늘어남..고무줄처럼..
		//Generic Type : 객체자료형을 제한하는 방법 
		
		list.add("바나나");
		list.add("멜론");
		list.add("오렌지");
		list.add("포도");
		
		//list.add(new JButton("나버튼"));
		
		for(int i=0;i<list.size();i++) {
			String s=list.get(i);
			System.out.println(s);
		}
		
		//컬렉션 프레임웍 사용시 보다 개선된  improved for 문이 지원됨 (jdk 5 버전부터지원)
		for(String obj : list) {
			System.out.println(obj);
		}
		
	}
}













