package week10;

public class SmartPhone extends Phone{
	
	private boolean wifi;
	
	public SmartPhone(String model, String color) {
		super(model,color);
		System.out.println("SmartPhone() 호출됨.");
	}

	public boolean isWifi() {
		return wifi;
	}

	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("wifi 상태 변경");
	}
	
	public void internet() {
		System.out.println("인터넷 연결됨.");
	}

}
