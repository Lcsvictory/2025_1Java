package week14;

public class PrintClass1 {
	public void printVal(int val) {
		System.out.println("value = " + val);
	}
	public void printVal(String val) {
		System.out.println("value = " + val);
	}
	public void printVal(boolean val) {
		System.out.println("value = " + val);
	}
	public static void main(String[] args) {
		PrintClass1 pc1 = new PrintClass1();
		pc1.printVal(false);
		pc1.printVal("hello");
		pc1.printVal(321);
	}
}
