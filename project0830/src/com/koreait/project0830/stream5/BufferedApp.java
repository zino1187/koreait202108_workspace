//�����͸� ������ ���� ȿ������ ��������!!
package com.koreait.project0830.stream5;
import java.io.*;

//�̹��� ���縦 ���� �ӵ��� ��������!!
class BufferedApp{
	FileInputStream fis;
	FileOutputStream fos;

	public BufferedApp() throws FileNotFoundException, IOException{
		
		fis = new FileInputStream("D:/koreait2108_workspace/data/bg.jpeg");//���� ����
		fos = new FileOutputStream("D:/koreait2108_workspace/data/bg_copy.jpg");//���� ����
		
		int data=-1;
		byte[] buff=new byte[1024];//�ָӴ��� ũ�⸦ ���� �ָӴ��� ũ��  1kbyte

		while(true){
			data=fis.read(buff); //
			if(data==-1)break;
			System.out.println(data); //������ ���
			fos.write(buff);//���
		}
		System.out.println("����Ϸ�");
		fis.close();
		fos.close();
	}

	public static void main(String[] args) throws FileNotFoundException, IOException{
		new BufferedApp();
	}
}
