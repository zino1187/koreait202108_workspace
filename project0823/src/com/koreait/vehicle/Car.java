package com.koreait.vehicle;

//has a Ư�� ��ü�� ��������� ��ü�� ������ ���¸� ������ has a
public class Car{
	int price; //price �� �⺻�ڷ����̹Ƿ�, �� �繰�� �ƴϹǷ�  has a �����
	//���� �ʴ´�!!!
	Wheel w; //has a 
	Engine e; //has a

	//�������� ����? ��ü�� �ν��Ͻ��� �����ɶ� �ʱ�ȭ�� ���!!!
	//���� ���� Car��� Ŭ������ ��ǰ�� ������ �ִٸ�, �� ��ǰ�� ���� �����ɶ� ���� �¾�� �Ѵ�..
	public Car(){
		w=new Wheel();
		e=new Engine();
	}
}
