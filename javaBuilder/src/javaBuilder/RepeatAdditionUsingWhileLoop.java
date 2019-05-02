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
public class RepeatAdditionUsingWhileLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 5;
		int num2 = 5;
		int sum = 0;
		
		sum = num1 + num2;
		
		System.out.println("What is the  sum of the two numbers:"+ num1 +" + " + num2);
		
		// Create a Scanner object
				Scanner input = new Scanner(System.in);
				System.out.println("Please enter your answer");
				
				int result = input.nextInt();//user input result
				
				while(sum!=result) {
					System.out.println("Please enter correct answer");
					result = input.nextInt();//user input result
					}
				if(sum==result) {
					System.out.println("Congratulations your answer is correct");
				}
	}
}