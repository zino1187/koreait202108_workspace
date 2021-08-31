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
	JButton bt_connect; //db접속 버튼
	JButton bt_select; //레코드 가져오기 버튼
	JTable table;
	JScrollPane scroll;
	String url="jdbc:oracle:thin:@localhost:1521:XE"; // jdbc:mysql://@localhost:3306/bigdata
	String user="batman";
	String pass="1234"; 
	Connection con; //멤버변수로 빼놓아야, 다른 메서드 등에서 접근이 가능..
	
	//이차원배열, 컬럼배열 
	String[] column= {"book_id","book_name","price","pubdate"};
	String[][] data= {};
	
	public DBTable() {
		bt_connect = new JButton("DB접속");
		bt_select = new JButton("가져오기");
		
		table = new JTable(data, column);
		scroll = new JScrollPane(table);
		
		//스타일 
		setLayout(new FlowLayout());
		
		//조립 
		add(bt_connect);
		add(bt_select);
		//add(scroll);
		
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
		
		try {
			PreparedStatement pstmt=con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY); //쿼리수행 객체가 생성
			ResultSet rs=pstmt.executeQuery(); //select문일 경우  executeQuery(), DML일 경우 executeUpdate();
			
			//멤버변수에 선언된 이차원배열에 rs의 정보를 채우자!!
			rs.last();//커서를 가장 마지막 레코드로 보낸다!!
			int row=rs.getRow();//현재 커서의 레코드 번호를 반환
			this.setTitle("저 지금 레코드내의 "+row+"에 와있어요 ㅜㅜ");
			
			data=new String[row][column.length]; //이 시점에 새로운 이차원 배열을 생성
			rs.beforeFirst();//원상복귀
			
			int index=0;
			while(rs.next()) {
				data[index][0]=Integer.toString(rs.getInt("book_id"));
				data[index][1]=rs.getString("book_name");
				data[index][2]=Integer.toString(rs.getInt("price"));
				data[index][3]=rs.getString("pubdate");
				index++;
			}
			//table.updateUI();//jtable 새로고침 개발자가 paint()메서드로 직접 그린 경우엔 repaint() 지만, 단순한 컴포넌트 업데이트의 
			//경우엔 updateUI()
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		new DBTable();
	}
}








