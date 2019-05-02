package animalInheritance;

public class AnimalRunner {

	public static void main(String[] args) {
		
		Animal a1 = new Animal(4, false);
//		a1.sound();
		a1.gotLife();
		
		//two ways to institate dog class
		 Dog dog1 = new Dog(4, true, "Biscuit", false);
		 System.out.println("Dog");
		 dog1.gotLife();
//		 dog1.sound();
		 dog1.getsound();
		 dog1.walk();
		 
		 Cat c2 = new Cat(4, true, true);
		 System.out.println("Cat:");
		 c2.catchMouse();
		 c2.getsound();
		 c2.gotLife();
	}

}
