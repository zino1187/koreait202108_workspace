package com.koreait.db1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectApp {
	
	
	public static void main(String[] args) {
		//오라클의 book 테이블에 존재하는 레코드를 자바의 콘솔에 출력해보자
		/*(1)JDBC란? Java Database Connectivity 의 약자로서, 자바로 데이터베이스를 연동하는 기술을 의미
		  				jdbc기술은 java.sql 패키지에 지원 
		  					
		 (2)DB연동 순서
		 	 - 해당제품의드라이버 로드  > 접속  > 쿼리문 실행 > db해제 
		 */
		
		Connection con=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");//1.드라이버 로드
			System.out.println("드라이버 로드 성공");
			
			//2.접속 
			String url="jdbc:oracle:thin:@localhost:1521:XE";
			String user="batman";
			String pass="1234";
			
			//Connection 객체는 다른 언어에서는, 접속을 시도하는 객체이지만, 자바에서는 접속 후, 해당 접속정보를 보유한 객체..
			con=DriverManager.getConnection(url, user, pass);
			if(con !=null) {
				System.out.println("접속 성공");
				String sql="select * from book";
				PreparedStatement pstmt=con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY); //쿼리수행 객체의 인스턴스 얻기
				
				
				ResultSet rs=pstmt.executeQuery(); //select문을 수행하는 메서드..그리고 원격지의 표가 자바의 메모리로 올라오며,
																		//이 올라온 표는 자바의 ResultSet 객체로 받아둔다!!
				rs.next();
				rs.next(); //이 시점에 커서는 jsp 레코드에 가 있을 것임..
				
				int book_id=rs.getInt("book_id");
				String book_name=rs.getString("book_name");
				int price=rs.getInt("price");
				String pubdate=rs.getString("pubdate");
				//System.out.println("현재 커서의 위치에서의 book_id="+book_id+",book_name="+book_name+",price="+price+",pubdate="+pubdate);
				
				//아래의 코드는 에러가 발생할 것이다. 
				//이유? 개발자가 ResultSet을 생성할때, 특정한 옵션을 주지 않으면 디폴트는 전방향 전용 ResultSet이기 때문이다.. 
				//따라서 커서를 전,후 방향으로 마음대로 제어하려면(Scroll이 가능한) 옵션을 부여해야 한다..
				rs.previous(); //이전으로 한컨 후진!!!
				//System.out.println("book_id="+rs.getInt("book_id")+", book_name="+rs.getString("book_name")+",price="+rs.getInt("price")+",pubdate="+rs.getString("pubdate"));	
				
				rs.beforeFirst();//커서 원상복귀
				
				while(rs.next()) { //next()가 참일때까지...
					System.out.println("book_id="+rs.getInt("book_id")+", book_name="+rs.getString("book_name")+",price="+rs.getInt("price")+",pubdate="+rs.getString("pubdate"));
				}
					
			}else {
				System.out.println("접속 실패");
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 로드 실패");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(con !=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}




