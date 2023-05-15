package chapter05;

public class IfEx {
	public static void main(String[] args) {
		int score = 50;
		
		System.out.println("시험 시작"); 
		if (score >= 60) {
			System.out.println("합격입니다."); 
		} else {
			System.out.println("불합격입니다. 다시 한 번 시험을 보셔야...");
		}
		System.out.println("시험 끝"); 
}
}
