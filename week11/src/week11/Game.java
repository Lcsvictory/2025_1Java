package week11;

public abstract class Game {
	private String title;
	private String version;
	
	public Game(String title, String version) {
		this.title = title;
		this.version = version;
	}
	
	public void start() {
		StringBuilder s = new StringBuilder();
		s.append("제목 : ");
		s.append(title);
		s.append("\r\n");
		s.append("버전 : ");
		s.append(version);
		s.append("\r\n");
		s.append(title);
		s.append(" 게임을 시작합니다.");
		System.out.println(s);
		
	}
	
	public abstract void Desc();
	
	public String getTitle() {
		return title;
	}

	public String getVersion() {
		return version;
	}

}
