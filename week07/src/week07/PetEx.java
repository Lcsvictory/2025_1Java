package week07;

public class PetEx {
	public static void main(String[] args) {
		Pet p1 = new Pet("초코", "고양이");
		System.out.println("<첫 번째 애완동물>");
		System.out.println(p1);
		
		Pet p2 = new Pet("구름", "강아지", 2, "흰색");
		System.out.println("<두 번째 애완동물>");
		System.out.println(p2);
	}
}
