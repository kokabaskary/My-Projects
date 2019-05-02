/**
 * 
 */
package javaBuilder;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author kokab.askary
 *
 */
public class ShiftingElements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("\n*****************Left Shift by one*****************/n");
		int myList[] = {10,9,7,3};
		int temp = myList[0];//retain the first element
		//shift elements left
		for(int i = 1; i<myList.length; i++) {
			myList[i-1] = myList[i];
			
		}
		//Move the first element to fill in the last position
		myList[myList.length-1] = temp;
		
		
		 System.out.println("\n*****************Right Shift by two*****************/n");
		 
		 int myList1[] = {10,9,7,3,6};
		 
		 System.out.println(Arrays.toString(myList1));
		 
		// Create a Scanner object
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter how many times you want to shift your array right");
			int shift = input.nextInt();
		
//		
		 for (int i = 1; i <= shift; i++) {//number of times we want to shift right
			 int tempRight = myList1[myList1.length-1];//shift first element right

			 for(int j = myList1.length-1; j>0; j--) {

			 myList1[j] =myList1[j-1];
			 		}
		myList1[0] = tempRight;

		System.out.println(Arrays.toString(myList1));
	}
}}


