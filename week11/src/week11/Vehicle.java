package week11;

public class Vehicle {
	public Vehicle() {
		System.out.println("vehicle() 호출되었다.");
	}
	public void run() {
		System.out.println("차량이 달린다");
	}
	@Override
	public String toString() {
		return "Vehicle";
	}
}
