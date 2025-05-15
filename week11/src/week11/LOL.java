package week11;

public class LOL extends Game{

	public LOL(String title, String version) {
		super(title, version);
	}

	@Override
	public void Desc() {
		System.out.println("LOL은 5vs5 전략게임입니다.");
	}
	
}
