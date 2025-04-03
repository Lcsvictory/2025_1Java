package week05;

public class ContinueEx2 {
	public static void main(String[] args) {
		int sum = 0;
		int sum3 = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum3 += i;
				continue;
			}
			sum += i;
		}
		System.out.println("1~100까지의 합(3의배수 제외) : " + sum);
		System.out.println("1~100까지의 합(3의배수 만) : " + sum3);
		System.out.println("1~100까지의 합 : " + (sum+sum3));
	}
}
