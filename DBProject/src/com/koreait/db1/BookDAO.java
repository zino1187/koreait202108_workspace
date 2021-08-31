package com.koreait.db1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JScrollPane;
import javax.swing.JTable;

//Data Access Object - 데이터 제어 전담객체  Book에 대한 Create(=insert) Rread Update Delete
public class BookDAO {
	String url="jdbc:oracle:thin:@localhost:1521:XE"; // jdbc:mysql://@localhost:3306/bigdata
	String user="batman";
	String pass="1234"; 
	
	//데이터 가져오기 Model
	public void getList() {
		Connection con=null;
		String sql="select * from book";
		System.out.println(sql);
		
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			pstmt=con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY); //쿼리수행 객체가 생성
			rs=pstmt.executeQuery(); //select문일 경우  executeQuery(), DML일 경우 executeUpdate();
			
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
			
			//테이블 생성 및 화면에 부착
			//결론 생성자에서 테이블이 사용할 데이터를 결정짓는 것은 고정적이고, 변화에 반응할 수 없다..
			table=new JTable(data, column);
			scroll = new JScrollPane(table);
			add(scroll);
			
			//table.updateUI();//jtable 새로고침 개발자가 paint()메서드로 직접 그린 경우엔 repaint() 지만, 단순한 컴포넌트 업데이트의 
			//경우엔 updateUI()
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(rs !=null) {
				try {
					rs.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}	
}
