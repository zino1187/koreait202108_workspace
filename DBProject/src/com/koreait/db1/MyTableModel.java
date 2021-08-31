package com.koreait.db1;

import javax.swing.table.AbstractTableModel;

//아래의 클래스는 이름은 모델이지만, JTable(View)와  데이터, 오라클 연동코드를 철저히 분리시기 위한 
//중간 매개인 컨트롤러이다!!
//우리가 정의한 MyTableModel 은 TableModel 이다!!
public class MyTableModel extends AbstractTableModel{
	
	//아래의 메서드들은 JTable이 정보 가져가기 위한  메서드들이다..따라서  JTable이 호출함
	
	//몇층이야?
	public int getRowCount() {
		return 10;
	}
	
	//몇호수야?
	public int getColumnCount() {
		return 4;
	}
	//각 칸마다 어떤 데이터 넣어?
	public Object getValueAt(int row, int col) {
		System.out.println(row+", "+col);
		return "apple";
	}

}







