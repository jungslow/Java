package chapter07;

// 설계도로서 실행되지 않음 : main 메서드가 없다.
public class Car {

	// 멤버변수 정의
	String color;
	String company;
	String type;
		
	// 메서드 정의
	public void go() {
		System.out.println("전진하다.");
	}
		
	public void back() {
		System.out.println("후진하다.");
	}
				
}
