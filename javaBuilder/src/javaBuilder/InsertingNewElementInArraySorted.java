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
public class InsertingNewElementInArraySorted {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter size of array");// Asking user for a array size
		int arrSize = input.nextInt();// user input

		// creating a new array of size one greater than the one provided by the user
		int[] userArr = new int[arrSize + 1];

		System.out.println("Please enter  sorted array elements");// Asking user for a array size

		for (int i = 0; i < arrSize; i++) {// creating array from user input
			userArr[i] = input.nextInt();

		}System.out.println("User array: " + Arrays.toString(userArr));


//		System.out.println("Please enter position of new elements");// Asking user for a position of new element
//		int newElementIndex = input.nextInt();// user input

		System.out.println("Please enter  new element");// Asking user for a position of new element
		int newElement = input.nextInt();// user input new element
		
		for(int i=0;i<arrSize;i++) {
			if(newElement>userArr[i] && newElement<userArr[i+1]) {
				int index =userArr[i+1]-1;
				
				 for(int j = userArr.length-1; j>index; j--) {

					 userArr[j] =userArr[j-1];
					 		}userArr[index] = newElement;
					 		System.out.println(Arrays.toString(userArr));
			}else {
				
			}
		}input.close();

			
			 
			 
			 
	}

	
	}

