package com.koreait.db1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

//원격지에 떨어진, 오라클 데이터베이스에 DML 작업을 수행해보자!!
public class MysqlApp extends JFrame implements ActionListener{
	JTextField book_name;
	JTextField price;
	JButton bt_regist;
	Connection con; //모든 인스턴스 메서드가 접근할수 있도록 멤버변수로 뺐다!!
	
	public MysqlApp() {
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
		//setDefaultCloseOperation(EXIT_ON_CLOSE); //윈도우 창닫기를 누르면, 현재 프로그램을 종료..
		
		bt_regist.addActionListener(this);//연결
		this.addWindowListener(new WindowAdapter(){
				
			//사용자들이 윈도우 닫기 버튼을 누르면...
			public void windowClosing(WindowEvent e) {
				//db와 관련된 자원을 해제...
				if(con!=null) { //접속되어 있다면..
					try {
						con.close();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}
				System.exit(0); //현재 프로그램 종료
			}
		});//연결
		//오라클 접속 
		connect();
	}
	
	//쿼리 실행에 앞서, 오라클서버에 먼저 접속을 성공해야 한다..
	public void connect() {
		//오라클 드라이버를 클래스 로드!! 
		try {
			Class.forName("com.mysql.jdbc.Driver");//로드하고 싶은 클래스의 경로..
			System.out.println("드라이버 로드 성공");
			
			//접속할때 사용하는 JDBC 객체는 DriverManager 이다!!
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bigdata", "root", "1234");
			if(con !=null) {
				JOptionPane.showMessageDialog(this, "접속성공");
				
			}			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();	
			JOptionPane.showMessageDialog(this, "드라이버를 찾을 수 없습니다");			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void insert() {
		//이미 로그인을 성공한 상태이므로,쿼리문을 수행할 수 있다!! 
		//쿼리문을 수행하기 위한 인터페이스가 바로 PreparedStatement  객체 
		String name_value=book_name.getText(); //입력한 책의 이름
		int price_value=Integer.parseInt(price.getText());  //String --> int 
		
		String sql="insert into book(book_id, book_name, price) values(seq_book.nextval,'"+name_value+"', "+price_value+")";
		
		PreparedStatement pstmt=null;//맴버가 아닌 지역변수는 반드시 변수 선언시 초기화되어 잇어야 한다..
		
		try {
			pstmt=con.prepareStatement(sql); //인스턴스를 만들기만 했을뿐, 수행은 안했다..
			
			int result=pstmt.executeUpdate(); //DML(insert, update, delete)수행메서드
			if(result >0) {
				JOptionPane.showMessageDialog(this, "등록성공");
			}else {
				JOptionPane.showMessageDialog(this, "등록되지 않았습니다");
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(pstmt !=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}		
	}
	
	public void actionPerformed(ActionEvent e) {
		insert();
	}
	
	public static void main(String[] args) {
		new MysqlApp();
	}
	
}
