package week13;

public class BeepThread extends Thread{
	public BeepThread() {
		System.out.println("BeepThread() called.");
	}
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Beep!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		super.run();
	}
}
