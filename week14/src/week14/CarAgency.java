package week14;

public class CarAgency<T> implements IRentable<Car> {

	public void inClassGeneric(T val) {
		System.out.println("T 타입은 = " + val.getClass());
	}
	
	@Override
	public Car rent() {
		return new Car();
	}
	public static void main(String[] args) {
		CarAgency<Boolean> ca1 = new CarAgency<Boolean>();
		ca1.inClassGeneric(false);
		System.out.println(ca1.rent());
	}
}
