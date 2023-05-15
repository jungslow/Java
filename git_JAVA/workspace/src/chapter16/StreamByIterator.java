package chapter16;

import java.util.stream.Stream;

public class StreamByIterator {
	
	public static void main(String[] args) {
		
		Stream<Integer> stream = Stream.iterate(1,n -> n+2).limit(10);
		stream.forEach(s -> System.out.println(s));
	}
}
