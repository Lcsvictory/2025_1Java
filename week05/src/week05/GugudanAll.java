package week05;

public class GugudanAll {
	public static void main(String[] args) {
		
		System.out.println("=".repeat(12));
		for (int i = 2; i <= 9; i++) {
			System.out.printf("구구단 : %d단\n",i);
			System.out.println("=".repeat(12));
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d x %d = %2d\n", i, j, i*j);
			}
			System.out.println("=".repeat(12));
		}
		System.out.println("공백은 포함되는가?" + "포함되지 않는다.");
	}
}
