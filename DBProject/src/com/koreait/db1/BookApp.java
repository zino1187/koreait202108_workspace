package com.koreait.db1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

//원격지에 떨어진, 오라클 데이터베이스에 DML 작업을 수행해보자!!
public class BookApp extends JFrame implements ActionListener{
	JTextField book_name;
	JTextField price;
	JButton bt_regist;
	
	public BookApp() {
		//생성 
		book_name = new JTextField(40);
		price = new JTextField(40);
		bt_regist = new JButton("등록");
		
		//스타일 
		setLayout(new FlowLayout());
		
		//조립 
		add(book_name);
		add(price);
		add(bt_regist);
		
		//윈도우설정
		setSize(450, 150);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		bt_regist.addActionListener(this);//연결
		
		//오라클 접속 
		connect();
	}
	
	//쿼리 실행에 앞서, 오라클서버에 먼저 접속을 성공해야 한다..
	public void connect() {
		//오라클 드라이버를 클래스 로드!! 
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");//로드하고 싶은 클래스의 경로..
			System.out.println("드라이버 로드 성공");
			
			//접속할때 사용하는 JDBC 객체는 DriverManager 이다!!
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "batman", "1234");
			if(con !=null) {
				JOptionPane.showMessageDialog(this, "접속성공");
				
				//이미 로그인을 성공한 상태이므로,쿼리문을 수행할 수 있다!! 
				//쿼리문을 수행하기 위한 인터페이스가 바로 PreparedStatement  객체 
				String sql="insert into book(book_id, book_name, price) values(seq_book.nextval,'Node.js',35000)";
				PreparedStatement pstmt=con.prepareStatement(sql); //인스턴스를 만들기만 했을뿐, 수행은 안했다..
				
				int result=pstmt.executeUpdate(); //DML(insert, update, delete)수행메서드
				if(result >0) {
					JOptionPane.showMessageDialog(this, "등록성공");
				}else {
					JOptionPane.showMessageDialog(this, "등록되지 않았습니다");
				}
			}			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();	
			JOptionPane.showMessageDialog(this, "드라이버를 찾을 수 없습니다");			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void insert() {
		
	}
	
	public void actionPerformed(ActionEvent e) {
	
	}
	
	public static void main(String[] args) {
		new BookApp();
	}
	
}
