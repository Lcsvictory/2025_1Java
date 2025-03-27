package week04;

public class Switch1 {
	public static void main(String[] args) {
		char grade = 65;
		
		switch(grade) {
		case 65:
		case 97:
			System.out.println("A rank");
			break;
		case 65+1:
		case 97+1:
			System.out.println("B rank");
			break;
		default :
			System.out.println("CDEF rank");
			break;
			
		}
	}
}
