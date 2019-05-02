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
public class NestedLoops {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your number");
		int userInput = input.nextInt();//user input result
		int mul= 1;
		
	 for(int i = 1; i<=userInput; ++i) {
		 
		 for (int j = 1; j <= 10; ++j) {
			 
			 mul = i*j;
			 System.out.println("Multiplication table  " + i + "*" +j + " = "+ mul);
		}	
		 
		 System.out.println("=============================");

		 
	 }	 


	}}
