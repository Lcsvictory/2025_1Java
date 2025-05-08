package week10;

public class ClassA {
	//i) public      : 모든 접근을 허용
	//ii) protected : 같은 패키지(폴더)에 있는 객체와 상속관계의 객체들만 허용
	//iii) default    : 같은 패키지(폴더)에 있는 객체들만 허용
	//iv) private    : 현재 객체 내에서만 허용
	
	ClassA c1 = new ClassA(true);
	ClassA c2 = new ClassA(10);
	ClassA c3 = new ClassA("문자열");
	
	//접근제한자 생략하면 default제한자 적용
	ClassA(int data) {

	}
	
	public ClassA(boolean data) {

	}
	
	private ClassA(String data) {
		
	}
}
