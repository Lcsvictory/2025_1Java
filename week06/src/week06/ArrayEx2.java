package week06;

import java.util.ArrayList;

public class ArrayEx2 {
	public static void main(String[] args) {
		int iArr[] = new int[10];
		
		System.out.println("=== 랜던 생성된 점수 배열 ===");
		for (int i = 0; i <iArr.length; i++ ) {
			iArr[i] = (int)(Math.random() * 100);
			System.out.printf("score[%d] = %d\n", i, iArr[i]);
		}
		int total = 0;
		double average = 0;
		for (int i : iArr) {
			total += i;
		}
		System.out.printf("총점 : %d\n", total);
		average = (double)total / iArr.length;
		System.out.printf("평균 : %.1f\n", average);
		
		//List<Integer> l1 = new ArrayList<Integer>();
		ArrayList<Integer> l1 = new ArrayList<>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(30);
		System.out.println(l1.size());
		l1.set(0, null);
		System.out.println(l1.remove(3));
		System.out.println(l1.size());
 	}
}
