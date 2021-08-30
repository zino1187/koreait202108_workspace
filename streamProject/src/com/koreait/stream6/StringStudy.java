package com.koreait.stream6;

public class StringStudy {
	//우리가 사람이기에 가장 흔히 사용하는 자료형은 아마  String일 것이다!!
	//따라서 String은 아주 많은 기능을 지원하고 있다..
	//String api document 참조하면서 공부하자!!
	
	public static void main(String[] args) {
		String s1="this is my string test application";//char 배열마찬가지..
		
		//문자열의 길이 얻기
		System.out.println("문자열의 길이는 "+s1.length());
		
		//문자열의 일부(sub)을 추출해보자 
		String s2=s1.substring(5, 7); //시작index,  시작index+추출할 문자수
		System.out.println(s2);
		
		//특정 문자가 몇번째의 인덱스에 있는지 조사
		int index=s1.lastIndexOf("t"); //가장 마지막 t
		System.out.println(index);
		
		System.out.println(s1.substring(index, s1.length()));
		
		
		String path="http:/~~~~~a/sdfasd.f.s.d.af/s.ad_fasdfasdfasdf.jpg";
		int lastIndex=path.lastIndexOf("."); //가장 마지막 점의 인덱스 추출
		System.out.println(lastIndex);
		
		String ext=path.substring(lastIndex+1, path.length());
		System.out.println("추출한 확장자는 "+ext);
		
	}
}
