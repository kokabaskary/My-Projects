/**
 * 
 */
package javaBuilder;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import javax.security.auth.x500.X500Principal;

/**
 * @author kokab.askary
 *
 */
public class TicTacToe2D {

	/**
	 * @param args
	 */

	public static boolean playing = true;
	public static char  turn = 'X';
	static char  ticTacToe[][];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ticTacToe = new char[3][3];
		char currentPlayer= 'X';
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				ticTacToe[i][j] = '_';
			}
		}
		printBoard();
		play();
	}//end of main method
	
	
//		initialBoard();

	public static void play() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Player 1 your mark is X, please enter a position to enter e.g 32:  ");
		int  row = input.nextInt()-1;
		int  col = input.nextInt()-1;
		ticTacToe[row][col]=turn;
		
		System.out.println("Player 2 your mark is O, please enter a position to enter e.g 32:  ");
		
		
		
		while(playing) {
			 if(turn=='X') {
				 turn='O';
			 }else {
				 turn='X';
			 }
			
		}
		
	}

	//method for printing the game board
	static void printBoard() {
		for(int i=0; i<3; i++) {
			System.out.println();
			for(int j=0; j<3; j++) {
				if(j==0) 
					System.out.print(" | ");
					System.out.print(ticTacToe[i][j]+ " | ");
					}
			}//end of outer for loop
			System.out.println();
		}
	}
	
	
		
