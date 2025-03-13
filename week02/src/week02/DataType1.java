package week02;

public class DataType1 {
	public static void main(String[] args) {
		//실수 데이터 타입
		float fValue 	= 3.14f;
		double dValue	= 3.14;
		
		System.out.printf("fValue = %.2f\ndvalue = %.2f\n", fValue, dValue);
		
		fValue = 0.123456789012345679f;
		dValue = 0.123456789012345679;
		
		System.out.printf("fValue = %s\ndvalue = %s\n", fValue, dValue);
		
		int iData = 4500000;
		float fData = 3e7f; //0.0007
		double dData1 = 3e7; // 30000000
		double dData2 = 3e-7; //0.0000003
		                               
		System.out.printf("iData = %d\n", iData);        
		System.out.printf("fData = %f\n", fData);        
		System.out.printf("dData1 = %f\n", dData1);      
		System.out.printf("dData2 = %f\n", dData2);      
		System.out.println();                            
		System.out.printf("fData = %.4f\n", fData);      
		System.out.printf("dData1 = %.2f\n", dData1);    
		System.out.printf("dData2 = %10.8f\n", dData2);  
	}                                                    
}
