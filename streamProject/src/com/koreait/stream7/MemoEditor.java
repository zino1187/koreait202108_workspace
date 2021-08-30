package com.koreait.stream7;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

//자바로 메모장을 구현해본다!!
public class MemoEditor extends JFrame{
	JMenuBar bar;//메뉴바 - 메뉴들이 올라갈 영역 ( 안드로이드에서에서는 액션바)
	JMenu m_file, m_edit, m_font,m_view, m_help; //5개의 메뉴 선언 
	JMenuItem item_new, item_open, item_save, item_saveas, item_page,item_print,item_exit;
	
	JTextArea area; //멀티라인 텍스트 입력 상자 
	JScrollPane scroll; //스크롤바
	FileReader reader; //파일의 내용을 읽어, 문자(한글,아랍어,중국어 등 영문이외)가 깨지지 않아야 하므로 ,Reader계열이 필요함 
	BufferedReader buffr;
	
	public MemoEditor() {
		bar = new JMenuBar();
		m_file=new JMenu("파일(F)");
		m_edit=new JMenu("편집(E)");
		m_font=new JMenu("서식(O)");
		m_view=new JMenu("보기(V)");
		m_help=new JMenu("도움말(H)");
		
		item_new = new JMenuItem("새로 만들기");
		item_open = new JMenuItem("열기");
		item_save = new JMenuItem("저장");
		item_saveas = new JMenuItem("다음 이름으로 저장");
		item_page = new JMenuItem("페이지설정");
		item_print = new JMenuItem("인쇄");
		item_exit = new JMenuItem("끝내기");
			
		area = new JTextArea();
		scroll = new JScrollPane(area);
		
		
		//프레임에 스크롤 부착
		//메뉴바에 메뉴 올리기 
		bar.add(m_file);
		bar.add(m_edit);
		bar.add(m_font);
		bar.add(m_view);
		bar.add(m_help);
		
		//파일메뉴에, 아이템들 부착 
		m_file.add(item_new);
		m_file.add(item_open);
		m_file.add(item_save);
		m_file.add(item_saveas);
		m_file.addSeparator(); //구분선 긋기
		m_file.add(item_page);
		m_file.add(item_print);
		m_file.addSeparator();//구분선 긋기
		m_file.add(item_exit);
		
		this.setJMenuBar(bar);
		this.add(scroll);
		
		
		setSize(700,600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		//이벤트소스와 리스너와의 연결 
		item_open.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JOptionPane.showMessageDialog(MemoEditor.this , "파일 열꺼야?");	
				//openFile();
				openFileWithBuffered();
			}
		});
	}
	
	//파일 열기 
	public void openFile() {
		try {
			reader = new FileReader("D:\\koreait2108_workspace\\streamProject\\src\\com\\koreait\\stream6\\DownLoader.java");
			
			int ch=-1;
			
			while(true){	
				ch=reader.read(); // 1 character read
				//ch --> String 이 되려면 즉 기본자료형 --> 객체자료형으로 되는 것이므로 Wrapper 도움을 받아야 한다..
				///ch --> Character
				if(ch==-1)break;
				area.append(Character.toString((char)ch)); //  'p'  --> "p"
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(reader!=null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	//버퍼가 이미 처리된 업그레이드 된 스트림을 이용해본다.. 
	public void openFileWithBuffered() {
		String path="D:\\koreait2108_workspace\\streamProject\\src\\com\\koreait\\stream6\\DownLoader.java";
		
		try {
			buffr = new BufferedReader(new FileReader(path));
			
			//버퍼를 이용하여 읽어보기
			String data=null;
			while(true) {
				data=buffr.readLine(); //data 스트림의 끝을 만나면 읽어들인 데이터가 없을때는 null
				if(data==null)break;
				area.append(data+"\n");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(buffr!=null) {
				try {
					buffr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		
		}
	}
	
	
	public static void main(String[] args) {
		new MemoEditor();
	}
}














