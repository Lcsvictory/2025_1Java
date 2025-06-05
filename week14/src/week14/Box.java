package week14;

public class Box {
	private Object obj;

	public Object getObj() { return obj; }

	public void setObj(Object obj) { this.obj = obj; }
	
	public static void main(String[] args) {
		Box box = new Box();
		box.setObj("hello world!");
		System.out.println(box.getObj());
		String sVal = (String) box.getObj();
	}
}
