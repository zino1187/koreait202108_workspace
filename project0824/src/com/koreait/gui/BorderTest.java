package com.koreait.gui;
import java.awt.Frame;
import java.awt.Button;
import java.awt.BorderLayout;

class BorderTest{
	public static void main(String[] args){
		Frame frame=new Frame(); //null
		Button bt_north=new Button("North");
		Button bt_east=new Button("East");
		Button bt_west=new Button("West");
		Button bt_south=new Button("South");
		Button bt_center=new Button("Center");

		//���� ���� �������� ���̾ƿ��� ��������!! 
		BorderLayout layout=new BorderLayout();
		frame.setLayout(layout); //���ϴ� ���̾ƿ� ��ü

		//�������ϼ����� ��ġ�� ���� ���̾ƿ� ����Ǿ����Ƿ�, ��ư�� �� ������ �ڸ����Ѻ���!!
		frame.add(bt_north, BorderLayout.NORTH);
		frame.add(bt_east, BorderLayout.EAST);
		frame.add(bt_south, BorderLayout.SOUTH);
		frame.add(bt_west, BorderLayout.WEST);
		frame.add(bt_center);
		
		//ũ�� �� ���̰� 
		frame.setSize(500,450);
		frame.setVisible(true);
	}
}
