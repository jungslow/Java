package chapter14;

public class GenericEx5 {

	public static void main(String[] args) {

		
			System.out.println();
		
	}
}

class Gen1 {
	String name = "Gen1";
	
	String getName() {
		return name;
	}
}
class Gen2 extends Gen1 {
	String name = "Gen2";
	
	String getName() {
		return name;
	}
}
class Gen3 extends Gen2 {
	String name = "Gen3";
	
	String getName() {
		return name;
	}
}
class Generic5<T> {
	T obj;
	
	Generic5(T obj) {
		this.obj = obj;
	}
	void set(T obj) {
		this.obj = obj;
	}
	T get() {
		return obj;
	}
}

