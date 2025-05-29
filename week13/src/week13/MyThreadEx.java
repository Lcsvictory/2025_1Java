package week13;

public class MyThreadEx {
	public static void main(String[] args) throws InterruptedException {
		MyThread t1;
		for (int i = 0; i < 100; i++) {
			 t1 = new MyThread(i);
			 t1.run();
			 MyThread t2 = new MyThread(i+3);
			 t2.join();
		}
	}
}
