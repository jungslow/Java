package chapter08.poly;

public class PolyEx2 {

	public static void main(String[] args) {
		
		Parent p = new Child();
		
		p.run();
		
		Child c = (Child)p;		// 자동형변환
		c.eat();					// 재정의된 메서드 실행
		
	}

}
