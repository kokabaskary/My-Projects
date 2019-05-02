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
public class TwoDimensionalArray {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] numberArr = new int[3][4];

		// outer loop for rows
		int rows = 3;
		int columns = 4;
		int i, j;
		int value = 0;
		for (i = 0; i < rows; i++) {
			for (j = 0; j < columns; j++) {
				value += 10;
				numberArr[i][j] = value;
				System.out.print(numberArr[i][j] + " ");
			}
			System.out.println(" ");
		}

		System.out.println("/n********************************Random number initializing array**************** ");

		for (i = 0; i < rows; i++) {
			for (j = 0; j < columns; j++) {
				numberArr[i][j] = (int)(Math.random()*100);
				
				System.out.print(numberArr[i][j] + " ");
			}
			System.out.println(" ");
		}

	}

}
