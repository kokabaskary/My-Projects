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
public class SummingAllElements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,4,5};
		
		int total = 0;
		for(int i = 0; i <arr.length; i++) {//printing those numbers
			total += arr[i];
			
		}
		System.out.println("The Total is :" + total);
		System.out.println(Arrays.toString(arr));
		
		System.out.println("\n*******************Over Writing the previous array***********************\n");
	
	for(int j = 0; j <arr.length; j++) {//printing those numbers
		
		arr[j]= total- arr[j];
	
	}
	
	System.out.println(Arrays.toString(arr));
}
}
