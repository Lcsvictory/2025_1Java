package week05;

public class ForStrar {
	public static void main(String[] args) {
		int rand = (int)(Math.random() * 10) + 1;
		
		System.out.println("랜덤 숫자 : " + rand);
		System.out.printf("★ ".repeat(rand));
//		for (int i = 0; i < rand; i ++) {
//			System.out.printf("★ ");
//		}
		System.out.println();
 	}
}
