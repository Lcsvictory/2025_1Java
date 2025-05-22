package week12;

public class SmartTv implements IRemoteControl, ISearchable{
	private int volume;
	public SmartTv() {
		
	}

	@Override
	public void search(String url) {
		System.out.println(url + " 에 접속합니다.");
	}

	@Override
	public void metaData() {
		System.out.println("smartTv 입니다.");
	}

	@Override
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("전원을 끕니다.");
		
	}

	@Override
	public void setVolume(int vol) {
		this.volume = vol;
		System.out.println("볼륨을 " + vol + "으로 조절합니다.");
	}
	
}
