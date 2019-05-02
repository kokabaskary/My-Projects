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
public class AirPlaneSeatingTwoDimensionalArrayClass {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=0;
		int numOfRow =26;
		int numOfcolumn=10;
//		boolean[][] seats= {{true,true,false},{false,true,true},{false,false,true},{true,true,true}};
		boolean[][] seats = new boolean[26][10];
//		String[] bookedSeatsArr = {"A4","B7","C5","D6","F4","F5"};
		
		Scanner input = new Scanner(System.in);
		System.out.println("Already booked seats A4, A10, C5, D3, E6, F8");
		String bookedSeats = input.next();
		String delimiter =",";
		bookedSeats =bookedSeats.replaceAll("\\s+", "");
		String[] bookedSeatsArr = bookedSeats.split(delimiter);
		
				
				for(int i = 0;i<seats.length;i++) {
					for(int j=0;j<10; j++) {
						seats[i][j]=true;
					}
				}
		System.out.println(Arrays.deepToString(seats));
		
		for(int i=0; i<bookedSeatsArr.length;i++) {
			String temp = bookedSeatsArr[i];
			int row = Integer.valueOf(getRow(temp.charAt(0)));
			int column = Integer.valueOf(temp.substring(1))-1;
			seats[row][column] =false;
		}
				
				for(int i =0; i<seats.length; i++) {
					int j =0;
					if(seats[i][j]&&seats[i][j+1]&&seats[i][j+2]) {
						count++;	
					}
					
					
					if((seats[i][j+3]&&seats[i][j+4]&&seats[i][j+5])
							||(seats[i][j+4]&&seats[i][j+5]&&seats[i][j+6])) {
						count++;
					}
					if(seats[i][j+7]&&seats[i][j+8]&&seats[i][j+9]) {
						count++;	
					}
					
					
				}System.out.println(count);
		
		
		}
		public static int getRow(char c) {
			return(int)(c-'A');
			
		}
		
	}

