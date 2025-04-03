package week05;

public class ContinueEx1 {
	public static void main(String[] args) {
		int oddsum = 0;
		int evensum = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				oddsum += i;
				continue;
			}
			evensum += i;
//			System.out.println(i);
		}
		System.out.println("1~100까지 짝수들의 합 : " + evensum);
		System.out.println("1~100까지 홀수들의 합 : " + oddsum);
	}
}
