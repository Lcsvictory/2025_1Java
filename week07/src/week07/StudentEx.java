package week07;
//import week07.Student;

public class StudentEx {
	public static void main(String[] args) {
		Student st1 = new Student();
		
		st1.Study(3);
		
		Student st2 = new Student();
		
		st2.setAge(24); 
		System.out.println(st2.getAge()); 
	}
}
