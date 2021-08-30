package  com.koreait.project0830.stream4;
import java.io.InputStream;
import java.io.IOException;
class KeyBoardInputApp{
	public static void main(String[] args) throws IOException{
		//일반적으로 하드웨어들은  OS가 제어하고, 응용프로그램들이 해당 하드웨어와의 입출력을 위해서는 
		//직접 하드웨어에 접근하지 않고, OS로부터 스트림을 얻어다 쓴다.. 
		//따라서 인간이 컴퓨터이 보편적으로 사용하는 스트림의 경우엔, os가 보유한 스트림을 자바에서
		//접근할 수 있는 객체들을 사용하면 된다.. 
		//System.out; //시스템인 OS 우리 대신에 표준출력 기기에 대한 스트림을 가진 객체
		InputStream is = System.in; //표준입력스트림, 주로 키보드 등에 연결된 스트림..
		int data=-1;

		while(true){
			data=is.read(); //키보드로부터 1byte 읽어들임
			System.out.print((char)data);
		}
	}
}
