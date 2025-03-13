package week02;

public class Variable {

	public static void main(String[] args) {
		// 기본데이터타입
		// literal

		byte bData 	= 65;	//1byte
		char cData 	= 65;	//2byte
		short sData = 65;	//2byte
		int iData 	= 65;	//4byte
		long lData 	= 65;	//8byte
		float fData = 65.12f;//4byte
		double dData = 65.12; //실수리터럴의 기본 타입은 double. 8byte
		boolean boolData = true; //1byte
		
		
		String[] datas = new String[] {"b","c","s", "i", "l", "f", "d", "bool"};
		
		Object[] vars = {bData, cData, sData, iData, lData, fData, dData, boolData};
		
		for (int i = 0; i < datas.length; i++) {
			System.out.printf("%sData = %s\n", datas[i], vars[i]);
		}
		/*System.out.println("bData = " + bData);
		System.out.println("cData = " + cData);
		System.out.println("sData = " + sData);
		System.out.println("iData = " + iData);
		System.out.println("lData = " + lData);
		System.out.println("fData = " + fData);
		System.out.println("dData = " + dData);
		System.out.println("boolData = " + boolData);*/

	}

}
