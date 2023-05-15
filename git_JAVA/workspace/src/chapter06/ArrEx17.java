package chapter06;

import java.util.Arrays;

public class ArrEx17 {

	public static void main(String[] args) {
		
		String[] names = {"홍길동", "이순신", "김유신"};
		int[] score = {90, 80, 100};		
		
		int i = 0;
		for (String name : names) {
			System.out.printf(name + " : %3d\n", score[i]);
			i++;
		}
			
	}

}
