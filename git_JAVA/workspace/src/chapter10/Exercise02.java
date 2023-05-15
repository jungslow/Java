package chapter10;

public class Exercise02 {
	public static void main(String[] args) {
		
		Out out = new Out();
		Out.In in = out.new In();
		System.out.println(in.name);
		
		System.out.println(new Out().new In().name);
	}
}

class Out {
	class In {
		String name = "자바";
	}
}