package com.koreait.bookapp.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//이 클래스는 오직 TopCategory 라는 테이블에 대해  CRUD 를 수행하기 위한 객체이다. 
//이러한 목적으로 정의된 객체를 DAO(자바분야 뿐 아니라, 전산의 전반적인 분야에서 사용하는 용어...)라 한다
public class TopCategoryDAO {
	String url="jdbc:oracle:thin:@localhost:1521:XE"; 
	String user="batman";
	String pass="1234";
	
	//모든 레코드 가져오기 
	public List selectAll() {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		List list=new ArrayList(); //레코드 한건을 담게될 인스턴스를 적재시킬 리스트
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); //드라이버 로드
			con=DriverManager.getConnection(url, user, pass);//접속시도
			
			//쿼리문 수행
			String sql="select * from topcategory";
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery(); //쿼리문 수행!!!
			//rs는 곧 간다...따라서 rs의 테이블 정보를 자바 객체로 옮겨심자!!
			//이 경우 rs는 언제든  close할 수 있다.. 
			
			while(rs.next()) {
				TopCategory topCategory = new TopCategory();//empty
				topCategory.setTopcategory_id(rs.getInt("topcategory_id"));
				topCategory.setName(rs.getString("name"));
				
				list.add(topCategory);
			}
			System.out.println(list);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(rs !=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
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
		return list;
	}
}




