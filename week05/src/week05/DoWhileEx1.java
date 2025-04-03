package week05;

import java.util.Scanner;

public class DoWhileEx1 {
	public static void main(String[] args) {
		String input = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("메시지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요");
		do {
			input = sc.nextLine();
			System.out.println(">>" + input);
		} while (!input.equals("q"));
		
		System.out.println("\n프로그램종료");
		sc.close();
		//string타입은 eaquls로 비교한다. ==으로 비교안된다.
		
		
	}
}
