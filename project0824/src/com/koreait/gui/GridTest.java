package com.koreait.gui;
import java.awt.*;

class GridTest{
	public static void main(String[] args){
		//�ڹ� AWT�� ��ġ������ ��, GridLayout�� ����غ��� 
		Frame frame=new Frame("GridLayout ����غ���");
		Button bt1=new Button("1��1��");
		Button bt2=new Button("1��2��");
		Button bt3=new Button("2��1��");
		Button bt4=new Button("2��2��");
		Button bt5=new Button("3��1��");
		Button bt6=new Button("3��2��");
		
		GridLayout layout=new GridLayout(3,2); //3�� 2ȣ��¥�� �ǹ�
		frame.setLayout(layout);//�����ӿ� ��ġ������ ����
		frame.add(bt1);
		frame.add(bt2);
		frame.add(bt3);
		frame.add(bt4);
		frame.add(bt5);
		frame.add(bt6);
		
		frame.setSize(400,350);
		frame.setVisible(true);

	}
}
