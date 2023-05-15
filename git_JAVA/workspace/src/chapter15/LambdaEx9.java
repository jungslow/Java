package chapter15;

import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;

public class LambdaEx9 {

	static Student[] list = {
			new Student("홍길동",90, 80,"컴공"),
			new Student("이순신",95, 70,"통계"),
			new Student("김유신",100, 60,"빅데이터")
		};
	
	public static void main(String[] args) {
		
		System.out.print("최대 수학 점수 : ");
		int max = maxOrMinMath((a,b) -> {
			if (a>=b) return a;
			else return b;
		});
		System.out.println(max);
		
		System.out.print("최소 수학 점수 : ");
		System.out.println(maxOrMinMath((a,b) -> (a<=b?a:b)));
		
		System.out.print("최대 평균 점수 : ");
		System.out.println(maxOrMinAvg((a,b) -> (a>=b?a:b)));
		
		System.out.print("최소 평균 점수 : ");
		System.out.println(maxOrMinAvg((a,b) -> (a<=b?a:b)));	
									
	}
	
	private static int maxOrMinMath(IntBinaryOperator op) {
		int result = list[0].getMath();
		for (Student s : list) {
			result = op.applyAsInt(result,  s.getMath());
		}
		return result;
	}
	
	private static Double maxOrMinAvg(DoubleBinaryOperator op) {
		double result = (list[0].getMath() + list[0].getEng()) / 2.0;
		for (Student s : list) {
			result = op.applyAsDouble(result,  (s.getMath()+s.getEng())/2.0);
		}
		return result;
	}
}
	