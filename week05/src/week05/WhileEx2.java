package week05;

import java.util.Scanner;

public class WhileEx2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.printf("더할 첫 번째 수를 입력 : ");
			int a = sc.nextInt();
			
			System.out.printf("더할 두 번째 수를 입력 : ");
			int b = sc.nextInt();
			
			System.out.printf("%d + %d = %d\n", a, b, a+b);
			
			System.out.print("계속 하시겠습니까? y/n : ");
			String stop = sc.next();
			if (stop == "y") {
				continue;
			}else {
				break;
			}
			
		}
	}
}
