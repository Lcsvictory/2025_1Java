package week12;

public class Audio implements IRemoteControl{
	
	private String brand;
	private String model;
	private int volume = 0;
	private int memoryVol = 0;

	public Audio(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}
	
	@Override
	public void metaData() {
		System.out.println("this Audio is " + brand + " " + model + ".");
	}

	@Override
	public void turnOn() {
		System.out.println("audio is turn on.");
	}

	@Override
	public void turnOff() {
		System.out.println("audio is turn off.");
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
	@Override
	public void setMute(boolean isMute) {
		if (isMute) {
			this.memoryVol = this.volume;
			setVolume(MIN_VALUE);
			System.out.println("음소거합니다.");
		} else {
			setVolume(this.memoryVol);;
			this.memoryVol = 0;
			System.out.println("음소거 해제합니다.");
			
		}
	}
	
}
