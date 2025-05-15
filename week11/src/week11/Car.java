package week11;

public class Car {
	public Tire tire;
	
	public Car() {
		tire = new Tire();
	}
	public void run() {
		System.out.println("Car.run() called");
		tire.roll();
	}
	
}
