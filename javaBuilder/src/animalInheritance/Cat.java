package animalInheritance;

public class Cat extends Animal {
	
	
	boolean canClimb;
	

	public Cat(int numberOfLegs, boolean isPet, boolean canClimb) {//constructor
		super(numberOfLegs, isPet);
		this.canClimb = canClimb;
	}
//	
//	void sound() {//method overwritten of Animal class
//		System.out.println("Sub-Class: Since I am an animal, I can make sound! Cat Meow");
//	}
	
	void catchMouse() {
		System.out.println("\"Sub-Class : Cat can catch mice");
		
	}
	

}
