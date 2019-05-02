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
public class FindingGCD {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		// Create a Scanner object
		Scanner input1 = new Scanner(System.in);
		System.out.println("Please enter first positive integer");
		int integer1 = input1.nextInt();//user input result
		
		System.out.println("Please enter second positive integer");
		int integer2 = input1.nextInt();
		int gcd=1;
		
		
		for(int i =2; i<integer1 && i<integer2; i++) {
			if(integer1 % i==0 && integer2% i==0) {
				gcd=i;
				
			}
			
		}System.out.println("The GCD of the two numbers " + integer1 + " and "+ integer2 + " = " +gcd);
	
	}

}
