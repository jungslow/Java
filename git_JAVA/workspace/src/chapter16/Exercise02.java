package chapter16;

import java.util.stream.Stream;

public class Exercise02 {

	public static void main(String[] args) {
		
		// 문자열 스트림 객체
		Stream<String> stream1 = Stream.of("홍길동", "김유신", "이순신", "유관순");
	
		// 정수 스트림 객체
		Stream<Integer> stream2 = Stream.of(1,2,3,4,5,6,7,8,9,10);
		
		Stream<Object> concat = Stream.concat(stream1, stream2);
		concat.forEach(a -> System.out.println(a + ","));
		
	}
}
