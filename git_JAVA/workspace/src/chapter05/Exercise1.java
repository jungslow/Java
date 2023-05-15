package chapter05;

public class Exercise1 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i=5; i<=100; i=i+5) {
			sum = sum + i;
		}
		System.out.println("5의 배수의 합 = "+sum);
		
		int evensum = 0;
		int oddsum = 0;
		
		for(int i=1; i<=100; i++) {
			if(i%2 == 0) {
				evensum += i;
			 }
			else {
				oddsum += i; 
			 }
		}
		System.out.println("짝수의 합 = "+evensum);
		System.out.println("홀수의 합 = "+ oddsum);
	}

}
