/*
������ �ȿ� ��ư�� �ϳ� �־��
�ڹٿ��� GUI���õ� ��ü���� java.awt ��Ű������ ������..
*/
package com.koreait.gui;
import java.awt.Frame;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.TextArea;

class GuiTest1{
	public static void main(String[] args){
		//����ó�� ���� ��ü�� �������� ��ó�� 
		//1) ��� ��ü�� �������� �ľ�..� ������ ��ü����..
		//2) �޸𸮿� �ø���
		//�ڹ��� ��ü�� 
		//�Ϲ�Ŭ���� : new �ϸ� ��   new ������ �ڿ� ������() ���� ���..
		//�߻�Ŭ���� : new �Ұ�,,���� �߻�Ŭ������ ��ӹ޴� �ڽ��� new  or ��Ÿ ���
		//�������̽� : new �Ұ�, ���� �������̽��� ������ �ڽ��� new or ��Ÿ ���
		Frame frame=new Frame(); //gui���� ������ ������ �ϴ� ��ü
		//������â�� �⺻�� �� default�� ������ �ʴ� �Ӽ��� ����� 
		frame.setVisible(true); //�θ��� WindowŬ�����κ��� �������� , ���̰� �ϴ� �޼���!!
		frame.setSize(300,400);

		FlowLayout flow=new FlowLayout();
		frame.setLayout(flow); //������ ������ ��ġ����� ���� ����!!

		//��ư�� �������� 
		Button bt=new Button("����ư");
		TextField t_id=new TextField(20); //�Է� �ؽ�Ʈ ������Ʈ
		Checkbox ch1=new Checkbox("����", true);//üũ�ڽ�
		Choice ch=new Choice(); //select�ڽ�
		TextArea area=new TextArea(7, 20); //7���� 20��

		ch.add("�̸��� ����");
		ch.add("google.com");
		ch.add("naver.com");
		ch.add("daum.net");

		frame.add(bt);//������ ��ư�� �����ӿ� ��������!!
		frame.add(t_id);//������ �ؽ�Ʈ�ʵ带 �����ӿ� ���� 
		frame.add(ch1);
		frame.add(ch);
		frame.add(area);


	}
}
