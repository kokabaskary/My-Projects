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
public class TwoDimensionalArraySequentialIncrement {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] numberArr = new int [6][5];
		numberArr = new int[][] {{10,12,43,11,22},
				{20,45,56,1,33},
				{30,67,32,14,44},
				{40,12,87,14,55},
				{50,86,66,13,66},
				{60,53,44,12,11}};
				
			//outer loop for rows
				int rows = 6;
				int columns = 5;
				int i, j;
				for(i=0; i<rows; i++) {
					for(j=0; j<columns; j++) {
						System.out.print(numberArr[i][j]+ " ");
					}
					System.out.println( " " );
				}
				
				
				
				
		
			
	}

}
