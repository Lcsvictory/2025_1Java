package week02;

public class DataType2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//char 음수 없다
		char cData1 = 'A';
		char cData2 = 65;
		char cData3 = '\u0041';
		System.out.println("cData1 = " + cData1);
		System.out.println("cData2 = " + cData2);
		System.out.println("cData3 = " + cData3);
		
		char cData4 = '가';
		char cData5 = 44032;
		char cData6 = '\uac00';
		System.out.println("cData4 = " + cData4);
		System.out.println("cData5 = " + cData5);
		System.out.println("cData6 = " + cData6);
		
		int cData7 = 'B';
		int cData8 = '하';
		int cData9 = '&';
		System.out.println("cData7 = " + cData7);
		System.out.println("cData8 = " + cData8);
		System.out.println("cData9 = " + cData9);
		
		//char타입의 값을 10진수로 알고싶다 => int에대입
		int iData10 = cData7 + cData9;
		char cData11 = (char)(cData7 + cData9);
		
		System.out.println("iData10 = " + iData10);
		System.out.println("cData11 = " + cData11);

	}

}
