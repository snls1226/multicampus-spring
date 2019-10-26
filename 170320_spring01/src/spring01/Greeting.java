package spring01;

public class Greeting {
	public Greeting() {
		System.out.println("Greeting 생성자 호출됨");
	}
	
	public void greeting() {
		System.out.println("Hello World");
	}
	
	// 생성 시 동작 함수
	public void initObj() {
		System.out.println("객체 생성됨");
	}
	
	public void destroyObj() {
		System.out.println("객체 소멸됨");
	}
}
