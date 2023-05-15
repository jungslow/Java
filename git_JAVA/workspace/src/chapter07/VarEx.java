package chapter07;

public class VarEx {

	public static void main(String[] args) {
		
		// 클래스 변수 사용
		System.out.println("Avante 제조사 : "+ Avante.company);	//객체생성 없이 사용
		
		Avante a1 = new Avante();
		Avante a2 = new Avante();
		
		// 객체생성 후 인스턴스 변수의 값 변경 *** Avante.color 형태로 사용 불가
		a1.color = "화이트";
		a2.color = "블랙";
		
		// 인스턴스 변수 출력
		System.out.println("a1 색상 : "+ a1.color);
		System.out.println("a2 색상 : "+ a2.color);
		
		// 클래스 변수를 인스턴스 객체로 출력		
		System.out.println("a1 제조사 : "+ a1.company);
		System.out.println("a2 제조사 : "+ a2.company);
		
		// 클래스 변수의 값 변경 후 클래스변수와 인스턴스변수 출력
		a1.company = "기아";		// 메모리에 상주하면서 공통으로 사용
		System.out.println("Avante 제조사 : "+ Avante.company);
		System.out.println("a1 제조사 : "+ a1.company);
		System.out.println("a2 제조사 : "+ a2.company);
		
	}

}

// Avante는 main이 없어서 객체를 생성하지 않으면 사용 못함
class Avante {
	
	String color;
	static String company = "현대";	// 다른 곳에서도 Avante.company로 불러서 사용 가능 
}
