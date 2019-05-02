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
public class GenerateRandomAndAverage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int[100];
		int count = 0;
		double average;
		int sum = 0;
		
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100);
			sum = sum + arr[i];
		}
		
		average = sum /arr.length;
		System.out.println(average);
		
		for(int j=0; j<arr.length; j++) {
		if(arr[j]>average) {
			count++;
			}
		}
		System.out.println(count);
	}
}
