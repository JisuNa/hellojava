package designpattern.singleton;

public class HelloSingletonTest {

	public static void main(String[] args) {

		HelloSingleton s1 = HelloSingleton.getSingleton();
        HelloSingleton s2 = HelloSingleton.getSingleton();
//      HelloSingleton s3 = new HelloSingleton();			// 에러발생
        
        System.out.println("s1 == s1 ?" + (s1==s2));
	}

}
