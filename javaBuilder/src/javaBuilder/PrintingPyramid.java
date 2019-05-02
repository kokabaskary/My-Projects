/**
 * 
 */
package javaBuilder;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import javax.security.auth.x500.X500Principal;

/**
 * @author kokab.askary
 *
 */
public class PrintingPyramid {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numOfRows =5;
		
		for(int i=0; i<numOfRows;i++) {
			for (int j = 0; j < numOfRows-i; j++) {
				System.out.print(" ");
				
			}for (int k = 0; k<=i; k++) {
				System.out.print("* ");
				}
			System.out.println();
		
		
		
	}}
}

