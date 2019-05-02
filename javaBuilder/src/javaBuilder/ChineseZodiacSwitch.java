package javaBuilder;

import java.util.Scanner;

public class ChineseZodiacSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your birth year:");
		int year = input.nextInt();
		int animal= year%12;
	
	
		
		switch (animal) {
		case 0:
			
			System.out.println("You were born in the year of  Monkey:");
			break;
		case 1:
			System.out.println("You were born in the year of  Rooster:");
			break;
		case 2:
			System.out.println("You were born in the year of  Dog:");
			break;
		case 3:
			System.out.println("You were born in the year of  Pig:");
			break;
		case 4:
			System.out.println("You were born in the year of  Rat:");
			break;
		case 5:
			System.out.println("You were born in the year of  Ox:");
			break;
		case 6:
			System.out.println("You were born in the year of  Tiger:");
			break;
		case 7:
			System.out.println("You were born in the year of  Rabbit:");
			break;
		case 8:
			System.out.println("You were born in the year of  Dragon:");
			break;
		case 9:
			System.out.println("You were born in the year of  Snake:");
			break;
		case 10:
			System.out.println("You were born in the year of  Horse:");
			break;
		case 11:
			System.out.println("You were born in the year of  Sheep:");
			break;
		
		}
		

	}

}
