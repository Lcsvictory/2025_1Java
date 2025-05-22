package week12;

public class RemoteControlEx {
	public static void main(String[] args) {
		Audio a1 = new Audio("kumsung", "K42S");
		Tv tv1 = new Tv("LG", "OLED");
		
		a1.turnOn();
		a1.metaData();
		a1.setVolume(7);
		a1.setMute(true);
		a1.setMute(false);
		a1.turnOff();
		
		System.out.println("-----------------------------------");
		
		tv1.turnOn();
		tv1.metaData();
		tv1.setVolume(9);
		tv1.setMute(true);
		tv1.setMute(false);
		tv1.turnOff();
		
		
		System.out.println("-----------------------------------");
		IRemoteControl.changeBattery();
		
		System.out.println("-----------------------------------");
		SmartTv sTv1 = new SmartTv();
		sTv1.turnOn();
		sTv1.setVolume(8);
		sTv1.setMute(true);
		sTv1.search("google.com");
		sTv1.setMute(false);
		sTv1.turnOff();
		System.out.println("-----------------------------------");
		
		System.out.println("리모컨 최대볼륨 " + IRemoteControl.MAX_VALUE);
		System.out.println("리모컨 최소볼륨 " + IRemoteControl.MIN_VALUE);
		
		System.out.println("-----------------------------------");
		
		IRemoteControl rc[] = {a1, tv1, sTv1}; 
		
		for (IRemoteControl r : rc) {
			r.turnOn();
			r.metaData();
			r.setVolume(6);
			r.setMute(true);
			r.setMute(false);
			r.turnOff();
			System.out.println("------");
		}
	}
}
