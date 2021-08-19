public class Radio {
	{
		System.out.println("A");
	}

	static{
		System.out.println("B");
	}
	public static void main(String[] args) {
		System.out.println("C");
		Radio ra1 = new Radio();
		Radio ra2 = new Radio();
	}
}
