package week07;

public class CarEx {
	public static void main(String[] args) {
		
		Car myCar = new Car();
		System.out.printf("제조회사 : %s\n", myCar.company);
		System.out.printf("모델명 : %s\n", myCar.model);
		System.out.printf("색상 : %s\n", myCar.color);
		System.out.printf("최고속도 : %s\n", myCar.maxSpeed);
		System.out.printf("현재속도 : %s\n", myCar.speed);
		
		myCar.speed = 100;
		System.out.printf("현재속도 : %s\n", myCar.speed);
		
		
		Car yourCar = new Car();
		System.out.printf("제조회사 : %s\n", yourCar.company);
		System.out.printf("모델명 : %s\n", yourCar.model);
		System.out.printf("색상 : %s\n", yourCar.color);
		System.out.printf("최고속도 : %s\n", yourCar.maxSpeed);
		System.out.printf("현재속도 : %s\n", yourCar.speed);
		
		
		System.out.println("-------------------");
		Car myCar2 = new Car("아반떼","white",220);
		System.out.printf("제조회사 : %s\n", myCar2.company);
		System.out.printf("모델명 : %s\n", myCar2.model);
		System.out.printf("색상 : %s\n", myCar2.color);
		System.out.printf("최고속도 : %s\n", myCar2.maxSpeed);
		System.out.printf("현재속도 : %s\n", myCar2.speed);
		
		
		System.out.println("-------------------");
		
		Car yourCar2 = new Car("소나타","silver",250);
		System.out.printf("제조회사 : %s\n", yourCar2.company);
		System.out.printf("모델명 : %s\n", yourCar2.model);
		System.out.printf("색상 : %s\n", yourCar2.color);
		System.out.printf("최고속도 : %s\n", yourCar2.maxSpeed);
		System.out.printf("현재속도 : %s\n", yourCar2.speed);
		
	}
}
