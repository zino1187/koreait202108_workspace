package com.koreait.db1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

//오라클의 Book 테이블의 레코드를 가져와서,  JTable 출력해보자!!
public class DBTable extends JFrame{
	JButton bt_select; //레코드 가져오기 버튼
	JTable table;
	JScrollPane scroll;
	
	MyTableModel model; //View와 Model을 분리시켜주는 컨트롤러 클래스!!
	
	public DBTable() {
		bt_select = new JButton("가져오기");
		
		table = new JTable(model=new MyTableModel());
		scroll = new JScrollPane(table);
		
		//스타일 
		setLayout(new FlowLayout());
		
		//조립 
		add(bt_select);
		add(scroll);
		
		//윈도우 설정
		setSize(500, 540);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);//현재 프로세스 종료	
			}
		});
		
		bt_select.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
	}
	
	public static void main(String[] args) {
		new DBTable();
	}
}








