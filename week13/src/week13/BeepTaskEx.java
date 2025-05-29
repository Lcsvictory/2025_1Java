package week13;


public class BeepTaskEx{
	public static void main(String[] args) throws InterruptedException {
		Runnable r1 = new BeepTask();
		Thread t1 = new Thread(r1);
		t1.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("***");
			Thread.sleep(1000);
		}
	}
}
