package week12;

public interface IRemoteControl {
	public static final int MAX_VALUE = 10;
	public static final int MIN_VALUE = 0;
	
	public abstract void metaData();
	
	//전원을 켭니다
	public abstract void turnOn();
	//전원을 끕니다.
	public abstract void turnOff();
	//볼륨을 조절합니다.
	public abstract void setVolume(int vol);
	
	//볼륨을 음소거 합니다.
	public default void setMute(boolean isMute) {
		if (isMute) {
			setVolume(MIN_VALUE);
			System.out.println("음소거합니다.");
		} else {
			setVolume(5);
			System.out.println("음소거를 취소합니다.");
		}
	}
	
	public static void changeBattery() {
		System.out.println("건전지 교환!");
	}
	
	
}
