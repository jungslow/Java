package chapter09;

public class Computer {

	public static void main(String[] args) {
		
		GraphicCard gc = new Amd();
		
		System.out.println("메모리 : "+gc.MEMORY);
		
		gc = new Amd();
		gc.process();
		
		gc = new Nvidia();
		gc.process();

	}

}
