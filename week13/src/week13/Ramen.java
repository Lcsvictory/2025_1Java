package week13;

public class Ramen extends Thread{
	public String name = null;
	public String type = null;
	
	public Ramen(String name, String type) {
		this.name = name;
		this.type = type;
	}
	
	@Override
	public void run() {
		try {
			System.out.println("🍝 " + this.name + "씨가 " + this.type + " 라면을 끓이기 시작합니다.");
			System.out.println("물을 끓인다.");
			
			Thread.sleep(2000);
			System.out.println("🥣 " + this.type + " 라면을 넣는다");
			
			Thread.sleep(2000);
			System.out.println(this.type + " 라면을 먹는다!!");
		} catch (InterruptedException e) {}
	}
}
