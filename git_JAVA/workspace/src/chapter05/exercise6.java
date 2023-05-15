package chapter05;

public class exercise6 {

	public static void main(String[] args) {
		
		for (int i=1; i<6; i++) {
			int m = 5;
			for (int j=1; j<10; j++) {
				if(j < (m+1-i)) {
					System.out.print(" ");
				} else if (j < m+i) {
					System.out.print("*");
				}				
			}
			System.out.println();
		}

	}

}
