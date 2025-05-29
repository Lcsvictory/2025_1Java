package week13;

public class RamenEx {
	public static void main(String[] args) {
		Ramen user1 = new Ramen("길동", "진");
		Ramen user2 = new Ramen("율곡이이", "신");
		Ramen user3 = new Ramen("세종", "열");
		
		user1.start();
		user2.start();
		user3.start();
	}
}