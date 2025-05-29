package week13;

public class MyThread extends Thread{
	private int x = 0;
	
	public MyThread(int x) {
		this.x = x;
	}
	
	@Override
	public void run() {
		System.out.println(this.x + "번째 Thread입니다.");
	}
}
