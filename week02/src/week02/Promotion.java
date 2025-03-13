package week02;

public class Promotion {
	public static void main(String[] args) {
		//자동 형변환 Promotion
		byte bValue = 25;
		int iValue = bValue;
		System.out.println(iValue);
		
		char cValue = '뺧';
		iValue = cValue;
		System.out.println(iValue);
		
		long lValue = iValue;
		System.out.println(lValue);
		
		float fValue = iValue;
		System.out.println(fValue);
		
		double dValue = iValue;
		System.out.println(dValue);
	}
}
