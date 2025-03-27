package week04;

public class RandomDice {

	public static void main(String[] args) {
		
		double num = Math.random(); //0~0.9999
		int diceNum = (int)(num * 6) + 1; //1~6
		System.out.println("랜덤 숫자 : " + num);
		System.out.println("주사위 값 : " + diceNum);
	}

}
