package chapter07;

public class Car2 {

	String color;
	String company;
	String type;
	
	// 1번 생성자
	Car2() {
		this("white", "기아", "경차");
	}
	
	// 2번 생성자
	Car2(String color, String company, String type) {
		this.color = color;			
		this.company = company;
		this.type = type;
	}

	// 3번 생성자
	Car2(String com, String t) {
		this("white", com, t);
	}
	
	// 4번 생성자
	Car2(String t) {
		this("white", "기아", t);
	}	
	
	public String toString() {
		return color + "-" + company + "-" + type;
	}
}