package week05;

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		int input = 0;
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("점수 입력 >> ");
			try {
				input = sc.nextInt();
			} catch (Exception e) {
				System.out.println("정수만 입력하세요.");
				break;
			}
			
			if (input < 0) {
				break;
			}
			if (input > 100) {
				System.out.println("100점이 최고점수임.");
				continue;
			}
			System.out.println();
			String grade = switch (input/10) {
			case 10, 9 -> "A";
			case 8 -> "B";
			case 7 -> "C";
			case 6 -> "D";
			default -> "F";
			};
			System.out.printf("SCORE            GRADE\n");
			System.out.println("=".repeat(24));
			System.out.printf("  %d               %s\n", input, grade);
			System.out.println();
		}
		sc.close();
		
		System.out.println("프로그램 종료");
	}
}
