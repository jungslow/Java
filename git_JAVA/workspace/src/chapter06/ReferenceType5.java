package chapter06;

import java.util.Arrays;

public class ReferenceType5 {

	public static void main(String[] args) {
		
		// 배열 변수 선언
		int[] arr1 = {1,2,3};
		
		int[] arr2 = Arrays.copyOf(arr1, 3);	// 새로운 객체 생성 후 arr1객체의 값만 복사
		System.out.println("arr1 == arr2 : "+ (arr1 == arr2));
		
		arr2[0] = 4;
		System.out.println("arr1[0] : "+ arr1[0]);
		System.out.println("arr2[0] : "+ arr2[0]);
								
	}

}
