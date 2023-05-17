package chapter16;

public class Circle extends Shape {

	double r;
	
	Circle() {
		this (1);
	}
	Circle(double r) {
		this.r = r;
	}
	
	@Override
	double area() {
		return (r*r)*Math.PI;
	}
	@Override
	double length() {
		return (r*2)*Math.PI;
	}
	@Override
	public String toString() {
		return "넓이 : "+ this.area();
	}
}
