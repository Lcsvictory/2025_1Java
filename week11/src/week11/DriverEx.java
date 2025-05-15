package week11;

public class DriverEx {
	public static void main(String[] args) {
		Driver d = new Driver();
		Vehicle v = new Vehicle();
		
		d.drive(v);
		
		v = new Bus();
		d.drive(v);
		
		v = new Taxi();
		d.drive(v);
		
	}
}
