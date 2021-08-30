//데이터를 읽을때 보다 효율성을 따져보자!!
package com.koreait.project0830.stream5;
import java.io.*;

//이미지 복사를 보다 속도를 높여보기!!
class BufferedApp{
	FileInputStream fis;
	FileOutputStream fos;

	public BufferedApp() throws FileNotFoundException, IOException{
		
		fis = new FileInputStream("D:/koreait2108_workspace/data/bg.jpeg");//원본 파일
		fos = new FileOutputStream("D:/koreait2108_workspace/data/bg_copy.jpg");//복사 파일
		
		int data=-1;
		byte[] buff=new byte[1024];//주머니의 크기를 정의 주머니의 크기  1kbyte

		while(true){
			data=fis.read(buff); //
			if(data==-1)break;
			System.out.println(data); //데이터 출력
			fos.write(buff);//출력
		}
		System.out.println("복사완료");
		fis.close();
		fos.close();
	}

	public static void main(String[] args) throws FileNotFoundException, IOException{
		new BufferedApp();
	}
}
