package chapter12;

import java.util.Arrays;

public class ArrayEx22 {

	public static void main(String[] args) {
		
		String[] arr = {"홍길동", "이순신", "강감찬", "김유신"};
		
		Arrays.fill(arr, "임꺽정");
		for (String n : arr) System.out.print(n + ",");
		System.out.println();
		
		Arrays.fill(arr, 1, 3, "x");
		for (String n : arr) System.out.print(n + ",");
		

	}

}
