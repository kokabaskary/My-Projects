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
public class ReverseStringWithSpaces {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\n*****************Reverse String with spaces*****************/n");
		
		String str="I Love Java";
		 int len = str.length();
	        char arr[] = str.toCharArray();
	        for(int i=0, j = len-1; i<=j; i++,j--){
	            if(arr[i] == ' ') i++;
	            if(arr[j] == ' ') j--;

	            char tmp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = tmp;

	        }
	        System.out.println(arr);
		
		
}}

