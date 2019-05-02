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
public class AdvanceMathTool {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random();
		
		
		
		// Obtain a number between [0 - 9].
		
		int num3 = rand.nextInt(10);
		
		
		
		
		int problems= 0;
		int rightAnswers= 0;
		
		while(problems<5) {
			int num1 = rand.nextInt(10);
			int num2 = rand.nextInt(10);
			int result = num1-num2;
			
			Scanner input = new Scanner(System.in);
			System.out.println("What is the result of " + num1+ " - " + num2);
			System.out.println("Please enter your answer");
			int  userAnswer = input.nextInt();//user input result

			problems++;
			if(userAnswer==result) {
				rightAnswers++;
			}
			
		}System.out.println("Your correct answers are :" +rightAnswers);
		
		
		// Create a Scanner object
				
		
			
	
		
	

	}}
