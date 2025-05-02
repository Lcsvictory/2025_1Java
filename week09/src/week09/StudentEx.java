package week09;

public class StudentEx {
	public static void main(String[] args) {
		Student st1 = new Student("홍길동", 78, 92, 88);
		
		System.out.printf("%s : 총점 %d점, 평균 %.1f점\n", st1.getName(), st1.getTotal(), st1.getAve());
	}
}
