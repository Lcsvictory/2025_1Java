package week10;

public class Game {
	private String title;
	private String version;
	
	public Game(String title, String version) {
		this.title = title;
		this.version = version;
	}
	
	public void start() {
		System.out.println(this.title + "게임을 시작합니다.");
	}

	public String getTitle() {
		return title;
	}

	public String getVersion() {
		return version;
	}
	
	
}
