package week07;

public class CarEx2 {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.printInfo();
		
		
		Car c2 = new Car("포니");
		c2.printInfo();
		
		Car c3 = new Car("소나타", "blue");
		c3.printInfo();
		
		Car c4 = new Car("아이오닉5", "silver", 400);
		c4.printInfo();
		
	}
}
