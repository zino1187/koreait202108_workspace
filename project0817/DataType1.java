/*자바의 클래스명은 첫 철자를 대문자로 해야 함*/
class DataType1{
	//독립실행형 응용프로그램의 시작 엔트리 포인트.. javaEE에서는 웹기반이기때문에 main이 없슴
	public static void main(String[] args){
		//자료형이란? 데이터의 종류, 즉 프로그래밍 언어에서 사용가능한 데이터의 종류..
		//문자(char), 숫자(정수, 실수), 논리값 (boolean)
		//정수: byte < short < int < long 
		//        1          2        4        8					
		//실수:                    float < double 
		//                              4        8
		
		int x=5;
		int y=7;
		System.out.println(x+y);

		char k='a';  //컴파일러가 진짜 싫어함!!
		char p=97; // ^____^

		int b=97;

		//문자, 숫자, 논리값
	}
}