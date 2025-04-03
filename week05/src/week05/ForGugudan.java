package week05;

import java.util.Scanner;

public class ForGugudan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("구구단 몇 단을 계산할까?");
		int dan = sc.nextInt();
		
		System.out.printf("구구단 %d단을 계산한다.\n", dan);
		
		
		for (int j = 1; j <= 9; j++) {
			System.out.printf("%d X %d = %2d\n", dan, j, dan*j);
		}
		
		sc.close();
	}
}
