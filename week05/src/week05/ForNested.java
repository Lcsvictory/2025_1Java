package week05;

public class ForNested {
	public static void main(String[] args) {
		
		int num = 1;
//		for (int i = 0; i < 3; i++) {
//			for (int j = i; j < 3; j++) {
//				System.out.println(num + "번"); // 6번
//				num++;
//			}
//		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < i; j++) {
				System.out.println(num + "번"); // 3번
				num++;
			}
		}
	}
}
