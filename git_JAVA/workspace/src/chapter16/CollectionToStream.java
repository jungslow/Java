package chapter16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CollectionToStream {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("a", "b", "c", "d", "e");
		
		Stream<String> stream = list.stream();
		stream.forEach(s -> System.out.println(s));

	}
}
