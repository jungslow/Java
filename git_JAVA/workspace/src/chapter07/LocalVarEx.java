package chapter07;

public class LocalVarEx {

	public static void main(String[] args) {
		
		Local local = new Local();
		
		System.out.println(local.name);  // null: 메서드가 실행되어야 name에 값이 들어감 
		
		
		local.process();		// 메서드가 실행되므로 name에 "홍길동"이 들어감
		
		System.out.println(local.name); 	// "홍길동"이 출력
		
		local.printAge1();		// age는 지역변수 : 메서드안에서만 사용됨
		local.printAge2();
		
		//
		for(int i=0; i<10; i++) {
			int temp = 0;
			temp += i;
		}
		// System.out.println(temp); 에러 발생!!! temp는 for문 블럭밖에서는 사용 불가
		
	}

}


class Local {
	
	String name;	// 전역변수
	void process() {
		name = "홍길동"; 
	}
	void printAge1() {
		int age = 20;
		System.out.println(age); 
	}
	void printAge2() {
		int age = 30;
		System.out.println(age); 
	}

}
