package week10;

public class SonicAirPlane extends AirPlane{
	
	private static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	int flyMode = NORMAL;
	
	private int soundSpeed;
	private int maxSpeed;
	
	@Override
	public void fly() {
		if (flyMode == NORMAL) {
			super.fly();
		}else {
			System.out.println("sonic flying");
		}
		
		
	}
	public void setFlyMode(int mode) {
		if (mode == NORMAL) {
			flyMode = NORMAL;
		} else if (mode == SUPERSONIC) {
			flyMode = SUPERSONIC;
		} else {
			return;
		}
	}
	
	public int getSoundSpeed() {return soundSpeed; }
	public void setSoundSpeed(int soundSpeed) {
		this.soundSpeed = soundSpeed;
	}
	
	public int getMaxSpeed() {return maxSpeed; }
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	
}
