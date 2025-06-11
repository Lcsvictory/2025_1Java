package week13;

public class DataBox{
	private String data = null;

	public synchronized String getData(Thread th) throws InterruptedException {
		if (this.data == null) {
			wait();
		} 
		String retVal = this.data;
		System.out.println(th.getName() + "가 읽은 데이터 : " + retVal);
		
		this.data = null;
		notify();
		return retVal;
	}

	public synchronized void setData(String data) throws InterruptedException {
		if (this.data != null) {
			wait();
		} 
		this.data = data;
		System.out.println("Creator Thread가 저장한 데이터 : " + data);
		
		notify();
		
	}
	
	
}
