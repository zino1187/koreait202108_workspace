class BraceTest{

	public static void main(String[] args){
		//기본자료형 문자,숫자,논리값 
		//문자,숫자는 같은 종류의 자료형이다!!, boolean 별개..
		byte b =3;
		short s = 5;
		
		//강제 형변환 (소괄호)를 가리켜  cast연산자라 함
		b=(byte)s; //정말 할래요?? 손실 발생해도??
	}

}