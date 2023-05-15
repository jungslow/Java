package chapter05;

public class IfEx3 {

	public static void main(String[] args) {
		int math = 90;
		int eng = 95;
		
		// 중첩 if문
		if (math >= 60) {
			if (eng >= 60) {
				System.out.println("통과!");				
			}
		} else {
			System.out.println("탈락입니다.");
		}
		
		// if문에 논리연산 적용 
		if (math >= 60 && eng >= 60) {
			System.out.println("통과!");			
			
		} else {
			System.out.println("탈락입니다.");
		}
	}
}
