package week11;

public class Cat extends Animal{

	
	public Cat() {
		super("포유류");
		System.out.println("Cat() 호출됨");
	}

	@Override
	public void sound() {
		System.out.println("야옹");
	}
	
	public void catLife() {
		System.out.println("고양이의 평균수명은 10~15년");
	}

}
