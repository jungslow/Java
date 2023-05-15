package chapter08;

public class SuperEx2 {
	static String name;
	public static void main(String[] args) {
		Child2 child2 = new Child2(name);
	}
}

class Parent2 {
	String name;
	
	Parent2(String name) {
		this.name = name;
	}
}

class Child2 extends Parent2 {   
	
	Child2(String name) {
		super(name);
	}
	
}
