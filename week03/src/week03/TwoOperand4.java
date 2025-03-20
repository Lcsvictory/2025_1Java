package week03;

public class TwoOperand4 {

	public static void main(String[] args) {
		//비트이동연산자 : >>, <<
		System.out.println("1 << 3 : " + (1 << 3));//0001 << 3 : 1000
		
		System.out.printf("1 =  %8s\n" , Integer.toBinaryString(1));
		System.out.printf("1 << 3 =%8s\n" , Integer.toBinaryString(1<<3));
		System.out.printf("8 = 	%8s\n" , Integer.toBinaryString(8));
		
		//-8 = 1111 1000 
		//
		System.out.println("-8 >> 3 : " + (-8 >> 3));
		System.out.printf("-8 =     %32s\n" , Integer.toBinaryString(-8));
		System.out.printf("-8 >> 3 =%32s\n" , Integer.toBinaryString(-8>>3));
		System.out.printf("-1 = 	 %32s\n" , Integer.toBinaryString(-1));
		
	}

}
