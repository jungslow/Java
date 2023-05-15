package chapter16;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;
import java.util.stream.IntStream;

public class RandomToStream {

	public static void main(String[] args) {
			
		System.out.println("int형 난수 스트림 :");
		IntStream ist = new Random().ints(3);
		ist.forEach(s -> System.out.println(s));

		System.out.println("int형 난수 스트림 :");
		ist = new Random().ints(10,0,3);
		ist.forEach(s -> System.out.println(s));
		System.out.println();
		
		System.out.println("long형 난수 스트림 :");
		LongStream lst = new Random().longs(3,0,10);
		lst.forEach(s -> System.out.println(s));
		System.out.println();
		
		System.out.println("Double형 난수 스트림 :");
		DoubleStream dst = new Random().doubles(3);
		dst.forEach(s -> System.out.println(s));
		
	}

}
