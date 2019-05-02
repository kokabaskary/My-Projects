/**
 * 
 */
package javaBuilder;

import java.util.Random;
import java.util.Scanner;

/**
 * @author kokab.askary
 *
 */
public class PredictingTution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int year =0;
		double tution = 10000;
//		double rate = 7;
		
																				

		while(tution <20000){
			tution = tution * 1.07;
			year++;
			}
		
		System.out.println(" The tution fee will double in : " +year + "");
		
	
	}

}
