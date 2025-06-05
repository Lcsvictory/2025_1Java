package week14;

public class RentEx {
	public static void main(String[] args) {
		HouseAgency house = new HouseAgency();
		House myHome = house.rent();
		myHome.turnOnLight();
		
		CarAgency<Car> car = new CarAgency<>();
		Car myCar = car.rent();
		myCar.run();
		car.inClassGeneric(myCar);
		
		ToyAgency toyA = new ToyAgency();
		Toy myToy = toyA.rent();
		myToy.play();
		
	}
}
