package chapter17;

public class ThreadEx10 {

	public static void main(String[] args) {
		
		SmartPhoneGame game = new SmartPhoneGame();
		
		Player1 p1 = new Player1();
		p1.setSmartPhoneGame(game);
		p1.start();
		
		Player2 p2 = new Player2();
		p2.setSmartPhoneGame(game);
		p2.start();
		
		
	}
}

class SmartPhoneGame {
	private int level;
	
	public int getLevel() {
		return this.level;
	}
	
	public synchronized void increaseLevel() {
		while(true) {
			this.level++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			System.out.println(Thread.currentThread().getName()
							+" Level :"+this.level);
			
			if (this.level ==5) {
				notifyAll();
				try {
					wait();
				} catch (InterruptedException e) {}
				break;
			}
			
			if (this.level %10 == 0) break;
		}
	}
}

class Player1 extends Thread {
	private SmartPhoneGame game;
	
	public void setSmartPhoneGame(SmartPhoneGame game) {
		this.setName("Player1");
		this.game = game;
	}
	
	@Override
	public void run() {
		game.increaseLevel();
	}
}


class Player2 extends Thread {
	private SmartPhoneGame game;
	
	public void setSmartPhoneGame(SmartPhoneGame game) {
		this.setName("Player2");
		this.game = game;
	}
	
	@Override
	public void run() {
		game.increaseLevel();
	}
}