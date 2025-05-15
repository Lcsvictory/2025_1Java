package week11;

public class Bus extends Vehicle{
	@Override
	public void run() {
		System.out.println("버스가 달란다");
	}
	@Override
	public String toString() {
		return "Bus";
	}
}
