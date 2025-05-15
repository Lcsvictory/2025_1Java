package week11;

public class ChildEx {
	public static void main(String[] args) {
		System.out.println(Parent.PI);
		Child c = new Child();
		System.out.println(c.field1);
		System.out.println("A : " + c.A);
		c.method1();
		c.method2(3);
		c.method3();
		
		Parent p = c;
		p.field1 = "Parent.field1";
		System.out.println(p.field1);
		p.method1();
		p.method2(3); //Child 클래스에서 재정의한 메소드다. 왜냐? Child객체를 promotion했으니까.
		
		
		Parent p1 = new Parent();
		p1.method2(20); //Parent 클래스에서 정의된 메소드다.
//		((Child)p).method3(); //method2 is override
//		System.out.println(((Child)p).field2);
//		
//		Parent p2 = new Parent();
//		Child c2 = (Child)p2;
		
	}
}
