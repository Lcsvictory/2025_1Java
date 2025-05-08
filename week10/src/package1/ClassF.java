package package1;

import week10.ClassD;

public class ClassF {
	public ClassF() {
		ClassD dd = new ClassD();
		
		dd.field1 = 30;
//		dd.field2 = 30; //default field 다른 패키지에서 접근불가
//		dd.field3 = 30; //private field 
		
		dd.method1();
//		dd.method2();   //default method
//		dd.method3();   //private method
	}
}
