package week10;

public class Car {
	
	private String company;
	private String mode;
	private String color;
	private int    maxSpeed;
	
	public Car() {
		
	}
	@Override
	public String toString() {
		return company + " " + mode;
	}
	
	public String getCompany() { return company; }
	public void setCompany(String company) {
		this.company = company;
	}

	public String getMode() { return mode; }
	public void setMode(String mode) {
		this.mode = mode;
	}

    public String getColor() { return color; }
    public void setColor(String color) {
		this.color = color;
	}

	public int getMaxSpeed() { return maxSpeed; }
	public boolean setMaxSpeed(int maxSpeed) {
		if (maxSpeed < 0 || maxSpeed > 350) {
			return false;
		}
		this.maxSpeed = maxSpeed;
		return true;
	}



	
}
