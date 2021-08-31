package com.koreait.db1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

//오라클의 Book 테이블의 레코드를 가져와서,  JTable 출력해보자!!
public class DBTable extends JFrame{
	JButton bt_connect; //db접속 버튼
	JButton bt_select; //레코드 가져오기 버튼
	JTable table;
	JScrollPane scroll;
	String url="jdbc:oracle:thin:@localhost:1521:XE"; // jdbc:mysql://@localhost:3306/bigdata
	String user="batman";
	String pass="1234"; 
	Connection con; //멤버변수로 빼놓아야, 다른 메서드 등에서 접근이 가능..
	
	public DBTable() {
		bt_connect = new JButton("DB접속");
		bt_select = new JButton("가져오기");
		
		table = new JTable();
		scroll = new JScrollPane(table);
		
		//스타일 
		setLayout(new FlowLayout());
		
		//조립 
		add(bt_connect);
		add(bt_select);
		add(scroll);
		
		//윈도우 설정
		setSize(500, 540);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				//db해제..이따가..
				if(con!=null) {
					try {
						con.close();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}
				System.exit(0);//현재 프로세스 종료	
			}
		});
		
		bt_connect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				connect();	
			}
		});
		
		bt_select.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getList();
			}
		});
		
		
	}
	
	//오라클에 접속하자!!
	public void connect() {
		
		try {
			//com.mysql.jdbc.Driver
			Class.forName("oracle.jdbc.driver.OracleDriver");//1.드라이버 로드
			this.setTitle("드라이버 로드 성공");
			
			con=DriverManager.getConnection(url, user, pass);
			if(con !=null) {
				this.setTitle("접속 성공");
			}else {
				this.setTitle("접속 실패");
			}			
		} catch (ClassNotFoundException e) {
			this.setTitle("드라이버 로드 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//데이터 가져오기 
	public void getList() {
		String sql="select * from book";
		System.out.println(sql);
	}
	
	public static void main(String[] args) {
		new DBTable();
	}
}








