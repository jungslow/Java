package chapter06;

import java.util.Arrays;

public class ArrEx16 {

	public static void main(String[] args) {
		
		int[] arrInt = {1, 2, 3, 4, 5};
		
		for (int i=0; i<arrInt.length; i++) {
			System.out.printf("%3d", arrInt[i]);
		}
		System.out.println();
		
		/* 파이썬의 for row in rows 구문과 유사함  */
		for (int num : arrInt) {
			System.out.printf("%3d", num);
		}
			
	}

}
