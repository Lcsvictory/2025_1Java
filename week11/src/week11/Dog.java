package week11;

public class Dog extends Animal{

	
	public Dog() {
		super("포유류");
		System.out.println("Dog() 호출됨");
	}

	@Override
	public void sound() {
		System.out.println("멍멍");
	}
	
	public void dogLife() {
		System.out.println("강아지의 평균수명은 15~20년");
	}

}
