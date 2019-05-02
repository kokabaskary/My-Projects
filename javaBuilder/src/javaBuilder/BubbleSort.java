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
public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[] = {10,5,20,15,20,35};
		int temp=0;
		boolean unsorted= true;
		int i;
		System.out.println("Unsorted array: "+Arrays.toString(arr));
		while (unsorted) {
			unsorted=false;
		for(i=0;i<arr.length-1;i++) {

			System.out.println("Iteration: "+ i+ " " +"Unsorted: "+ unsorted+ " "+ Arrays.toString(arr));
			if(arr[i]>arr[i+1]) {
				temp =arr[i];
				arr[i] = arr[i+1];
				arr[i+1]=temp;
				unsorted =true;
				}
		}
		if(unsorted==true) {
			System.out.println("The List is now sorted...");
			break;
			
		}
		}
		
	
		System.out.println("Sorted array: "+Arrays.toString(arr));
		
		System.out.println("\n*******************************************************");
		double[] num = {0.2,0.3,2.9,1.3,0.1};
		double dtemp=0;
		for(int j=0;j<num.length-1; j++) {
			for(int k=0; k<num.length-j-1;k++) {
				if(num[k]>num[k+1]) {
					dtemp =num[k];
					num[k] = num[k+1];
					num[k+1]=dtemp;
//					unsorted =true;
				
				}
				}
			
		}System.out.println("Sorted array: "+Arrays.toString(num));
	}
}
