package week12;

public class VolumeEx {
	public static void main(String[] args) {
		IVolume vol1 = new IVolume() {
			
			@Override
			public void volumeUp(int level) {
				System.out.println("볼륨을 " + level + "만큼 올립니다.");
			}
			
			@Override
			public void volumeDown(int level) {
				System.out.println("볼륨을 " + level + "만큼 내립니다.");
			}
		};
		vol1.volumeUp(92);
		vol1.volumeDown(1);
	}
}
