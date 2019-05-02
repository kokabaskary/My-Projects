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
public class StringReverseArray {

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

		String myText = "I see i and j in my dream";// original string
		char[] myChars = myText.toCharArray();// converting string to character array

//		System.out.println("The origional array is :" + Arrays.toString(myChars));// printing char array
//		System.out.println(myChars.length);// length of the character array

//		char[] reverseChar = reverse(myChars); // new array of character
//		System.out.println("The reversed array is :" + Arrays.toString(reverseChar));
//		System.out.println(reverseChar);
		
		System.out.println("/n***************Reverse Original*******************/n");
		
		
//		String[] arr = {"Red","Blue","White","Pink"};
//		
//		for(int i=0; i<args.length/2; i++) {
//			String temp = arr[i];
//			arr[i]= arr[arr.length-1-i];
//			arr[arr.length-1-i] = temp;
//			
//		}System.out.println(Arrays.toString(arr));
		
		reverseOriginal(myChars, myChars.length);

//		String reverseTextString = String.valueOf(reverseChar);//converting character array back to string
//		System.out.println("The reversed string is :" + reverseTextString);


		System.out.println("/n***************Reverse Original using string builder*******************/n");
		
		String string = "Reverse Me";
		StringBuilder sb = new StringBuilder(string);
//		for (int i = string.length()-1; i >=0; i--) {
//			sb.append(string.charAt(i));
//			
//			}
		
//		sb.setCharAt(2, 'm');
		sb.reverse();
	System.out.println(sb);
	}

}
