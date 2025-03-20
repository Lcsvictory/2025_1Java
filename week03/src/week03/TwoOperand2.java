package week03;

public class TwoOperand2 {

	public static void main(String[] args) {
		// 이항 연산자 <, >, <= >= ==, !=
		// 논리 연산자 : &&(비트연산 &), ||(비트연산 |), !
		int charCode1 = 'A';//65
		if (charCode1 >= 65 && charCode1 <= 90) {
			System.out.println((char)charCode1 + " = 대문자");
		}
		
		int charCode2 = 'b';//98
		if (charCode2 >= 97 && charCode2 <= 122) {
			System.out.println((char)charCode2 + " = 소문자");
		}
		
		char charCode3 = '9';
		if ( !(charCode3 < 48) && !(charCode3 > 57) ) {
			System.out.println((char)charCode3 + " = 숫자");
		}
		
		int iValue = 6;
		if ((iValue % 2) == 0) {
			System.out.println(iValue + " = 짝수");
		} else {
			System.out.println(iValue + " = 홀수");
		}
		
		if ((iValue % 2) == 0 || (iValue % 3) == 0) {
			System.out.println(iValue + " = 2의배수 or 3의 배수");
		}
				
	}

}
