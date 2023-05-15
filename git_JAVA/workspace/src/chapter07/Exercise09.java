package chapter07;

public class Exercise09 {

	public static void main(String[] args) {
		ExerciseSgt ex1 = ExerciseSgt.getInstance();
		ExerciseSgt ex2 = ExerciseSgt.getInstance();
		
		System.out.println("ex1 == ex2 : " + (ex1 == ex2));	
	}
}


class ExerciseSgt {
		
	private static ExerciseSgt instance = new ExerciseSgt();

	public static ExerciseSgt getInstance() {
		System.out.println("객체 리턴");
		return instance;
	}
		
	private ExerciseSgt() {
	System.out.println("객체 생성");	
	}
}