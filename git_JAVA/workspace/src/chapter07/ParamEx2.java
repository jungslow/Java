package chapter07;

public class ParamEx2 {

	public static void main(String[] args) {
		
		Param p = new Param();
		
		p.add(10,5);
		p.add2(10,5);
		
		System.out.println();
//		p.add(10.5, 5.5); 	에러 발생
		p.add((int)10.5, (int)5.5);		// 형변환 후 호출
		p.add2(10.5, 5.5);	
	}

}
