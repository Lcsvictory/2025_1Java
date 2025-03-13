package week02;

public class PersonInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "123";
		int age = 123;
		double height = 123.3;
		char sex = 'M';
		boolean isStudent = true;
		
		//Object[] vars = {name, age, height, sex, isStudent};
		
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.printf("키: %.1fcm\n", height);
		System.out.printf("성별: %c\n",sex);
		System.out.println("학생 여부: " + isStudent);

	}

}
