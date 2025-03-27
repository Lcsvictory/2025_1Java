package week04;

public class Switch2 {
	public static void main(String[] args) {
		char grade = 'B';
		
		switch(grade) {
		case 65, 97 -> System.out.println("A rank");
		case 65+1, 97+1 -> System.out.println("B rank");
		default -> { //중괄호도가능
			System.out.println("CDEF rank");
		}
		}
	}
}
