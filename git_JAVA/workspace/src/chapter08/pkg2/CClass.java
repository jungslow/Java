package chapter08.pkg2;

import chapter08.pkg1.Aclass;

public class CClass extends Aclass{

	CClass() {
		this.varA = "varA";		// Protected 변수는 상속받은 Class에서 접근 가능
//		this.varA2 = "varA2";	// 사용 불가 : Default 변수는 상속받은 Class에서 접근 불가능
		this.methodA();			// Protected 메서드는 상속받은 Class에서 접근 가능
//		this.methodA2();		// 사용 불가 : Default 메서드는 상속받은 Class에서 접근 불가능
	}
}

