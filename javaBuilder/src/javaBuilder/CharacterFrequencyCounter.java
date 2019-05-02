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
public class CharacterFrequencyCounter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\n*****************Character Frequency Counter*****************/n");

		String str = "Java Basics";
		char[] charArr = str.toCharArray();
		
		System.out.println((charArr));
		

		for (int i = 0; i < charArr.length; i++)
	    {
			int counter=0;
			for (int j = 0; j < charArr.length; j++) {
				if(j<i&&(charArr[j]==charArr[i])) {
					break;
				}
			 if(charArr[i]==charArr[j]){
				counter++;
				
			}
	    }

	     if(counter>0) {
	    	 System.out.println("The frequency of :" +charArr[i]+ " : is = "+counter);
	     }

}}}

