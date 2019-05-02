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
public class RandomShuffling {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int myList[] = new int[5];
		for(int i =myList.length-1; i>0; i--) {
			
			int j = (int)(Math.random()*(i+1));
			int temp = myList[i];
			myList[i] = myList[j];
			myList[j] = temp;
			System.out.println(j);
		}
		
		
		

	}
}


