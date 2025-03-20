package week03;

public class OneOperand1 {

	public static void main(String[] args) {
		//단항 연산자 : +, -, ++, --, !, ~(tild)
		int iValue1 = 100;
		int iValue2 = -100;
		double dValue1 = 3.14;
		double dValue2 = -10.5;
		
		int result1 = +iValue1;
		int result2 = -iValue2;
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		
		short sValue = 100;
		//int 보다 작은 데이터타입의 연산 결과는 int
		int sResult = -sValue;
		System.out.println("sValue = " + sValue);
		
		byte bValue = -100;
		int bResult = -bValue;
		
		long lValue = 100;
		long lResult = -lValue;

	}

}
