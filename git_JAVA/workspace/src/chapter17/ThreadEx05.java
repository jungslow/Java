package chapter17;

public class ThreadEx05 {

	public static void main(String[] args) {
		
		
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i=0; i<50; i++) {
					System.out.println("t1 : "+i);
					try {
						Thread.sleep(1000);						
					} catch (InterruptedException e) {
						System.out.println(e.getMessage());
					}
				}
				System.out.println("스레드 실행 종료");
			}
		});
						
		t1.start();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		t1.interrupt();
		
	}
}