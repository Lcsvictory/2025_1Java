package week10;

public class SonicAirPlaneEx {
	public static void main(String[] args) {
	SonicAirPlane sPlane = new SonicAirPlane();
	sPlane.takeoff();
	sPlane.fly();
	sPlane.land();
	
	sPlane.setFlyMode(2);
	sPlane.fly();
	}
}
