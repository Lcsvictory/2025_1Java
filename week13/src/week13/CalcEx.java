package week13;

public class CalcEx {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		User1 u1 = new User1();
		User2 u2 = new User2();
		
		
		u1.setCalc(c1);
		u1.setName("User1");
		u1.start();
		
		u2.setCalc(c1);
		u2.setName("User2");
		u2.start();
		
	}
}
