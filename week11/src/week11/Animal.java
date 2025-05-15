package week11;

public abstract class Animal {
	public String kind;
	
	protected Animal(String kind) {
		this.kind = kind;
		System.out.println("Animal() 호출됨");
	}
	public void breathe() {
		System.out.println("breathing");
	}
	
	public abstract void sound();
}
