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
public class InitializingArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int[5];
		Scanner scan = new Scanner(System.in);//if you want to take 5 numbers from usser and store in an array
		for(int i=0; i<5; i++) {
			System.out.print("Enter number " + (i+1)+ ": ");
			arr[i]= scan.nextInt();//taking user input
		}
		for(int i = 0; i <5; i++) {//printing those numbers
			System.out.println("Number " + (i+1) + " : " + arr[i]);
		}
		
		
		
	
	}

}
