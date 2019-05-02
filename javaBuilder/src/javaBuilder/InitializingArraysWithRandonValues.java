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
public class InitializingArraysWithRandonValues {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int length;
		Scanner scan = new Scanner(System.in);//if you want to take 5 numbers from usser and store in an array
		System.out.print("Enter the number of elements you want in your array: ");
		length = scan.nextInt();
		int arr[] = new int[length];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100);
		}
//			
		for(int i = 0; i <5; i++) {//printing those numbers
			System.out.println("Number " + (i+1) + " : " + arr[i]);
		}
		
		
		
	
	}

}
