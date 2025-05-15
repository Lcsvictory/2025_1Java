package week11;

public class GameEx {
	public static void main(String[] args) {
		Game game[] = {new LOL("lol", "1.6"), new Tetris("Tetris", "1.7"), new SuperMario("supermario", "2.1")};
		for (Game g : game) {
			g.start();
			g.Desc();
			System.out.println("========================");
		}
		
	}
}
