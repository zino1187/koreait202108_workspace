package com.koreait.animal;

public class Dog{
	String name="����";  //default
	int age=1;

	public String getName(){
		return name;
	}
	
	//�̸��� ������ �� �ֵ��� ������ִ�  setter �޼���
	//���� ����: name �� default�� ����Ǿ� �վ, ���� ��Ű���� �ƴϸ� ���� ������ �Ұ����ϱ� ������ 
	//public���� ����� �޼��带 ����������...
	public void setName(String name){
		this.name=name;
	}
}