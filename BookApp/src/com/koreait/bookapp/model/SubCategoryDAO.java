package com.koreait.bookapp.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SubCategoryDAO {
	String url="jdbc:oracle:thin:@localhost:1521:XE"; 
	String user="batman";
	String pass="1234";
		
	//선택한 상위카테고리에 소속된, 목록가져오기 
	public List selectByTopCategory(int topcategory_id) {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		List list = new ArrayList(); //rs를 대신할 레코드 집합!!! 단  VO가 들어갈 예정
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); //드라이버 로드
			con=DriverManager.getConnection(url, user, pass);
			String sql="select * from subcategory where topcategory_id=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, topcategory_id);//바인드 변수값 지정
			rs=pstmt.executeQuery();//select문 수행..
			
			while(rs.next()) {
				SubCategory subCategory = new SubCategory();//empty vo
				subCategory.setSubcategory_id(rs.getInt("subcategory_id")); //pk
				subCategory.setTopcategory_id(rs.getInt("topcategory_id")); //fk
				subCategory.setName(rs.getString("name"));//name
				list.add(subCategory);//한건의 레코드를 담은 인스턴스를 다시 리스트에 누적시키자!!
			}
			
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











