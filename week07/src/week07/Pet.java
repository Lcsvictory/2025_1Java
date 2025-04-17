package week07;

public class Pet {
	
	public String name;
	public String type;
	public int age;
	public String color;
	
	public Pet() {
		this("바둑이", "개", 0, "미정");
	}
	
	public Pet(String name, String type) {
		this(name, type, 0, "미정");
	}
	
	public Pet(String name, String type, int age, String color) {
		this.name = name;
		this.type = type;
		this.age = age;
		this.color = color;
	}
	
	public void printInfo() {
		System.out.printf("이름 : %s\n", this.name);
		System.out.printf("종류 : %s\n", this.type);
		System.out.printf("나이 : %d\n", this.age);
	}
	
	@Override
	public String toString() {
		return "이름 : "+this.name + "\n종류 : " 
					+ this.type + "\n나이 : " 
					+ this.age + "\n색상 : " 
					+ this.color + "\n"; 
	}
	
}
