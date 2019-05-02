/**
 * 
 */
package javaBuilder;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import javax.security.auth.x500.X500Principal;

/**
 * @author kokab.askary
 *
 */
public class CopyArray {

	/**
	 * @param args
	 */
	
	
	public static int  myPrinter() {
		return 5;
	}
	
	public static int myAdd() {
		int x = 5;
		int y = 5;
		return x+y;
		
	}
	public static void myAddition() {
		int x = 5;
		int y = 5;
//		return x+y;  cannot have a return
		int sum = x+y;
		System.out.println(sum);
		
	}
	
	public static void myPrinting(int []x) {
		
		for(int i=0; i<x.length; i++) {
			System.out.print(x[i]);
		}
		System.out.println(Arrays.toString(x));
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			if(10==myAdd()) {
				System.out.println("you are right");
			}
			myAddition();
			
			int[] numbers = {5,10,15,20};
			int[] ages = {45,101,5,20};
			myPrinting(numbers);
			myPrinting(ages);
	}

}
