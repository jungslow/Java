package chapter06;

import java.util.Arrays;

public class exercise4 {

	public static void main(String[] args) {
		
		int[] score = {90, 80, 60, 100};
		int totalScore = 0;
		double avgScore = 0;
		for (int i=0; i<score.length; i++) {
			totalScore += score[i];
		}
		avgScore = (double)totalScore/score.length;
			
		
		System.out.printf("합계 점수 : %5d\n", totalScore);
		System.out.printf("평균 점수 : %5.1f", avgScore);
											
	}

}
