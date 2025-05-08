package week10;

class AirLine {
	public void land() {
		System.out.println("착륙한다.");
	}
	public void fly() {
		System.out.println("flying.");
	}
	public void takeoff() {
		System.out.println("이륙한다.");
	}
}
public class AirCraft extends AirLine{
	@Override
	public void fly() {
		System.out.println("여객기 비행입니다.");
	}
	public static void main(String[] args) {
		AirCraft a1 = new AirCraft();
		a1.takeoff();
		a1.fly();
		a1.land();
				
	}
}
