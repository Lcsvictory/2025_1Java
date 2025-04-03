package week05;

public class BreakEx1 {
	public static void main(String[] args) {
		int rand = -1;
		while (rand != 7) {
			rand = (int)(Math.random() * 10);
			System.out.printf("랜덤 숫자 : %d\n", rand);
		}
		System.out.println("프로그램 종료");
	}
}
