package chapter08.poly;

public class Child extends Parent {
		
	String name;
	
	// 자식에서 메서드 재정의
	void run() {
		System.out.println("자식이 달린다.");
	}
	
	// 자식에서 메서드 추가
	void eat() {
		System.out.println("자식이 먹는다.");
	}
}
