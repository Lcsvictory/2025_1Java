package week07;

public class KoreanEx {
	public static void main(String[] args) {
		
		Korean k1 = new Korean("홍길동", "123456-1234567", "010-1234-1234");
		System.out.printf("k1.nation : %s\n",k1.nation);
		System.out.printf("k1.name : %s\n",k1.name);
		System.out.printf("k1.ssn : %s\n",k1.ssn);
		System.out.printf("k1.phone : %s\n",k1.phone);
	}
}
