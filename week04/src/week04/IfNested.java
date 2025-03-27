package week04;

public class IfNested {
	public static void main(String[] args) {
		int score = (int) (Math.random() * 100); // 0~0.999 * 100 = 0~99.99
		String grade;
		
		if (score >= 90) {
			if (score > 95) {
				grade = "A+";
			}else if (score > 93) {
				grade = "A0";
			}else {
				grade = "A-";
			}
		} else {
			grade = "B";
		}
		
		System.out.printf("점수 : %d, 등급 : %s\n", score, grade);
	}
}
