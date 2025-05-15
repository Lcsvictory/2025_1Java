package week11;

public class Parent {
	public static final int PI = 3;
	
	public int A;
	String field1;
	
	public Parent() {
		A = 213;
		System.out.println("Parent() called");
	}
	public void method1() {
		System.out.println("Parent.method1() called");
	}
	public void method2(int abc) {
		System.out.println("Parent.method2() called");
	}
}
