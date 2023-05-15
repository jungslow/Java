package chapter07;

public class Overloading {

	public static void main(String[] args) {
		
		Operator op = new Operator();
		
		// 동일한 이름의 메서드가 호출되지만 매개변수의 Type은 모두 다르다.
		System.out.println(op.multiply(4, 3));
		System.out.println(op.multiply(4.5, 3.5));
		System.out.println(op.multiply(4, 3.5));
		System.out.println(op.multiply(4.5, 3));
		
	}

}

class Operator {
	
	int multiply(int x, int y) {
		System.out.print("(int, int) = ");
		return x*y;	
	}
	
	double multiply(double x, double y) {
		System.out.print("(double, double) = ");
		return x*y;	
	}
	double multiply(int x, double y) {
		System.out.print("(int, double) = ");
		return x*y;	
	}
	double multiply(double x, int y) {
		System.out.print("(double, int) = ");
		return x*y;	
	}

}
