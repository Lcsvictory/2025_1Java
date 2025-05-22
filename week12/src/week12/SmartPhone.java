package week12;

public class SmartPhone {
	

	private IEarPhone earPhone;
	
	public SmartPhone() {
		
	}
	
	public void musicOn(IEarPhone p) {
		p.play();
	}
	public void musicOff(IEarPhone p) {
		p.stop();
	}
	
	
	
}
