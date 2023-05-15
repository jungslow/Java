package chapter12;

class Car {
	String name;
	String company;
	
	public String toString() {
		return company + ":"+ name;
	}
}

public class Exercise2 {

	public static void main(String[] args) {
		Car car = new Car();
		car.name = "그랜저";
		car.company = "현대자동차";
		
		System.out.println(car);
	}
}
