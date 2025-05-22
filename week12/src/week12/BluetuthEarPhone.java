package week12;

public class BluetuthEarPhone implements IEarPhone{
	private String model;
	private String brand;
	
	
	public BluetuthEarPhone(String model, String brand) {
		this.model = model;
		this.brand = brand;
		System.out.println(brand + "의 " + model + " 이(가) 연결되었습니다.");
	}

	@Override
	public void play() {
		System.out.println(brand + "의 " + model + " 음악 재생중...");
	}

	@Override
	public void stop() {
		System.out.println(brand + "의 " + model + " 음악 중지합니다.");
		
	}

}
