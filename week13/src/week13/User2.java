package week13;

public class User2 extends Thread{
	private Calculator c1;
	
	public void setCalc(Calculator c1) {
		this.c1 = c1;
	}
	
	@Override
	public void run() {
		try {
			c1.setMemory(50);
//			System.out.println(c1.getMemory());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
