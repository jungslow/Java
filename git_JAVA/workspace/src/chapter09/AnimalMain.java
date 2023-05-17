package chapter09;

public class AnimalMain {

	public static void main(String[] args) {

		Animal eagle = new Eagle();		// 상위 타입으로 객체 생성
		
		eagle.sleep();
		// eagle.eat();  // 에러(상위 형에서는 eat()메서드 이용 불가
		
		Eagle eagleObj = (Eagle)eagle;		// 강제 형변환
		eagleObj.eat();

	}

}
