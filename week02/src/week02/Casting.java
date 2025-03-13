package week02;

public class Casting {
	public static void main(String[] args) {
		int iData = 97; //4byte 2147483647
		char cData = (char)iData;
		System.out.println(cData);
		
		long lData = 500; //8byte
		iData = (int)lData;
		System.out.println(iData);
		
		double dData = 3.14; //8byte
		iData = (int)dData;
		System.out.println(iData);
		
		int iValue = 128;
		byte bValue = (byte)iValue;
		System.out.println(bValue);
		
		if (iValue >= Byte.MIN_VALUE && iValue <= Byte.MAX_VALUE) {
			bValue = (byte)iValue;
		} else {
			System.out.println("Casting가능한 변수의 범위를 벗어났습니다.");
		}
	}
}
