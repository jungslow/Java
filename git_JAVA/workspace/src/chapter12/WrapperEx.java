package chapter12;

public class WrapperEx {

	public static void main(String[] args) {
		// 정수 10이 Integer 클래스 객체로 변환(boxing)
		Integer i1 = new Integer (10);
		Integer i2 = 10;
		Double d1 = new Double(100.0);
		Double d2 = new Double(100.0);
		
		System.out.println("i1==i2 : "+ (i1==i2));
		System.out.println("i1.equals(i2) : "+ (i1.equals(i2)));
		System.out.println("i1.toString() : "+ i1.toString());
		
		System.out.println("\nd1==d2 : "+ (d1==d2));
		System.out.println("d1.equals(d2) : "+ (d1.equals(d2)));
		System.out.println("d1.toString() : "+ d1.toString());
		
		System.out.println("\ni1 == 10 : "+ (i1 == 10));
		int i3 = 10;
		System.out.println("i1 == i3 : "+ (i1 == i3));
	
	}
}
