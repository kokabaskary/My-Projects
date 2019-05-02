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
public class AirPlaneSeatingTwoDimensionalArray {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[][] seats = new String[25][11];
		String[] rowsName =  {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O"
				+ "P","Q","R","S","T","U","V","W","X","Y","Z"};

		// outer loop for rows
		int rows = 25;
		int columns = 11;
		int i, j;
		int counter=0;
		String booked = "A4,A10,C5,D3,E6,F8";
		String inData = new String("");
		Scanner input = new Scanner(System.in);
		System.out.println("Already booked seats A4, A10, C5, D3, E6, F8");
		String userInput = input.next();
		
//		if(userInput.equalsIgnoreCase(booked)) {
//			System.out.println(" Sorry these seats are booked");
//		}else {
//			System.out.println(" Please enter how many seats to be booked");
//		}
//		
//		if(userInput.equalsIgnoreCase("A4")) {
//			seats[0][3] = "X";
//		}
		
		for (i = 0; i < rows; ++i) {// FOR DISPLAYING THE SEATS
			for (j = 1; j <columns; ++j) {
			
				seats[i][j] = rowsName[i]+j;
//				seats[i][j]= new String(rowsName[i]+j); 
			
				System.out.print(seats[i][j] + " ");
			}
			System.out.println(" ");
		}
		for (i=0; i<4; ++i) {
	          for (j=0; j<3; ++j) {
	              if (true) {
	            	  counter++;
	        	  }
	              }
			}
		
		
		for (i=0; i<rows; ++i) {
          for (j=0; j<columns; ++j) {
              if ((seats[i][j]).equalsIgnoreCase("A4")) {
                  seats[i][j]="X";
        	  
              }
              }
		}
	}
}
