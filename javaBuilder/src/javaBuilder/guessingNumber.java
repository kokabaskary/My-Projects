/**
 * 
 */
package javaBuilder;

import java.util.Random;
import java.util.Scanner;

/**
 * @author kokab.askary
 *
 */
public class guessingNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random();//importing random class
		// Obtain a number between [0 - 100].
		int luckyNumber = rand.nextInt(101);
		
		int userNumber=0; //Initializing  userInput
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your guess");//Prompting user for a number
		 userNumber = input.nextInt();//user input result
		 
		 if(userNumber<0 || userNumber>100) {
			 System.out.println("Please enter a number from 0 - 100");
			 userNumber = input.nextInt();
		 }else  {
			 while(userNumber!=luckyNumber) {//starting a while loop 
					if(userNumber>luckyNumber) {
						System.out.println("You entered a number too high");
						System.out.println("Please guess the number again");
						 userNumber = input.nextInt();
					}else if(userNumber<luckyNumber) {
						System.out.println("You entered a number too low");
						System.out.println("Please guess the number again");
						 userNumber = input.nextInt();
					}//end of second ifelse 
					
				}//end of while loop
			 System.out.println("Wow perfect match "+ userNumber +" = "+luckyNumber);
		 }
		
//		while(userNumber>=0 || userNumber<=100) {//starting a while loop 
//			if(userNumber==luckyNumber) {
//				System.out.println("Wow perfect match "+ userNumber +" = "+luckyNumber);
//				break;
//			}else if(userNumber>luckyNumber) {
//				System.out.println("You entered a number too high");
//				System.out.println("Please guess the number again");
//				 userNumber = input.nextInt();
//			}else if(userNumber<luckyNumber) {
//				System.out.println("You entered a number too low");
//				System.out.println("Please guess the number again");
//				 userNumber = input.nextInt();
//			}//end of second ifelse 
//		}//end of while loop
	}

}
