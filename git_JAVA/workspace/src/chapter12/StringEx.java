package chapter12;

public class StringEx {

	public static void main(String[] args) {
		
		int score = 90;
		System.out.println("당신의 점수는 " + score + "점입니다.");
		
		// Score를 String형으로 변환
		String s = String.valueOf(score);
		System.out.println("당신의 점수는 " + s + "점입니다.");

		// 문자열을 + 연산하여 String형으로 변환
		String s2 = score + "";
		System.out.println("당신의 점수는 " + s2 + "점입니다.");
		
	}

}
