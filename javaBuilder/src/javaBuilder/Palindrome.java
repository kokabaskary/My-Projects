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
public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\n*****************Palindrome String*****************/n");

		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a palindrome string: ");
		String pali = input.next();


		String temp = "";
		int len = pali.length();

		String delimiter = ",";
		pali = pali.replaceAll("\\s*", "");
		String[] paliArr = pali.split(delimiter);

		System.out.println(Arrays.deepToString(paliArr));
		for(int j=len-1; j>=0; j--) {
			temp= temp + pali.charAt(j);
		}
			if(pali.equalsIgnoreCase(temp)) {
				System.out.println("The word is  palindrome :" + pali +" = "+temp);	
			}else {
				System.out.println("The word is not palindrome : " +pali +" != "+temp);
			}
	}
}

