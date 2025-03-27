package week04;

import java.util.Scanner;

public class Switch4 {
	public static void main(String[] args) {
		String mobile = "iPhone";
		
		switch(mobile) {
		case "iPhone" -> System.out.println("Apple production");
		case "Galaxy" -> System.out.println("Samsung production");
		default -> System.out.println("etc...");
		}
		
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("점수를 입력하세요. 1 ~ 100 : ");
		int score = sc.nextInt();
		sc.close();

		String grade = switch(score/10) {
		case 10, 9 -> "A";
		case 8 -> "B";
		case 7 -> "C";
		case 6 -> "D";
		default -> "F";
		};
		System.out.println();
		System.out.println(grade + "학점");
	}
}
