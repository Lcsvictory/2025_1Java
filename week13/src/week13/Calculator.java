package week13;

public class Calculator {
	private int memory = 0;

	public int getMemory() {
		return memory;
	}

	public synchronized void setMemory(int memory) throws InterruptedException {
		this.memory = memory;
		Thread.sleep(2000);
		
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	}
	
	
}
