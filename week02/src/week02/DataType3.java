package week02;

public class DataType3 {
	public static void main(String[] args) {
		byte bData = 127; 				//1byte -128 ~ 127
		char cData = 90;				//char타입은 음수 없음.
		float fData = 3.14f; 			//실수 literal은 기본 double타입. 
										//f를 붙여서 float 변환.
		long lData = 10000000000L; 
										//int literal을 long에 대입하려고 하니 타입 미스매치. 
										//L을 붙여서 long타입으로 변환.
		boolean boolD = true;			//boolean타입은 true or false
		
		System.out.println("bData = " + bData);
		System.out.println("cData = " + cData);
		System.out.println("fData = " + fData);
		System.out.println("lData = " + lData);
		System.out.println("boolD = " + boolD);
	}
}
