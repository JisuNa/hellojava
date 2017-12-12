package designpattern.singleton;

public class HelloSingleton {

	// 자신의 객체를 정적 변수로 선언
    private static HelloSingleton helloSingleton = new HelloSingleton();
     
    // 은닉성을 적용하여 외부의 클래스로부터의 접근을 막는다.
    private HelloSingleton() {}
     
    // 기본생성자를 이용하여 객체를 생성
    public static HelloSingleton getSingleton() {
         
        return helloSingleton;
    }
}
