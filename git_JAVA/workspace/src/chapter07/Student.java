package chapter07;

public class Student {

	String name;
	int grade;
	String department;
	
	// 1번 생성자
	Student() {
		System.out.println("1번");
	}
	
	// 2번 생성자
	Student(String n) {
		name = n;			
		System.out.println("2번");
	}

	// 3번 생성자
	Student(String n, int g) {
		name = n;			
		grade = g;
		System.out.println("3번");
	}
		
	// 4번생성자 
	Student(String n, int g, String d) {
		name = n;
		grade = g;
		department = d;
		System.out.println("4번");
	}

	
/* 	학과와 학년을 매개변수로 받는 생성자(3번 매개변수와 형식이 같아 에러 발생)
	Student(String d, int g) {
		department = d;			
		grade = g;
	}

*/
}