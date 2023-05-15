package chapter07;

public class InitEx2 {
	
	static int sVar;
	static void sMethod() {
		
	}
	
	int var;
	void method() {
		
	}
		
	// static 초기화 블럭
	static {
		sVar = 0;
		sMethod();
		
		/* 에러!!! 인스턴스 변수, 메서드는 이 초기화 블럭에 사용 불가
		var =0;
		method();
		 */
	}

	/* static 메서드
	static void sMethod() {
		// 에러!!! static 메서드에서 this 사용 불가
		this.sVar =0;
		this.sMethod();
	}
	*/
		
}