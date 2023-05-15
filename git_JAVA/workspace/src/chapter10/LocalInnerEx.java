package chapter10;

public class LocalInnerEx {	// 바깥 클래스
	int i=10;				// 멤버 변수, 전역 변수
	
	void outerMethod() {
		class Inner {		// 로컬 클래스
			int x = 10;		// 지역 변수
			int i = 30;		// 지역 변수
			void innerMethod() {
				System.out.println(x);
				System.out.println(i);			// 안쪽 클래스의 i
				System.out.println(this.i);		// 안쪽 클래스의 i
				System.out.println(LocalInnerEx.this.i);		// 바깥 클래스의 i
			}
		}
		
		Inner inn = new Inner();	// 
		inn.innerMethod();
	}
	
	public static void main(String[] args) {
		LocalInnerEx lic = new LocalInnerEx();		// 바깥 클래스의 객체를 먼저 생성한 후
		lic.outerMethod();							// 메서드 호출
	}
	

}
