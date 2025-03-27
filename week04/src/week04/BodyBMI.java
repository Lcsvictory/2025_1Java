package week04;

import java.util.Scanner;

public class BodyBMI {
	public static void main(String[] args) {
		int weight, height;
		double metaHeight;
		String name;
		double bmi;
		//BMI = weight / height**2
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("이름을 입력하세요 : ");
		name = sc.next();
		
		System.out.printf("키(cm)를 입력하세요 : ");
		height = sc.nextInt();
		
		System.out.printf("몸무게(kg)를 입력하세요 : ");
		weight = sc.nextInt();
		sc.close();
		
		System.out.println();
		System.out.printf("%s님의 키는 %dcm이고 몸무게는 %dkg입니다.\n", name, height, weight);
		
		metaHeight = height / 100.0;
		bmi = weight / (metaHeight*metaHeight);
		
		String result = "";
		if (bmi < 18.5) {
			result = "멸치";
		} else if (bmi >= 18.5 && bmi <= 22.9) {
			result = "정상";
		} else if (bmi <= 24.9) {
			result = "과체중";
		} else if (bmi <= 29.9) {
			result = "비만";
		} else {
			result = "고도비만";
		}
		
		System.out.printf("BMI지수는 %.2f이고 %s입니다.\n",bmi, result);
	}
}
