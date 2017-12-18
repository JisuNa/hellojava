package designpattern.singleton;

public class EagerInitializationTest {

	public static void main(String[] args) {

		EagerInitialization s1 = EagerInitialization.getSingleton();
        EagerInitialization s2 = EagerInitialization.getSingleton();
//      HelloSingleton s3 = new HelloSingleton();			// 에러발생
        
        System.out.println("s1 == s1 ?" + (s1==s2));
	}

}
