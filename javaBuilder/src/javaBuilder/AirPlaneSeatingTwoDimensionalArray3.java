/**
 * 
 */
package javaBuilder;

import java.io.InputStream;
import java.security.PublicKey;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import javax.security.auth.x500.X500Principal;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * @author kokab.askary
 *
 */
public class AirPlaneSeatingTwoDimensionalArray3 {

	/**
	 * @param args
	 */
	
    static Scanner input = new Scanner(System.in);
    static String seats[][] = new String[26][10];
    static String rowName[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O"
			+ "P","Q","R","S","T","U","V","W","X","Y","Z"};

    static int i, j;
    static int rows = 26;
	static int columns = 10;// Loop Control Variables

    static void dispData() {    // Method that will display the array content
        for (i=0; i<rows; ++i) {
            for (j=0; j<columns; ++j) {
//            	seats[i][j] = rowName[i]+(j+1);
                System.out.print(seats[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

//    static boolean chkData(String vData) {  // Method that will check for reservation availability
//        for (i=0; i<rows; ++i) {
//            for (j=0; j<columns; ++j) {
//                if ((seats[i][j]).equalsIgnoreCase(vData)) {
//                    seats[i][j]="X";
//                    return true;
//                }
//            }
//        }
//        return false;
//    }

    public static void main(String args[]) {  // the MAIN method program
        String inData = new String("");
        for (i=0; i<rows; ++i) {                                   // Initialized array with constant data
            for (j=0; j<columns; ++j) {
//            	seats[i][j] = rowName[i]+j;
                seats[i][j] = new String( rowName[j]+(j+1) );
                dispData();
            }
       
//        do {                                                     // Loop until user press X to exit
//            	dispData();
//                System.out.print("Enter Seat Reservation: ");
//                inData = input.next();
//                if (chkData(inData))
//                    System.out.println("Reservation Successful!");
//                else
//                    System.out.println("Occupied Seat!");
//                   
//        } while (!inData.equalsIgnoreCase("X"));
//
    } 
  
}}

	


		
		
	

