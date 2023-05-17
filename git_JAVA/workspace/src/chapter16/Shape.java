package chapter16;

abstract class Shape implements Comparable<Shape> {
	
	int x, y;
	
	Shape() {
		this(0,0);
	}
	Shape (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	abstract double area();
	abstract double length();
	
	public String getLocation() {
		return "x:"+ x + ",y:" + y;
	}
	
	@Override
	public int compareTo(Shape s) {
		return (int)(this.area() - s.area());
	}
}
