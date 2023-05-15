package chapter05;

public class ForEx {

	public static void main(String[] args) {
		
		int sum = 0;
		int i = 1;
		
		// for 문
		for (i=1; i<=100; i++) {
			sum += i;
		}
		System.out.println("for문 이용 \n숫자 1부터 100까지 합은 = "+sum+"입니다.");
		
		sum = 0;
		for (i=1; i<=100; i=i+2) {
			sum += i;
		}
		System.out.println("숫자 1부터 100까지 홀수의 합은 = "+sum+"입니다.");
		
		sum = 0;		
		for (i=2; i<=100; i=i+2) {
			sum += i;
		}
		System.out.println("숫자 1부터 100까지 짝수의 합은 = "+sum+"입니다.");
		
		
		// While문
		sum = 0;
		i = 1;
		while (i<=100) {
			sum += i;
			i++;
		}
		System.out.println("While문 이용! \n숫자 1부터 100까지 합은 = "+sum+"입니다.");
		
		sum = 0;
		i = 1;
		while (i<=100) {
			sum += i;
			i = i + 2;
		}
		System.out.println("숫자 1부터 100까지 홀수의 합은 = "+sum+"입니다.");
		
		sum = 0;
		i = 2;
		while (i<=100) {
			sum += i;
			i = i + 2;
		}
		System.out.println("숫자 1부터 100까지 홀수의 합은 = "+sum+"입니다.");
		
	}

}
