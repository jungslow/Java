package chapter07;

public class MethodCall {

	public static void main(String[] args) {
		
		// 클래스 메서드(static)는 직접 실행
		Method.printName();
		
		// 인스턴스 메서드는 객체 생성 후 실행
		Method m = new Method();
		m.printEmail();

	}

}

class Method {
	
	static void printName() {
		System.out.println("printName() 실행 : ");	
	}

	void printEmail() {
		System.out.println("printEmail() 실행 : ");
		printId();		// 동일 class내에서는 메서드를 직접 호출 가능
	}
	
	void printId() {
		System.out.println("printId() 실행 : ");	
	}

}
