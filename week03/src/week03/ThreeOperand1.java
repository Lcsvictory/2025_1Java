package week03;

public class ThreeOperand1 {

	public static void main(String[] args) {
		//삼항연산자 조건 ? true : false
		
		int num1 = 'b'; //98
		int num2 = 'B'; //66
		String result;
		
		result = num1 > num2 ? "num1 이 num2보다 크다." : "num2 가 num1보다 크다.";
		System.out.println(result);
		
		boolean bResult;
		bResult = num1 > num2 ? true : false;
		System.out.println(bResult);
		
		System.out.println();
		
		int score = 90;
		String result2;
		
		result2 = score >= 90 ? "A" : (score >= 80 ? "B" : "CDEF");
		System.out.println(result2);
		
		
	}

}
