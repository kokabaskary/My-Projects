package javaBuilder;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ComputingTaxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input1 = new Scanner(System.in);
		System.out.println("Please enter your status\n : " + "For single filers Enter  1\n"
				+ " For married filing jointly or qualifying widow(er) Enter 2\n"
				+ " For married filing seprately Enter 3\n" + "For head of household Enter 4\n");
		int status = input1.nextInt();// user input

		if (status < 1 || status >= 5) {
			System.out.println("Please enter a valid number between 1-4");
		} else {
			System.out.println("Please enter your income:  $");
			double income = input1.nextDouble();
			double tax;
			DecimalFormat df = new DecimalFormat(".##");//formating the tax to 2 decimal place

			if (status == 1) {
				if (income >= 0 && income <= 8350.0) {
					tax = income * .10;
					System.out.println("Your tax rate is 10%  " );
					System.out.printf("\nYour US  income is : $" + income);
					System.out.println("Your US Fedral personal income tax is : $" + df.format(tax));
				} else if (income >= 8351.0 && income <= 33950.0) {
					tax = income * .15;
					System.out.println("Your US Fedral personal income tax is : $ " + df.format(tax));
				} else if (income >= 33951.0 && income <= 82250.0) {
					tax = income * .25;
					System.out.println("Your US Fedral personal income tax is : $ " + df.format(tax));
				} else if (income >= 82251.0 && income <= 171550.0) {
					tax = income * .28;
					System.out.println("Your US Fedral personal income tax is : $ " + df.format(tax));
				} else if (income >= 171551.0 && income <= 372950.0) {
					tax = income * .33;
					System.out.println("Your US Fedral personal income tax is : $ " + df.format(tax));
				} else if (income >= 372951) {
					tax = income * .35;
					System.out.println("Your US Fedral personal income tax is : $ " + df.format(tax));
				} else if (income >= 82251.0 && income <= 171550.0) {
					tax = income * .28;
					System.out.println("Your US Fedral personal income tax is : $ " + df.format(tax));
				}
			} else if (status == 2) {
				if (income >= 0 && income <= 16700.0) {
					tax = income * .10;
					System.out.println("Your US Fedral personal income tax is : $ " + df.format(tax));
				} else if (income >= 16701.0 && income <= 67900.0) {
					tax = income * .15;
					System.out.println("Your US Fedral personal income tax is : $ " + df.format(tax));
				} else if (income >= 67901.0 && income <= 137050.0) {
					tax = income * .25;
					System.out.println("Your US Fedral personal income tax is : $ " + df.format(tax));
				} else if (income >= 137051.0 && income <= 208850.0) {
					tax = income * .28;
					System.out.println("Your US Fedral personal income tax is : $ " + df.format(tax));
				} else if (income >= 208851.0 && income <= 372950.0) {
					tax = income * .33;
					System.out.println("Your US Fedral personal income tax is : $ " + df.format(tax));
				} else if (income >= 372951) {
					tax = income * .35;
					System.out.println("Your US Fedral personal income tax is : $ " + df.format(tax));
				}
			} else if (status == 3) {
				if (income >= 0 && income <= 8350.0) {
					tax = income * .10;
					System.out.println("Your US Fedral personal income tax is : $ " + df.format(tax));
				} else if (income >= 8351.0 && income <= 33950.0) {
					tax = income * .15;
					System.out.println("Your US Fedral personal income tax is : $ " + df.format(tax));
				} else if (income >= 339511.0 && income <= 68525.0) {
					tax = income * .25;
					System.out.println("Your US Fedral personal income tax is : $ " + df.format(tax));
				} else if (income >= 68526.0 && income <= 104425.0) {
					tax = income * .28;
					System.out.println("Your US Fedral personal income tax is : $ " + df.format(tax));
				} else if (income >= 104426.0 && income <= 186475.0) {
					tax = income * .33;
					System.out.println("Your US Fedral personal income tax is : $ " + df.format(tax));
				} else if (income >= 186476) {
					tax = income * .35;
					System.out.println("Your US Fedral personal income tax is : $ " + df.format(tax));
				}
			} else if (status == 4) {
				if (income >= 0 && income <= 11950.0) {
					tax = income * .10;
					System.out.println("Your US Fedral personal income tax is : $ " + df.format(tax));
				} else if (income >= 11951.0 && income <= 45500.0) {
					tax = income * .15;
					System.out.println("Your US Fedral personal income tax is : $ " + df.format(tax));
				} else if (income >= 45501.0 && income <= 117450.0) {
					tax = income * .25;
					System.out.println("Your US Fedral personal income tax is : $ " + df.format(tax));
				} else if (income >= 117451.0 && income <= 190200.0) {
					tax = income * .28;
					System.out.println("Your US Fedral personal income tax is : $ " + df.format(tax));
				} else if (income >= 190201.0 && income <= 372950.0) {
					tax = income * .33;
					System.out.println("Your US Fedral personal income tax is : $ " + df.format(tax));
				} else if (income >= 372951) {
					tax = income * .35;
					System.out.println("Your US Fedral personal income tax is : $ " + df.format(tax));
				}
			}

		}

	}
}
