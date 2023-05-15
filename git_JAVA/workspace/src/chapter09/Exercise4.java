package chapter09;

interface Tv {
	// 추상 메서드
	void turnOn();

}

public class Exercise4 {
	public static void main(String[] args) {
		
		Tv p1 = new Tv() {
			@Override
			public void turnOn() {
				System.out.println("TV를 켭니다.");
			}
		}; 		// 익명 구현 객체에는 끝에 반드시 ";" 추가
		
		p1.turnOn();
	}
}