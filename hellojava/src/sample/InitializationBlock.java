package sample;

public class InitializationBlock {

	public static void main(String[] args) {
		NewClass NC1 = new NewClass();

	}

}

class NewClass {
	
	static {
		System.out.println("클래스 초기화");
	}
	
	{
		System.out.println("클래스 생성");
		
	}
	
	NewClass() {
		System.out.println("인자가 없는 생성자");
	}
	
	NewClass(String name) {
		System.out.println("인자가 있는 생성자");
	}
	
	
}
