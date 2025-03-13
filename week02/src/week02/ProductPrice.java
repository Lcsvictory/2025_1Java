package week02;

public class ProductPrice {
	public static void main(String[] args) {
		//String product = "과자";
		int count = 7;
		int total = 5700;
		
		System.out.printf("구매 수량 : %d개\n", count);
		System.out.printf("총 구매 금액 : %d원\n", total);
		System.out.printf("상품 단가 : %.1f원\n", (double)total/count);
	}
}
