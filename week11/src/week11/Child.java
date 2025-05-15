package week11;

public class Child extends Parent{
	public int A;
	String field2;
	
	public Child() {
		super();
		System.out.println("Child() called");
	}
	
	public void method3() {
		System.out.println("Child.method3() called");
	}
	
	@Override
	public void method2(int a) {
		System.out.println("Child.method2() called");
	}
}
