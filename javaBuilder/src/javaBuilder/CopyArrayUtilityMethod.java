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
public class CopyArrayUtilityMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int list1[] = { 1, 2, 3, 4, 5 };
		int list2[] = { 9, 8, 7, 6, 5 };

		list2 = list1;

		System.out.println(Arrays.toString(list1));
		System.out.println(Arrays.toString(list2));
		System.out.println("\n*******************copying array using loop***********************\n");

		int sourceArray[] = { 1, 2, 3, 4, 5 };
		int targetArray[] = new int[sourceArray.length];
		
		for(int i=0; i<sourceArray.length; i++) {
			targetArray[i] = sourceArray[i];
		}
		System.out.println(Arrays.toString(sourceArray));
		System.out.println(Arrays.toString(targetArray));
	}

}
