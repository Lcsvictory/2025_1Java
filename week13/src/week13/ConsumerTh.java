package week13;

public class ConsumerTh extends Thread{
	private DataBox d1 = null;
	
	public void setDataBox(DataBox d1) {
		this.d1 = d1;
	}
			
	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			try {
				d1.getData();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
