package com.koreait.bank;

//����ȭ=encapsulation(ĸ��ȭ)
public class Account{
	//�����͸� private ��ȣ
	private String name="smith";
	private int balance=100000;
	private String num="097-568789-01-02";

	//�����͸� ������ �� �մ� ���...

	//������ ���� setter  , �������� ��ȯ getter
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