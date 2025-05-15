package week11;

public class Driver {
	public Driver() {
		System.out.println("driver() 호출됨");
	}
	public void drive(Vehicle v) {
		StringBuilder s = new StringBuilder();
		s.append(v.toString());
		s.append("을(를) 운전합니다.");
		System.out.println(s);
		v.run();
	}
}
