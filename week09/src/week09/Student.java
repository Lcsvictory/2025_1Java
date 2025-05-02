package week09;

public class Student {
	private String name;
	private int guk, eng, math;
	private static final int SUB_CNT = 3;
	
	public String getName() {
		return name;
	}
	
	public Student(String name, int guk, int eng, int math) {
		this.name = name;
		this.guk = guk;
		this.eng = eng;
		this.math = math;
	}
	public int getTotal() {
		return this.guk + this.eng + this.math;
	}
	
	public double getAve() {
		return getTotal() / SUB_CNT;
	}
	
	
}
