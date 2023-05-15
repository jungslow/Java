package chapter07;

public class FinalEX {
	
	public static void main(String[] args) {
		
		Final f = new Final(); 
		// f.number = 200;   //에러!!!
		System.out.println(f.number);
	}
}
	
class Final {
	final int number;

	Final() {
		number = 100;
	}
}

