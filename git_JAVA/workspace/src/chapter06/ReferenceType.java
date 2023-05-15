package chapter06;

public class ReferenceType {

	public static void main(String[] args) {
		
		String name1 = "홍길동";
		String name2 = "홍길동";
		
		System.out.println(name1 == name2);		// type 1 - 주소 동일
		
		String name3 = new String("홍길동");
		String name4 = new String("홍길동");
		
		System.out.println(name3 == name4);	// type 2 - 객체 따로 생성 ==> 주소 다름	
		
		System.out.println(name3.equals(name4));	// type 3 - 객체의 값 비교 시
					
					
	}

}
