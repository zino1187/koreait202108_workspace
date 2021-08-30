package com.koreait.stream6;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.plaf.DimensionUIResource;

public class DownLoader extends JFrame implements ActionListener{
	JTextField t_url; //이미지 경로 
	JButton bt;
	URL url;
	HttpURLConnection httpCon; //웹상의 요청을 시도하는데 사용하는 객체 (브라우저 없이 자바코드에서)
	
	public DownLoader() {
		//생성 
		t_url = new JTextField();
		bt = new JButton("DownLoad");
		
		//스타일
		this.setLayout(new FlowLayout());
		t_url.setPreferredSize(new DimensionUIResource(570, 40));
		t_url.setFont( new Font("Verdana", Font.BOLD, 16));
		
		//조립 
		add(t_url);
		add(bt);
		
		//윈도우설정
		setSize(600,120);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		 
		bt.addActionListener(this);//이벤트소스와 리스너연결
	}
	
	//이미지 다운로드
	public void getImage() {
		//스트림을 생성하되, 로컬상의 파일이 아닌, 원격지의 url로부터 스트림을 생성...
		
		//사용자가 입력한 값을 url의 생성자 매개변수로 활용하자
		try {
			url  = new URL(t_url.getText());
			URLConnection con=url.openConnection();
			httpCon=(HttpURLConnection)con;
			
			// https://p4.wallpaperbetter.com/wallpaper/226/591/773/ocean-waves-wide-wallpaper-494625-wallpaper-preview.jpg
			
			//이시점부터, 웹상의 필요한 자원에 스트림 연결이 가능..
			InputStream is=httpCon.getInputStream();
			
			//읽기 
			int data=-1;
			while(true) {
				data=is.read();
				if(data==-1)break;
				System.out.println(data);
			}
			JOptionPane.showMessageDialog(this , "읽기 완료");	
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void actionPerformed(ActionEvent e) {
		System.out.println("나 눌렀어?");
		getImage();
	}
	
	public static void main(String[] args) {
		new DownLoader();
	}
}







