package chapter12;

import java.util.Random;

public class RandomEx2 {
	
	public static void main(String[] args) {
		
		Random rand = new Random();
				
		for (int i=0; i<10; i++) {
			System.out.print(rand.nextInt(6)+1+" ");
		}
		
	}
}
