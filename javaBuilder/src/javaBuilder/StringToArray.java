/**
 * 
 */
package javaBuilder;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import javax.security.auth.x500.X500Principal;

/**
 * @author kokab.askary
 *
 */
public class StringToArray {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		String subjects = "Math| English|  Law";
		
		
		String delimiter =",";
		subjects = subjects.replaceAll("\\s*\\|\\s*", " ");
		String[] subjectArr = subjects.split(delimiter);
		
				
		System.out.println(Arrays.deepToString(subjectArr));
		
		System.out.println(subjectArr.length);
		
	}}

