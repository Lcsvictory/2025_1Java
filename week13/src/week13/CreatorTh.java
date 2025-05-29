package week13;

public class CreatorTh extends Thread{
	private DataBox d1 = null;
	//private static int cnt = 0;
	
	public void setDataBox(DataBox d1) {
		this.d1 = d1;
	}
			
	@Override
	public void run() {
		for (int i = 1; i <= 3; i++) {
			try {
				d1.setData("Data"+i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
