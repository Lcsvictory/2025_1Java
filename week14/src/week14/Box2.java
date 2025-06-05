package week14;

public class Box2<T> {
	private T t;
	
	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public static void main(String[] args) {
		Box2<String> box20 = new Box2<>();
		box20.setT("im good");
		System.out.println(box20.getT().getClass());
		
		Box2<Double> box21 = new Box2<>();
		box21.setT(9.7);
		System.out.println(box21.getT().getClass());
	}
}
