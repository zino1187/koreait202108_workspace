/*오리를 정의한다*/
class Duck{
	String name="도날드";
	int age=5;

	public void fly(){
		System.out.println("푸다닥");
	}

	public static void main(String[] args){
		int x=8; //지역
		Duck d1 = new Duck();
		Duck d2 = new Duck();

		
		System.out.println(d1);
	}
}
