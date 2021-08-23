package com.koreait.human;

class UseMan{
	public static void main(String[] args){
		//백인을 생성해보자!!
		WhiteMan man = new WhiteMan();
		System.out.println(man.color);
		man.walk();
		man.talk();
	}
}
