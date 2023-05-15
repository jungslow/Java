package chapter15;

public class LambdaFunctionEx {

	public static void main(String[] args) {
		InterfaceEx ie = (int x, int y) ->x + y;
		
		System.out.println(ie.sum(4,7));
	}
}
interface InterfaceEx {
	public int sum(int x, int y);
}

