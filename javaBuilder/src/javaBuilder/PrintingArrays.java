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
public class PrintingArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,4,5};
		System.out.println("*******************First Method For Printing***********************\n");
		for(int element: arr) {
			System.out.print(element);
		}
		
		System.out.println("\n*******************Second Method For Printing***********************\n");
		for(int i = 0; i <arr.length; i++) {//printing those numbers
			System.out.println(arr[i]);
		}
		
		System.out.println("\n*******************Third Method For Printing***********************");
		
		System.out.println(Arrays.toString(arr));
		
		
		
	
	}

}
