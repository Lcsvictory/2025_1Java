package week11;

public class AnimalEx {
	private static void animalSound(Animal a) {
		a.sound();
		if (a instanceof Dog) {
			System.out.println("강아지다");
			Dog dog = (Dog)a;
			dog.dogLife();
		} else if (a instanceof Cat) {
			System.out.println("고양이다");
			Cat cat = (Cat)a;
			cat.catLife();
		} else {
			System.out.println("동물은 맞지만 개, 고양이는 아니다.");
		}
	}
	
	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		cat.sound();
		dog.sound();
		
		System.out.println("-------------------");
		
		Animal animal = cat;
		animal.sound();
		
		animal = dog;
		animal.sound();
		System.out.println("-------------------");
		animalSound(cat);
		System.out.println("-------------------");
		animalSound(dog);
	}
}
