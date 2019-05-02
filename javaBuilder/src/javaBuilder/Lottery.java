package javaBuilder;

import java.util.Random;
import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();

		// Obtain a number between [10 - 99].
		int randomLottery = rand.nextInt(90)+10;//generating random number in range 10-99
		int userInput=0;
		
		
//		// Create a Scanner object
				Scanner input = new Scanner(System.in);
				
				//user input result
				
				while(!(userInput>=10 &&userInput<100)) {
					System.out.println("Please enter a 2 digit number:");
					
					try {
						userInput = input.nextInt();
					} catch (Exception e) {
						System.out.println("************Error: Must be a 2 digit number ************\n");
						input.nextLine(); // need this to reset Scanner token, otherwise infinite loop
						continue;
					}
				}
				
				
				int lastDigit = userInput%10;//using modulus to find the last digit 
				int firstDigit = userInput/10;//dividing the number by 10 to get the first digit
				
				int randomLastDigit= randomLottery%10;
				int randomFirstDigit = randomLottery/10;
				
				int reverseRandom = randomLastDigit*10 + randomFirstDigit;//reversing the digits
				
				
				
				System.out.println("Your number is " + firstDigit + lastDigit);
				System.out.println("The Lucky number is : "+randomLottery);
				if(randomLottery==userInput) {
					System.out.println("Congrlautions!!!!! You Won $10,000");
				}else if(randomFirstDigit==lastDigit && randomLastDigit==firstDigit){
//					if(reverseRandom==userInput) {another approach}
					System.out.println("Congrlautions!!!!! You Won $3,000");
				}else if(randomFirstDigit==firstDigit || randomLastDigit==lastDigit || 
						randomLastDigit==firstDigit || randomFirstDigit==randomLastDigit) {
					System.out.println("Congrlautions!!!!! You Won $1,000");
				}else if(!(randomLottery==userInput)) {
					System.out.println("Sorry.....Better Luck next time");
				}

	}

}
