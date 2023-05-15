package chapter08.poly;

public class PolyEx {

	public static void main(String[] args) {
		
		Child c = new Child();
		
		c.run();
		
		Parent p = new Child();		// 자동형변환
		p.run();					// 재정의된 메서드 실행
		// p.eat()                  // 에러
		
	}

}
