package chapter17;

public class ThreadEx12 {

	public static void main(String[] args) {
		
		DaemonThread dt1 = new DaemonThread();
		DaemonThread dt2 = new DaemonThread();
		
		dt1.setDaemon(true);
		dt2.setDaemon(true);
		
		dt1.start();
		dt2.start();
		
		try {
			Thread.sleep(5000);
		} catch(InterruptedException e) {}
		System.out.println("main 종료");
	
	}
}

class DaemonThread extends Thread {
	public void run() {
		while (true) {
			System.out.println(getName());
			try {
				sleep(500);
			} catch (InterruptedException e) {}
		}	
	}
}
