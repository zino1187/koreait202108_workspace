package com.koreait.string;
//String Ŭ������ java.lang ��Ű���� ����ְ�, java.lang�� �����ڰ� import
//���� �ʾƵ� ��ΰ� �νĵǾ� �ִ�..
class StringTest1{
	public static void main(String[] args){
		/*
		String sql="";
		for(int i=1;i<=100;i++){
			sql+="babo";
		}
		*/

		//String Ŭ������ �ƴϴ�!!
		StringBuilder sb = new StringBuilder();
		sb.append("obab");   //"babobaobabobabo" //�޸� ����
		sb.append("babo");
		sb.append("babo");
		sb.append("babo");
		sb.append("babo");
		sb.append("babo");
		System.out.println(sb.toString()); //String���� �ѹ��� ��ȯ

		String s1="korea"; //��Ʈ���� ��ü
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
