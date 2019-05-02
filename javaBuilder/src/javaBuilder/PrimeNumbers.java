/**
 * 
 */
package javaBuilder;

import java.io.NotActiveException;
import java.util.Random;
import java.util.Scanner;

/**
 * @author kokab.askary
 *
 */
public class PrimeNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int primeNumberCounter = 0;
		int PrimeNumbers = 0;
		boolean isPrime = true;
		int num=2;
		int x = 1;
		
//		while(primeNumberCounter<20) {
//			if(num)
//		}

		for (int i = 2; i <= 20; i++) {//outer loop for looping through 1-20
			for (int j = 2; j <=i-1; j++) {
				if (i % j == 0) {

					isPrime = false;
				
			}else if (isPrime) {
				
			}if (isPrime) {
					System.out.println("The Number " + i + " is a  prime number" + i);
					primeNumberCounter++;
					PrimeNumbers = i;
//	
				} else {
					isPrime = false;
					System.out.println("The Number " + i + " is  not a  prime number");
				}}
//				("There are " + primeNumberCounter + "Prime Numbers  from 1 - 20");

			}System.out.println("The Prime Numbers between 1 -20 are :" + PrimeNumbers);

		}
	}

