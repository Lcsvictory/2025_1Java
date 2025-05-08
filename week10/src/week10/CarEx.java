package week10;

public class CarEx {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setCompany("Tesla");
		myCar.setMode("model Y");
		myCar.setColor("blue");
		
		System.out.println(myCar.toString());
	}
}
