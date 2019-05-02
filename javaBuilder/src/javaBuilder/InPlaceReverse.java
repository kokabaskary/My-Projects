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
public class InPlaceReverse {

	/**
	 * @param args
	 */
	//method to revsrse string new array
	public static char[] reverse(char[] list) {

		char[] result = new char[list.length];
		for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
			result[j] = list[i];
		}
		return result;

	}

	//method to reverse String in original array
	public static void reverseOriginal(char a[], int size) {

		int i, k;
		char temp;
		for (i = 0; i < size / 2; i++) {
			temp = a[i];
			a[i] = a[size - i - 1];
			a[size - i - 1] = temp;
		}
		/* printing the reversed array */
		System.out.println("Reversed array is: \n");
		for (k = 0; k < size; k++) {
			System.out.println(a[k]);

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//InPlace reverse
		int[] numArr = {10,20,30,35,40,50};
		Integer a=5;
		a=10;
		//Character
		//boolean
		
		System.out.println("/n***************Reverse Original*******************/n");
		
		String str = "I Love Java";
		
		System.out.println(str);
		
//		for(int i =0; i<str.length(); i++) {
//			char c = str.charAt(i);
//			str.charAt(str.length()-1-i)= 1T;
//			System.out.println(c);
//		}
//		
		String s1 = "Java Basics";
		System.out.println(s1.contains("Java"));
		System.out.println(s1.endsWith("a"));
		System.out.println(s1.equalsIgnoreCase("java basics"));
		System.out.println(s1.indexOf("J"));
//		System.out.println(s1.s("Java"));
		
		//frequency of each character e.g  a comes 3 times
		//reverse string with space intact scis aBavaJ
		//palindrome numbers and strings
		
		
		
		
		
//		String[] arr = {"Red","Blue","White","Pink"};
//		
//		for(int i=0; i<args.length/2; i++) {
//			String temp = arr[i];
//			arr[i]= arr[arr.length-1-i];
//			arr[arr.length-1-i] = temp;
//			
//		}System.out.println(Arrays.toString(arr));
		

}}
