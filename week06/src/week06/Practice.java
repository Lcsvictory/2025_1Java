package week06;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		String names[] = {"홍길동", "이순신", "강감찬", "김구", "신사임당"};
		boolean isIn = false;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("찾을 학생을 입력하세요 >> ");
		String target = sc.nextLine().trim();
		for (String name : names) {
			if (target.equals(name)) {
				isIn = true;
				break;
			}
		}
		if (isIn) {
			System.out.printf("찾는 학생 %s은(는) 목록에 존재합니다.\n", target);
		} else
			System.out.printf("찾는 학생 %s은(는) 목록에 존재하지 않습니다.\n", target);
			
	}
}
