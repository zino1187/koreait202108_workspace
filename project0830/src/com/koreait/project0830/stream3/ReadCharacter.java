package com.koreait.project0830.stream3;
/*
FileInputStream은 read()메서드에 의해 읽어들이는 데이터가 1byte이며 , 2byte를 
하나의 문자로 읽으수 있는 능력이 없다..따라서 영문의 한 철자는 경우엔 1byte차지 하므로, 
읽어들인 데이터를 문자로 변경하는데 문제가 없지만, 한글의 경우엔 유니코드 기반이라 2byte로
하나의 문자를 표현하기 때문에 read() 메서드로 읽어들인 1byte는 한글을 표현할 수 없다..
해결책?  읽어들인 데이터를 대상으로 2byte묶어, 문자로 이해하는 업그레이드 된 문자기반스트림을
이용해야 한다..
*/
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

class ReadCharacter{
	FileReader reader; //파일을 읽고, 그 읽은 데이터를 2byte씩 묶어 문자로 이해하는 스트림
	FileWriter writer; //문자를 출력할 수 있는 스트림
	
	//WEb개발시  MVC패턴--> 모듈 별로 분류가 됨..즉 역할별로 프로그램을 분류..
	//throws의 의미: 개발자가 처리할 예외를, 현재의 메서드 호출부에게 전가시키는 방법...
	public ReadCharacter() throws FileNotFoundException, IOException {
		
		reader = new FileReader("D:/koreait2108_workspace/data/memo.txt");
		writer = new FileWriter("D:/koreait2108_workspace/data/memo_copy.txt");

		//한 문자 읽기!!
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



