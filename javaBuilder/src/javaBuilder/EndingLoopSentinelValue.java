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
public class EndingLoopSentinelValue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// Create a Scanner object
		
		int result=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter an integer");
		int userInput = input.nextInt();//user input result
		while(userInput!=0) {
			result= result + userInput;
			System.out.println("Please enter an integer");
			userInput = input.nextInt();
			System.out.println("The sum at this point is :" + (userInput+result));
			
			
		}System.out.println("The sum of all the integers user input is :" + result);
		input.close();//Always close your resources
		
		
			
	
		
	

	}}
