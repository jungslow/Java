package chapter16;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamPeek2 {

	public static void main(String[] args) {
		
		Shape s1 = new Rectangle(10,3);
		Shape s2 = new Circle(10);
		Shape s3 = new Rectangle(20,2);
		Shape s4 = new Circle(11);
		
		List<Shape> list = Arrays.asList(s1,s2,s3,s4);
		
		boolean result = list.stream().allMatch(a ->(a instanceof Shape));
		System.out.println("모든 요소는 Shape의 객체이다. -> "+result);
		
		boolean result2 = list.stream().
				anyMatch(a ->(a instanceof Rectangle));
		System.out.println("요소 중 Rectangle의 객체가 존재한다. -> "+result2);
		
		boolean result3 = list.stream().
				noneMatch(a ->(a instanceof Circle));
		System.out.println("요소 중 Circle의 객체가 존재하지 않는다. -> "+result3);
		
	}

}
