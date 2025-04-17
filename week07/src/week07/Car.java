package week07;

public class Car {
	public String company;
	public String model;
	public String color;
	public int	  maxSpeed;
	public int    speed;
	
	public Car() {
		System.out.println("기본 생성자 호출됨");
		this.company = "현대자동차";
		this.model = "그랜져";
		this.color = "black";
		this.maxSpeed = 350;
	}
	
	public Car(String model) {
		this(model, "black", 350);
		this.company = "현대자동차";
	}

	public Car(String model, String color) {
		this(model, color, 250);
		this.company = "현대자동차";
	}
	
	public Car(String model, String color, int maxSpeed){
		this.company = "현대자동차";
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
	/*public Car(String color, String model) {
		this.company = "현대자동차";
		this.model = model;
		this.color = color;
		this.maxSpeed = 250;
	}*/
	//파라미터의 위치만 바뀌는것은 오버로딩 되지 않는다.

	
	
	public void printInfo() {
		System.out.println("--------------------------------");
		System.out.printf("제조회사 : %s\n", this.company);
		System.out.printf("모델명 : %s\n", this.model);
		System.out.printf("색상 : %s\n", this.color);
		System.out.printf("최고속도 : %s\n", this.maxSpeed);
		System.out.printf("현재속도 : %s\n", this.speed);
	}
}
