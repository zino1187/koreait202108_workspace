package com.koreait.member;

import com.koreait.animal.Dog;

public class Smith{
	String name="���̽�";
	int sal=800; //default  ���� �c��  ���� ��Ű���� �ִ� Ŭ�������� �긦 ���ٰ���..

	/**
	�� �޼���� �ҽ��� �츮 ���̽��� �޿��� �����ϱ� ������
	*/ 
	public void setSal(int sal){
		this.sal=sal;
	}

	public int getSal(){
		return sal;
	}

	/**Dog �� �ڷ����̹Ƿ�, �翬�� �Ű������� ��밡��..*/
	public void love(Dog d){
		System.out.println("���� ����ϴ� ������ �̸���"+d.getName());
	}
}