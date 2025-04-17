package week07;

public class Student {
	String name;
	int age;
	double height, weight;
	
	public Student() {
		System.out.println("기본 생성자 호출됨.");
	}
	
	public void Study(int time) {
		System.out.printf("%d시간동안 공부를 시작합니다.\n", time);
	}

	
	public String getAge() {
		return this.age + "살 입니다.";
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
}
