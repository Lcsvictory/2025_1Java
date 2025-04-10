package week06;

public class ArrayEx1 {
	public static void main(String[] args) {
		//배열선언
		int ids[] = new int [10];
		int[] ids1 = new int [10];
		
		//선언된 배열에 할당
		
		ids = new int[] {1,2,3,4};
		
		//배열 선언 및 초기화
		int n1[] = {1,2,3,4};
		int n2[] = new int[] {1,2,3,4};
		
		
		int score[] = {70,80,90,85,95};
		String pNames[] = {"java", "python", "C", "C++"};
		double[] dArray1;
		dArray1 = new double[] {0.1,0.2,0.3,0.4};
		
		int intArray[] = new int[5];
		System.out.println("intArray[0] = " + intArray[0]);
		
		double dArray[] = new double[5];
		System.out.println("dArray[0] = " + dArray[0]);
		
		String sArray[] = new String[5];
		System.out.println("sArray[0] = " + sArray[0]);
		
		
		
		sArray = pNames;
		System.out.println(sArray);
		
 	}
}
