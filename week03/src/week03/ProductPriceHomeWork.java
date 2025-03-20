package week03;

public class ProductPriceHomeWork {

	public static void main(String[] args) {
		int milk = 4500; int milkCnt = 1;
		int carrot = 1000; int carrotCnt = 3;
		int snack = 1500; int snackCnt = 2;
		double discountPer = 10;
		//야채품목제외 할인율 25%
		
		int total = (milk * milkCnt) + (carrot*carrotCnt) + (snack*snackCnt); 
		System.out.printf("할인 전 상품 가격 %d원\n", total);
		
		double discountPrice = (total * discountPer) / 100;
		System.out.printf("할인 금액 : %.1f원\n", discountPrice);
		
		double finalTotal = total - discountPrice;
		System.out.printf("최종 결제 금액 : %.1f원\n", finalTotal);
		
		
		
		
		
	}

}
