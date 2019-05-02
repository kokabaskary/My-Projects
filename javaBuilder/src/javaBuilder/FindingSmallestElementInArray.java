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
public class FindingSmallestElementInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		int[] arr = {-7,1,5,4,3,-3,0};
		int min =arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]< min) {
				min = arr[i];	
			}
		}
		
		System.out.println("The smallest element in the array is  :" + min);

	}

}
