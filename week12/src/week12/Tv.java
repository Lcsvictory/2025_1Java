package week12;

public class Tv implements IRemoteControl{
	private String brand;
	private String model;
	private int volume = 0;

	public Tv(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}
	
	@Override
	public void metaData() {
		System.out.println("this Tv is " + brand + " " + model + ".");
	}

	@Override
	public void turnOn() {
		System.out.println("Tv is turn on.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV is turn off.");
	}

	@Override
	public void setVolume(int vol) {
		if (vol < MIN_VALUE) {
			System.out.println("0보다 작아질 수 없어요");
			this.volume = MIN_VALUE;
		} else if (vol > MAX_VALUE) {
			System.out.println("10보다 크면 안되요");
			this.volume = MAX_VALUE;
		}
		this.volume = vol;
		System.out.println("현재 볼륨 : " + volume);
	}
	
}
