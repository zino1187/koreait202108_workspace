package  com.koreait.project0830.stream4;
import java.io.InputStream;
import java.io.IOException;
class KeyBoardInputApp{
	public static void main(String[] args) throws IOException{
		//�Ϲ������� �ϵ�������  OS�� �����ϰ�, �������α׷����� �ش� �ϵ������� ������� ���ؼ��� 
		//���� �ϵ��� �������� �ʰ�, OS�κ��� ��Ʈ���� ���� ����.. 
		//���� �ΰ��� ��ǻ���� ���������� ����ϴ� ��Ʈ���� ��쿣, os�� ������ ��Ʈ���� �ڹٿ���
		//������ �� �ִ� ��ü���� ����ϸ� �ȴ�.. 
		//System.out; //�ý����� OS �츮 ��ſ� ǥ����� ��⿡ ���� ��Ʈ���� ���� ��ü
		InputStream is = System.in; //ǥ���Է½�Ʈ��, �ַ� Ű���� � ����� ��Ʈ��..
		int data=-1;

		while(true){
			data=is.read(); //Ű����κ��� 1byte �о����
			System.out.print((char)data);
		}
	}
}
