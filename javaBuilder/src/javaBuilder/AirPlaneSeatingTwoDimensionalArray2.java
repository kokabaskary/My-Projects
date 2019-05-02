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
public class AirPlaneSeatingTwoDimensionalArray2 {

	/**
	 * @param args
	 */
	
    static Scanner input = new Scanner(System.in);
    static String arrS[][] = new String[26][10];
//    static String cName[] = {"A","B","C","D","E"};
    static String cName[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O"
			+ "P","Q","R","S","T","U","V","W","X","Y","Z"};

    static int i, j;
    static int rows = 25;
	static int columns = 11;// Loop Control Variables

    static void dispData() {    // Method that will display the array content
        for (i=0; i<rows; ++i) {
            for (j=0; j<columns; ++j) {
                System.out.print(arrS[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

//    static boolean chkData(String vData) {  // Method that will check for reservation availability
//        for (i=0; i<26; ++i) {
//            for (j=0; j<10; ++j) {
//                if ((arrS[i][j]).equalsIgnoreCase(vData)) {
//                    arrS[i][j]="X";
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//
//    static boolean chkFull() {  // Method that will check if all reservations were occupied
//        for (i=0; i<26; ++i) {
//            for (j=0; j<10; ++j) {
//                if (!(arrS[i][j]).equals("X")) {
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
//
    public static void main(String eds[]) {  // the MAIN method program
        String inData = new String("");
        for (i=0; i<rows; ++i) {                                   // Initialized array with constant data
            for (j=0; j<columns; ++j) {
                arrS[i][j] = new String( cName[i]+(i) );
               
            }
        }
//
        do {                                                    // Loop until user press X to exit
            dispData();
            if (chkFull())
            {
                System.out.println("Reservation is FULL");
                inData="X";
            }
            else 
            {
                System.out.print("Enter Seat Reservation: ");
                inData = input.next();
                if (chkData(inData))
                    System.out.println("Reservation Successful!");
                else
                    System.out.println("Occupied Seat!");
            }       
        } while (!inData.equalsIgnoreCase("X"));

    }   
}}

	


		
		
	

