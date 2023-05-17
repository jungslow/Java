package chapter16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class StreamMap {
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("동해물과", "백두산이", "마르고 닳도록");
		
		System.out.println("함수적 인터페이스 방식");
		list.stream().mapToInt(s -> s.length())
					.forEach(len -> System.out.println(len));
		System.out.println();
		
		System.out.println("메소드 참조 방식");
		list.stream().mapToInt(String::length)
					.forEach(len -> System.out.println(len));
		
	}
}
