package com.koreait.string;
//String 클래스는 java.lang 패키지에 들어있고, java.lang은 개발자가 import
//하지 않아도 경로가 인식되어 있다..
class StringTest1{
	public static void main(String[] args){
		/*
		String sql="";
		for(int i=1;i<=100;i++){
			sql+="babo";
		}
		*/

		//String 클래스가 아니다!!
		StringBuilder sb = new StringBuilder();
		sb.append("obab");   //"babobaobabobabo" //메모리 버퍼
		sb.append("babo");
		sb.append("babo");
		sb.append("babo");
		sb.append("babo");
		sb.append("babo");
		System.out.println(sb.toString()); //String으로 한번만 변환

		String s1="korea"; //스트링은 객체
		String s2="korea"; 
		String s3=new String("korea");
		String s4=new String("korea");
		
		System.out.println(s1 == s2); //true
		System.out.println(s1 == s3); //false
		System.out.println(s3 == s4); //false


		String x="korea";
		x=x+" fighting";
	}	
}
