package chapter06;

public class ArrEx14 {

	public static void main(String[] args) {
		
		int[] arrInt = {1, 2, 3};
		
		int[] arrInt2 = new int[5];
		
		
		System.arraycopy(arrInt,0,arrInt2,1,arrInt.length);

		for (int i=0; i<arrInt2.length; i++) {
			System.out.printf("%3d", arrInt2[i]);
		}
			
	}

}
