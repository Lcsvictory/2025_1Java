package week11;

public class Taxi extends Vehicle{
	@Override
	public void run() {
		System.out.println("택시가 달린다");
	}
	
	@Override
	public String toString() {
		return "Taxi";
	}
}
