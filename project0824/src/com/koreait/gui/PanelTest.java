package com.koreait.gui;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.Button;
import java.awt.Color;

/* gui ������Ʈ ��, Panel �� ������ ���� */
class PanelTest{
			
	public static void main(String[] args){
		Frame frame=new Frame(); //����Ʈ ��ġ�� BorderLayout�� �����(����)
		Panel panel=new Panel(); // ����Ʈ ��ġ�� FlowLayou�� �����(Frame�� ����)
		Button bt=new Button("����ư");

		//�г��� ���� ������ �����Ƿ�, �����̹Ƿ� ������ �����غ���!!
		panel.setBackground(Color.YELLOW);
		//�гξ��� �׳� ��ư�� �����ӿ� �����غ���
		//�������� ����Ʈ�� BorderLayout �̹Ƿ�, ��չ�ư���� ���� �� ���Ϳ� �پ Ȯ����!!
		panel.add(bt);//�гο� ��ư ����!!
		frame.add(panel); //����Ʈ�� Center��..
		frame.setSize(500,450);
		frame.setVisible(true);				
	}
}
