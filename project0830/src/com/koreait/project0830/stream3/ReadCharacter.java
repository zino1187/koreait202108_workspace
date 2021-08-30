package com.koreait.project0830.stream3;
/*
FileInputStream�� read()�޼��忡 ���� �о���̴� �����Ͱ� 1byte�̸� , 2byte�� 
�ϳ��� ���ڷ� ������ �ִ� �ɷ��� ����..���� ������ �� ö�ڴ� ��쿣 1byte���� �ϹǷ�, 
�о���� �����͸� ���ڷ� �����ϴµ� ������ ������, �ѱ��� ��쿣 �����ڵ� ����̶� 2byte��
�ϳ��� ���ڸ� ǥ���ϱ� ������ read() �޼���� �о���� 1byte�� �ѱ��� ǥ���� �� ����..
�ذ�å?  �о���� �����͸� ������� 2byte����, ���ڷ� �����ϴ� ���׷��̵� �� ���ڱ�ݽ�Ʈ����
�̿��ؾ� �Ѵ�..
*/
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

class ReadCharacter{
	FileReader reader; //������ �а�, �� ���� �����͸� 2byte�� ���� ���ڷ� �����ϴ� ��Ʈ��
	FileWriter writer; //���ڸ� ����� �� �ִ� ��Ʈ��
	
	//WEb���߽�  MVC����--> ��� ���� �з��� ��..�� ���Һ��� ���α׷��� �з�..
	//throws�� �ǹ�: �����ڰ� ó���� ���ܸ�, ������ �޼��� ȣ��ο��� ������Ű�� ���...
	public ReadCharacter() throws FileNotFoundException, IOException {
		
		reader = new FileReader("D:/koreait2108_workspace/data/memo.txt");
		writer = new FileWriter("D:/koreait2108_workspace/data/memo_copy.txt");

		//�� ���� �б�!!
		int data=-1;
		while(true){
			data=reader.read();
			if(data==-1)break;
			System.out.print((char)data);
			writer.write(data);
		}
		if(reader!=null)reader.close();
		if(writer!=null)writer.close();
		
	}

	public static void main(String[] args) throws FileNotFoundException, IOException{ //jvm...
		new ReadCharacter();
	}
}



