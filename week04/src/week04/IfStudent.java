package week04;

import java.util.Scanner;

public class IfStudent {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("태어난 연도 입력 : ");
		
		int year = sc.nextInt();
//		String name = sc.next(); //String type
		
		sc.close();
		int age = 2025 - year;
//		System.out.println(age);
		String result;
		
		if (age > 26 && age < 8) { //27이상 || 7이하
			result = "학생이 아닙니다.";
		} else if (age >= 20) {
			result = "대학생";
		} else if(age >= 17) {
			result = "고등학생";
		} else if(age >= 14) {
			result = "중학생";
		} else  {
			result = "초등학생";
		} 
		System.out.println();
		System.out.println(result + ", your age : " + age);
		
	}
}
