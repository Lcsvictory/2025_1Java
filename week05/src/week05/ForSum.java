package week05;

public class ForSum {
	public static void main(String[] args) {
		
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.printf("1~100 까지의 누적합 : %d\n", sum);
	}
}
