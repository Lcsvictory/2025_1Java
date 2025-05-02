package week03;

public class OneOperand2 {
	public static void main(String[] args) {
		//단항 연산자 : ++, -- (증감 연산자)
		int x = 10;
		int y = 10;
		int z;
		System.out.println("x = " + x); // 10
		System.out.printf("++x = %d\n", ++x);//전위연산 11
		System.out.printf("x++ = %d\n", x++);//후위연산 11
		
		System.out.println("x = " + x); // 12
		
		z = x++; //12
		System.out.println("z = " +z);//12
		System.out.println("x = " + x);//13
		
		z = x++ + y--; //13 + 10 = 23
		System.out.println("z = " +z);//23
		System.out.println("x = " + x);//14
		System.out.println("y = " + y);//9
		
	}
}
