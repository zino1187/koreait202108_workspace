package com.koreait.db1;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

//데이터를 출력하는데 있어, 가장 적합한 표를 표현한 객체를 사용해본다 
//JTable
public class BasicTable extends JFrame{
	JTable table;
	JScrollPane scroll;
	
	//표에 보여질 컬럼 배열 
	String[] columns= {"이름","연락처","주소","이메일"};
	String[] row1= {"김어준","010-8888-9999","서울 양천구","ddanji@naver.com"};
	String[] row2= {"배트맨","010-7777-3333","서울 강남구","batman@naver.com"};
	String[] row3= {"수퍼맨","010-1111-2222","서울 구로구","super@naver.com"};
	String[][] data=new String[3][4]; //3층, 4호수
	
	public BasicTable() {
		data[0]=row1;
		data[1]=row2;
		data[2]=row3;
		
		table = new JTable(data,columns);
		scroll = new JScrollPane(table);
		
		add(scroll);
		
		setSize(500,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//이벤트소스와 리스너 연결 
		table.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent e) {
				//System.out.println("마우스 눌렀어?");
				//표에서 클릭한 지점의 좌표 알아맞추기!!!
				int row=table.getSelectedRow();//선택한 좌표의 층수!!
				int col=table.getSelectedColumn(); //선택한 호수!!
				//System.out.println(row+"의 "+col+"호수 선택햇어?");
				
				String value=(String)table.getValueAt(row, col);
				System.out.println("당신이 선택한 좌표의 값은 "+value);
			}
		});
	}
	public static void main(String[] args) {
		new BasicTable();
	}
}











