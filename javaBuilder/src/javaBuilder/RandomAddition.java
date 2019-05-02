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
public class RandomAddition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random();
		
		
		// Obtain a number between [0 - 9].
		int num1 = rand.nextInt(10);
		int num2 = rand.nextInt(10);
		
		System.out.println("what is: "+ num1 +"+" + num2);
		
		// Create a Scanner object
		Scanner input1 = new Scanner(System.in);
		System.out.println("Please enter your answer");
		int result1 = input1.nextInt();//user input result
		int result2 = num1+num2; //result of original numbers
		
		if(result1==result2) {//comparing the two results
			System.out.println("Whooo!! your answer is Correct");
		}else {
			System.out.println("Sorry!!!Please try again");
		}
		
//		can be achieved using Math.random()function.
//		int num1= 0+(int)(Math.random()*10;
		

	}

}
