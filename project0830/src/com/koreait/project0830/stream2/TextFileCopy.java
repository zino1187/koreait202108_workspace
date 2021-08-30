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

			//������ ��Ʈ���� ���� ������ ���̸��ź���!!
			int data=-1;

			while(true){
				data=fis.read(); //1byte �б�(�Է�)
				if(data==-1)break;
				System.out.print((char)data);
				fos.write(data); //1byte ����(���)
			}
			System.out.println("���� ���� �Ϸ�");
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
