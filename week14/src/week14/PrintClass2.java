package week14;

public class PrintClass2<T> {
	public void printVal(T val) {
		System.out.println("value = " + val);
	}
	public static void main(String[] args) {
		
		PrintClass2<String> pc1 = new PrintClass2<String>();
		PrintClass2<Integer> pc2 = new PrintClass2<Integer>();
		PrintClass2<Boolean> pc3 = new PrintClass2<Boolean>();
		pc3.printVal(false);
		pc1.printVal("hello");
		pc2.printVal(321);
	}
}

class PrintClass21 {
	public <T> void printVal(T val) {
		System.out.println("value = " + val);
	}
}
