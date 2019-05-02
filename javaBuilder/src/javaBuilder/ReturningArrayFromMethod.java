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
public class ReturningArrayFromMethod {

	/**
	 * @param args
	 */

	public static int[] reverse(int[] list) {

		int[] result = new int[list.length];
		for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
			result[j] = list[i];
		}
		return result;
	}
	
//method for reversing array in original array
public static void  reverseOriginal(int a[],int size) {

		int i, k, temp;
		for (i = 0; i < size / 2; i++) {
			temp = a[i];
			a[i] = a[size - i - 1];
			a[size - i - 1] = temp;
		}
		/*printing the reversed array*/
        System.out.println("Reversed array is: \n"); 
        for (k = 0; k <size; k++) { 
            System.out.println(a[k]); 
            
        } 
    } 


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("/n***************Reverse new array*******************/n");
		int[] numArr = {10,20,30,40,50};
		
		int[] revArr = new int[numArr.length];
		
		
		for(int i =0,j=numArr.length-1; i<numArr.length; i++, j--) {
			revArr[j]= numArr[i];
			System.out.println("The value of i is :" + i);
			System.out.println("The value of j is :" + j);
		}
		System.out.println("The origional array is :" + Arrays.toString(numArr));
		System.out.println("The reversed array is :" + Arrays.toString(revArr));
		System.out.println("/n**********************************/n");

		int list1[] = { 1, 2, 3, 4, 5 };
		int list2[] = reverse(list1);
		System.out.println("The origional array is :" + Arrays.toString(list1));
		System.out.println("The reversed array is :" + Arrays.toString(list2));

		System.out.println("/n***************Reverse Original*******************;/n");
		
		int list3[] = { 1, 2, 3, 4, 5 };
		
		
		
		
		System.out.println("The reversed array is :" + Arrays.toString(list1));
		
		reverseOriginal(list1, list1.length);
	

	}

}
