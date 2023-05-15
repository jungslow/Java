package chapter16;

import java.util.stream.Stream;

public class StreamByBuilder {
	
	public static void main(String[] args) {
		
		Stream stream = Stream.builder()
			.add("무궁화")
			.add("삼천리")
			.add("화려강산")
			.add("대한사람")
			.build();
		stream.forEach(s -> System.out.println(s+ " "));
		
		Stream stream1 = Stream.generate(() -> "애국가").limit(5);
		stream1.forEach(s -> System.out.println(s+ " "));
	}
}
