package com.koreait.bookapp.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//DAO( Data Access Object  : 오직 Create (insert), Read(select ), Update Delte 
//작업만을 수행하는 모델 객체) 
public class AdminDAO {
	String url="jdbc:oracle:thin:@localhost:1521:XE"; // jdbc:mysql://localhost:3306/bigdata
	String user="batman";
	String pass="1234";
	
	//Admin 테이블에 레코드 넣기!!
	public int insert() {
		Connection con=null;
		PreparedStatement pstmt=null;
		int result=0;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); //드라이버 로드
			con=DriverManager.getConnection(url, user, pass); //접속시도
			if(con!=null) {
				System.out.println("접속성공");
				
				String sql="insert into admin(admin_id, id, name, pass, email)";
				sql+=" values(seq_admin.nextval, ?, ?, ?, ?)";
				
				pstmt=con.prepareStatement(sql);//쿼리 객체생성
				
				//바인드변수에 값 할당하기 바인드변수는 1부터 시작
				pstmt.setString(1, "superman");
				pstmt.setString(2, "수퍼맨");
				pstmt.setString(3, "8888");
				pstmt.setString(4, "super@naver.com");
				
				result=pstmt.executeUpdate(); //이 쿼리문에 의해 영향을 받은 레코드 수를 반환
			}else {
				System.out.println("접속실패");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(pstmt !=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			if(con !=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return result;
		
	}
	
}


