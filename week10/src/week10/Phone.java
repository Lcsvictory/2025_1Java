package week10;

public class Phone {
	private String model;
	private String color;
	
	public String getModel() {
		return model;
	}
	public String getColor() {
		return color;
	}
	
	//constructor
	public Phone() {
		this("iPhone8", "red");
	}
	
	//constructor
	public Phone(String model, String color) {
		this.model = model;
		this.color = color; 
		System.out.println("Phone() 생성자 호출됨.");
	}
	
	public void bell() {
		System.out.println("벨이 울립니다.");
	}
	public void sendVoice(String msg) {
		System.out.println("나 : " + msg);
	}
	public void recvVoice(String msg) {
		System.out.println("상대 : " + msg);
	}
	public void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
	
}

