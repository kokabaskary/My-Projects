import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTesting {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please provide a divisior: ");
//		int number=0;
//		while(number>1) {
		try {
			int number = input.nextInt();
			int i = 1/number;
			System.out.println("Result is  " +i);
			
			int[] numbers = {1,2,3,4,5};
			System.out.println(numbers[5]);
	}catch (ArithmeticException e) {
		
		System.out.println("That was an arthimetic division error by dividing a number by 0");
		System.out.println("Please Try again");
	}catch (InputMismatchException e) {
		
		System.out.println("That was an input mismatch error please provide a number");
		System.out.println("Please Try again");
		
	}catch (ArrayIndexOutOfBoundsException e) {
		
			System.out.println("The heighest index you can use is 4");
		}finally {
		System.out.println("That's it you tried your best");
		input.close();
	}
		
		System.out.println("Outside the try-catch-finally!");
}
}

