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
public class DeckOfCards {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int deck[] = new int[52];
		for(int i = 0; i< deck.length; i++) {
			deck[i] = i;
		}
		System.out.println(Arrays.toString(deck));
		
			for(int j = deck.length-1; j>0; j--) {
				
				int k = (int)(Math.random()*(j+1));//random shifting
				int temp = deck[j];
				deck[j] = deck[k];
				deck[k] = temp;

			}
	
			
			for(int i = 0; i<4; i++) {
				System.out.println(deck[i]);
			
			if(deck[i]>=0 && deck[i]<=12) {
				
				System.out.println("The card is Spades:");
			}else if(deck[i]>=13 && deck[i]<=25) {
				System.out.println("The card is Hearts:");
			}else if(deck[i]>=26 && deck[i]<=38) {
				System.out.println("The card is Diamonds:");
			}else if(deck[i]>=39 && deck[i]<=51) {
				System.out.println("The card is Clubs:");
			}}

	}
}


