package animalInheritance;

import javax.sound.midi.Soundbank;

public class Animal {
	
	//class variables
	int numberOfLegs;
	boolean isPet;
	 
	public Animal(int numberOfLegs, boolean isPet) {// creating constructor
		this.numberOfLegs = numberOfLegs;
		this.isPet = isPet;
	}//end of constructor
	
	private static void sound() {
		System.out.println("Super: Since I am an animal, I can make sound!");
	}
	
	public void getsound() {
		sound();
		
	}
	
	void gotLife() {
		System.out.println("Super: Since I am an  animal, I live!");
	}

}
