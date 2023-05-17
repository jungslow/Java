package chapter16;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamConcat {

	public static void main(String[] args) {
		
		// 문자열 배열
		String[] arr = new String[] {"a", "b", "c", "d", "e","f"};
		
		Stream<String> str = Arrays.stream(arr);
		str.forEach(s -> System.out.print(s+ " "));
		
	}
}
