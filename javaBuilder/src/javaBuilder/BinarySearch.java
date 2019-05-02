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
public class BinarySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[] = {2,4,7,10,11,45,50,59,60,66,69,70,79};
		int key =54;
		int middleIndex;
		int startIndex =0;
		int endIndex =arr.length-1;
		
		
		for(int i=0; i<arr.length; i++) {
			
//			System.out.println(arr[i]+ " ");
			middleIndex =startIndex + (endIndex - startIndex);
			
			System.out.print( middleIndex);
			if(key==middleIndex) {
				System.out.print(" The Key is :" +middleIndex);
			}else if(key>middleIndex) {
				startIndex= middleIndex;
				System.out.print(" The Key is  greater:" +middleIndex);
			
			}else if(key<middleIndex){
				endIndex =middleIndex;
				System.out.print(" The Key is  less than:" +middleIndex);
			}
		
		
		
		
	
	}

}}
