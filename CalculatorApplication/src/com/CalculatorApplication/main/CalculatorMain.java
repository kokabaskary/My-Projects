package com.CalculatorApplication.main;

import com.CalculatorApplication.services.Calculator;

public class CalculatorMain {

	public static void main(String[] args) {
		
		System.out.println("Basic Calculator");

		int number1 = 5;
		int number2 = 3;
		
		Calculator calc = new Calculator();
		
		System.out.println("ADDITION");
		System.out.println(number1 +" + " + number2 + " = " + calc.add(number1, number2));
	}

}
