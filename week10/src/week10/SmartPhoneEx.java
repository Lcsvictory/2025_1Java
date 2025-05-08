package week10;

public class SmartPhoneEx {
	public static void main(String[] args) {
		SmartPhone s1 = new SmartPhone("갤럭시", "black");
		
		System.out.println(s1.getModel());
		System.out.println(s1.getColor());
		System.out.println(s1.isWifi());
		
		s1.bell();
		s1.sendVoice("hello");
		s1.recvVoice("how are you");
		s1.hangUp();
	}
}
