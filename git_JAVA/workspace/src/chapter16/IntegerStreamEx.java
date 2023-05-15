package chapter16;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntegerStreamEx {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		System.out.println("Arrays.stream() IntStream생성하기");
		IntStream intstream1 = Arrays.stream(arr);
		intstream1.forEach(s -> System.out.print(s+"\t"));
		System.out.println();
		
		System.out.println("IntStream.of() IntStream생성하기");
		IntStream intstream2 = IntStream.of(arr);
		intstream2.forEach(s -> System.out.print(s+"\t"));
		System.out.println();
		
		System.out.println("IntStream.range(1,6) IntStream생성하기");
		IntStream intstream3 = IntStream.range(1,6);
		intstream3.forEach(s -> System.out.print(s+"\t"));
		System.out.println();
		
		System.out.println("IntStream.rangeClosed(1,5) IntStream생성하기");
		IntStream intstream4 = IntStream.rangeClosed(1,5);
		intstream4.forEach(s -> System.out.print(s+"\t"));

	}

}
