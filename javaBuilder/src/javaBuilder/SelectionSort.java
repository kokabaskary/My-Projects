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
public class SelectionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[] = {3,4,1,-1,2,5,-3,4};
		sorter(num);//calling the sorter method
		System.out.println("Sorted array class Method: "+Arrays.toString(num));
		
		
		System.out.println("\n****************My Method******************\n");
		int min; int temp=0;
		for(int i = 0;i<num.length;i++){//start of outer for loop
			min=i;
				for(int j=i+1;j<num.length;j++) {//start of inner for loop
					if(num[j]<num[min]) {
						min=j;
						}//end of if statement
				}//end of inner for loop
				temp = num[i];
				num[i]=num[min];
				num[min]=temp;
		}//end of outer for loop
		System.out.println("Sorted array My Method: "+Arrays.toString(num));
		
		
		}//end of main method
	
//	System.out.println("****************class Method******************");

	static void sorter(int[] num) {//start of sorter method
		System.out.println("\n****************Class Method******************\n");
	for(int i = 0;i<num.length;i++){
		int minIndex = minFinder(i,num);//calling minFinder method
		int temp= num[i];
		num[i]= num[minIndex];
		num[minIndex]=temp;
	}
}//end of sorter method
	
	static int minFinder(int startIdx, int[] num) {//start of min index  finder method
		int min = num[startIdx];
		int minIndex = startIdx;
		
			for(int i= startIdx+1;i<num.length;i++) {//start of for loop
				if(min>num[i]) {
					min = num[i];
					minIndex =i;
					}//end of if statement
				}//end of  for loop
			return minIndex;
		}//end of finder method
					
	}
	
