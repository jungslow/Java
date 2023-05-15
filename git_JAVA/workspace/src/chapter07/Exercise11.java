package chapter07;

public class Exercise11 {

	public static void main(String[] args) {
		int[] arr = {9, 5, 24, 13, 3, 21};
		
		Mathm m = new Mathm();
		int max = m.max(arr);
		int min = m.min(arr);
		
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);

	}
}

class Mathm {
	
	public int max(int[] arr) {
	    int temp = arr[0];
		for(int i=1; i<arr.length; i++) {
			if (arr[i] > temp) {
				temp = arr[i];
			}
		}
		return temp;
	}
		
	public int min(int[] arr) {
	    int temp = arr[0];
		for(int i=1; i<arr.length; i++) {
			if (arr[i] < temp) {
				temp = arr[i];
			}
		}
	return temp;
	}
}