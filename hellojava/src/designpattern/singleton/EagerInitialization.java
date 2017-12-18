package designpattern.singleton;

public class EagerInitialization {

	// 자신의 객체를 정적 변수로 선언
    private static EagerInitialization instance = new EagerInitialization();
     
    // 은닉성을 적용하여 외부의 클래스로부터의 접근을 막는다.
    private EagerInitialization() {}
     
    // 기본생성자를 이용하여 객체를 생성
    public static EagerInitialization getSingleton() {
         
        return instance;
    }
    
    public void print() {
    	System.out.println("It's print() method in EagerInitialization instance.");
    	System.out.println("instance hashCode > " + instance.hashCode());
    }
}
