package week12;

import java.util.Scanner;

public class SmartPhoneEx {
	
	
	public static void main(String[] args) {
		//BluetuthEarPhone buds = new BluetuthEarPhone("buds", "삼성");
		//BluetuthEarPhone tonFree = new BluetuthEarPhone("Ton Free", "LG");
		//BluetuthEarPhone airPods = new BluetuthEarPhone("AirPods", "apple");
		Scanner sc = new Scanner(System.in);
		
		SmartPhone sp = new SmartPhone();
		IEarPhone ep = null;
		
		System.out.println("** 스마트폰으로 음악 재생 **");
		
		while (true) {
			System.out.print("\n 연결할 이어폰선택 1.Buds 2.AirPods 3.TonFree 4.종료 >> ");
			int menu = sc.nextInt();	
			if (menu == 4) break;
			ep = switch (menu) {
			case 1 ->  new BluetuthEarPhone("buds", "삼성");
			case 2 -> new BluetuthEarPhone("AirPods", "apple");
			case 3 -> new BluetuthEarPhone("Ton Free", "LG");
			default -> null;
			};
			sp.musicOn(ep);
			sp.musicOff(ep);
		}

		
		sc.close();
	}
	
}
