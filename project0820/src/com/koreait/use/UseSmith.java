package com.koreait.use;

import com.koreait.member.Smith;//���� ����..
import com.koreait.animal.Dog;//���� ����..

class UseSmith{
	public static void main(String[] args){
		//���̽��� �޿��� �ٲ㺸��!!
		Smith s = new Smith(); //�ν��Ͻ� ���� 
		s.setSal(6000);//call by value ���� ���� ȣ��
		System.out.println("���̽��� �޿��� "+s.getSal());

		//���̽��� ������ love() �޼��带 ȣ���Ͽ� �����غ���!!
		Dog dog = new Dog(); //�ν��Ͻ� 1�� ����
		dog.setName("�ǹ�");

		s.love(new Dog());//call by reference �ּҰ��� ���� ȣ��

	}	
}