package animalInheritance;

public class Dog extends Animal {
	
	
	String name;
	boolean isTrained;
	
	public Dog(int numberOfLegs, boolean isPet,String name, boolean isTrained) {
		super(numberOfLegs, isPet);//super constructor from super class Animal
		this.name = name;
		this.isTrained= isTrained;
	}
	void walk() {
		System.out.println("Sub-Class :Dog only can walk forward...");
	}

//	void sound() {//method overwritten of Animal class
//		System.out.println("Sub-Class: Since I am an animal, I can make sound! Dog barks");
//	}
//	
	
}
