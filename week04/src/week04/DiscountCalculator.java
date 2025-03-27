package week04;

import java.util.Scanner;

public class DiscountCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int price;
		int discountPer = 0;
		
		System.out.printf("상품 구매 가격 입력 >> ");
		price = sc.nextInt();
		
		sc.close();
		
		if (price < 0) {
			System.out.println("가격오류");
			return;
		}
		if (price >= 100000) {
			discountPer = 10;
		}else if (price >= 50000) {
			discountPer = 5;
		}
		
		System.out.println("원래 가격 : " + price + "원");
		System.out.println("할인율 : " + discountPer + "%");
		int dicountPrice = price * discountPer / 100;
		int total = price - dicountPrice;
		System.out.println("최종 가격 : " + total + "원");
	}
}
