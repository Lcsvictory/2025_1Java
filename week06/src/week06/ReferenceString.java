package week06;

public class ReferenceString {
	public static void main(String[] args) {
		String ssn = "0001011234567";
		
		char gender = ssn.charAt(6);
//		System.out.println(gender % 2);
		switch(gender % 2) {
		case 1 -> System.out.println("남자"); 
		case 0 -> System.out.println("여자"); 
		default -> System.out.println("기타");
		}
		
		if (ssn.length() == 13) {
			System.out.println("올바른 주민번호");
		} else {
			System.out.println("잘못된 주민번호");
		}
		
		String oldstr = "자바 프로그래밍";
		String newstr = oldstr.replace("자바", "Java");
		System.out.println(oldstr);
		System.out.println(newstr);
		
		String firstNum = ssn.substring(0, 6);
		String lastNum = ssn.substring(6);
		
		System.out.println(firstNum);
		System.out.println(lastNum);
		
		int index = oldstr.indexOf("프로그래밍");
		System.out.println(index);
		
		boolean result = oldstr.contains("자바");
		System.out.println(result);
		
		String board = "1,자바,파이썬,C++,,C#,클래스";
		String[] tokens = board.split(",");
		for (String string : tokens) {
			System.out.printf("%s ", string);
		}
		
		
		
		
	}
}
