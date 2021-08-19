package com.koreait.use;

import com.koreait.tool.Pen; //외부에 있는 클래스를 경로와 함께 지정
class UsePen{

	public static void main(String[] args){
		Pen p = new Pen();
		System.out.println("내가 만든 펜은 "+p.getName());
	}
}