package week14;

public class ToyAgency implements IRentable<Toy>{
	
	@Override
	public Toy rent() {
		return new Toy();
	}
}
