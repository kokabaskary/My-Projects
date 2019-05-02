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
public class SimpleRecursion {

	// main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 6;
		recFun(num);
		System.out.println(recFuactorial(num));
		System.out.println(recFuactorialIteration(num));
	}

	static void recFun(int num) {

		if (num == 0) {
			System.out.println("Reached Zero :" + num);
		} else {
			num = num - 2;
			System.out.println(num);
			recFun(num);

		}
	}

	static int recFuactorial(int num) {

		if (num == 0) {
			System.out.println("If Succeed");
			return 1;
		} else {
			System.out.println(num);
			int result = num * (recFuactorial(num - 1));
			System.out.println("After Recursion :" + result);
			return result;
		}
//				return(num*(recFuactorial(num-1)));//one line code
			
			
//			if (num == 0) {
//				System.out.println("If Succeed");
//				return 1;
//			} else {
//				System.out.println(num);
//				int result1 = num * (recFuactorial(num - 1));
//				System.out.println("After Recursion :" + result1);
//				return result1;
//					return(num*(recFuactorial(num-1)));//one line code
//			}
//		}
	}// end of recFuctorial method

	static int recFuactorialIteration(int num) {
		int resultIt =1;
		
		for(int i=1;i<=num;i++) {//using increment
			resultIt = resultIt*i;
			
		}
		for(int i=num;i>=1;i--) {//using decrement 
			resultIt = resultIt*i;
			
		}
		return resultIt;
	}

	
	}
	// end of recFuctorial method


