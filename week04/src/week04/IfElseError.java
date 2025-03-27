package week04;

public class IfElseError {

	public static void main(String[] args) {
		int score = 85;
		char grade;
		
//		if (score >= 90) {
//			grade = 'A';
//		}
//		if (score >= 80) {
//			grade = 'B';
//		}
//		if (score >= 70) {
//			grade = 'C';
//		}
//		if (score >= 60) {
//			grade = 'D';
//		}else {
//			grade = 'F';
//		}
		if (score >= 90) {
			grade = 'A';
		}
		else if (score >= 80) {
			grade = 'B';
		}
		else if (score >= 70) {
			grade = 'C';
		}
		else if (score >= 60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		
		System.out.println(grade);
	}

}
