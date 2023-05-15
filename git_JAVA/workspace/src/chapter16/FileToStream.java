package chapter16;

import java.util.stream.IntStream;

public class FileToStream {

	public static void main(String[] args) {
			
		String str = "자바 세상을 만들자.";
		
		IntStream ist = str.chars();
		ist.forEach(s -> System.out.println((char)s));
	
	}

}
