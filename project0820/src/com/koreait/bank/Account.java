package com.koreait.bank;

//은닉화=encapsulation(캡슐화)
public class Account{
	//데이터를 private 보호
	private String name="smith";
	private int balance=100000;
	private String num="097-568789-01-02";

	//데이터를 접근할 수 잇는 방법...

	//데이터 변경 setter  , 데이터의 반환 getter
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	
	public int getBalance(){
		return balance;
	}
	public void setBalance(int balance){
		this.balance=balance;
	}
	public String getNum(){
		return num;
	}
	public void setNum(String num){
		this.num=num;
	}
}