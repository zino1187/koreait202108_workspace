package com.koreait.animal;
class UseTest{
	public static void main(String[] args){
		//�ڹٴ� �ڷ����� �� 4���� �̴�~!!
		//��ü�ڷ����� �ڷ����̴�...
		//��ü�ڷ����� ���� ������ �ڷ����̶�� ������ �����ұ�? 
		//�� �⺻�ڷ����� char �� ������ �ڷ��������� ���� ������ �ڷ������谡 �����ϹǷ�, ���� ����
		//����ȯ�� ����...
		//��ü�ڷ����� ���� ������ �ڷ����̶�� ������ �����ұ�? 
		Bird bird = new Bird();
		Duck duck = new Duck();

		//duck=bird; //����ν�� �Ұ� 

		//�⺻�ڷ����� �����غ��� 
		byte b = 5;//1byte
		int x=6; //4byte
		b=(byte)x; 

		duck=(Duck)bird;
	
	}
}
