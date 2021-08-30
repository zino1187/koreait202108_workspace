package com.koreait.project0830.stream2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class TextFileCopy{
	FileInputStream fis;
	FileOutputStream fos;

	public TextFileCopy(){
		try{
			fis = new FileInputStream("D:/koreait2108_workspace/data/memo.txt");
			fos = new FileOutputStream("D:/koreait2108_workspace/data/memo_copy.txt");

			//생성된 스트림을 통해 데이터 들이마셔보자!!
			int data=-1;

			while(true){
				data=fis.read(); //1byte 읽기(입력)
				if(data==-1)break;
				System.out.print((char)data);
				fos.write(data); //1byte 쓰기(출력)
			}
			System.out.println("파일 복사 완료");
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			if(fis!=null){
				try{
					fis.close();
				}catch(IOException e){
					e.printStackTrace();
				}
			}
			if(fos!=null){
				try{
					fos.close();
				}catch(IOException e){
					e.printStackTrace();
				}
			}

		}
	}

	public static void main(String[] args){
		new TextFileCopy();									
	}
}
