package week06;

public class Reference1 {
	public static void main(String[] args) {
		//참조타입 : 클래스
		// == 연산 : 주소 비교;
		// .equals() : 값 비교;
		
		//기본타입 : 구조체
		int iValue1 = 100;
		int iValue2 = 100;
		System.out.println("iValue1 == iValue2 : " + (iValue1 == iValue2 ? "참" : "거짓"));
		
		String sValue1 = "Java";
		String sValue2 = "Java";
		
		String sValue3 = "Jav";
		sValue3 = sValue3.concat("a");
		System.out.println(sValue3);
		
		System.out.println("sValue1 == sValue2 : " + (sValue1 == sValue2 ? "참" : "거짓"));
		
		String sValue4 = new String("Java");
		String sValue5 = new String("Java");
		System.out.println("sValue4 == sValue5 : " + (sValue4 == sValue5 ? "참" : "거짓"));
		System.out.println("sValue1 == sValue4 : " + (sValue1 == sValue4 ? "참" : "거짓"));
		
		
		String sValue6 = null;
//		System.out.println("sValue6.length() = " + sValue6.length());
//		NullPointerException 발생.
		
		sValue6 = "Java";
		System.out.printf("sValue6 = %s\n", sValue6);

		System.out.printf("sValue6 == sValue1 : %s\n", (sValue6 == sValue1 ? "참" : "거짓") );
		
		
		System.out.println((sValue4.equals(sValue5)) ? "두개는 값이 같다" : "두개는 값이 다르다");
		
	}
}
