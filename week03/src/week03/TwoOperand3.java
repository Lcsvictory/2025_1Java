package week03;

public class TwoOperand3 {

	public static void main(String[] args) {
		//비트 연산자 &(AND), |(OR), ^(XOR)
		byte num1 = 45;//0010 1101
		byte num2 = 25;//0001 1001
		int result = num1 & num2; // 0000 1001
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("result = " + result);
		
		//&연산
		System.out.printf("num1 =  %8s\n" , Integer.toBinaryString(num1));
		System.out.printf("num2 = 	%8s\n" , Integer.toBinaryString(num2));
		System.out.printf("result =%8s\n" , Integer.toBinaryString(result));
		
		//|연산
		int result2  = num1 | num2;
		System.out.printf("num1 =    %8s\n" , Integer.toBinaryString(num1));
		System.out.printf("num2 = 	  %8s\n" , Integer.toBinaryString(num2));
		System.out.printf("result2 = %8s\n" , Integer.toBinaryString(result2));
		System.out.println("result2 = " + result2);
		
		//^연산
		int result3  = num1 ^ num2;
		System.out.printf("num1 =    %8s\n" , Integer.toBinaryString(num1));
		System.out.printf("num2 = 	  %8s\n" , Integer.toBinaryString(num2));
		System.out.printf("result3 = %8s\n" , Integer.toBinaryString(result3));
		System.out.println("result3 = " + result3);		
	}

}
