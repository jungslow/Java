package chapter05;

public class DoWhileEx {

	public static void main(String[] args) {
		
		int sum = 0;
		int i = 1;
		
		do {
			sum += i;
			i++;
		} while(i <= 100);
		System.out.println("Do While문 이용! \n숫자 1부터 100까지 합은 = "+sum+"입니다.");
				
	}

}
