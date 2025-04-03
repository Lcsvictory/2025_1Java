package week05;

import java.util.Scanner;

public class UpAndDown {
	public static void main(String[] args) {
		int rand = (int)(Math.random() * 100) + 1;// 1~ 100
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("숫자를 맞혀보세요. (1~100) >> ");
			int userInput;
			try {
				userInput = sc.nextInt();
			} catch (Exception e) {
				System.out.println("정수만 입력하세요.");
				break;
			}
			if (userInput > 100 || userInput < 0) {
				System.out.println("1~100사이의 숫자를 입력하세요.");
				continue;
			}
			
			
			
			if (userInput == rand) {
				System.out.println("정답입니다. 랜덤 숫자는 " + rand + "입니다.");
				break;
			} else if (userInput > rand) {
				System.out.println("숫자가 너무 큽니다.");
				continue;
			} else {
				System.out.println("숫자가 너무 작습니다.");
				continue;
			}
		}
		sc.close();
	}
}
