package com.CalculatorApplication.services;

//===============================================================
//include 4 methods for 
//	1.addition, (number1, number2) return result
//	2.subtraction,(number1, number2) return result
//	3.Multiply,(number1, number2) return result
//	4.Division, (number1, number2) return result
//===============================================================

public class Calculator {

//	1.addition, (number1, number2) return result
	public int add(int number1, int number2) {
		return number1 + number2;
	}
//	2.subtraction,(number1, number2) return result
	public int sub(int number1, int number2) {
		return number1 - number2;
	}
	
//	3.Multiply,(number1, number2) return result
	public int multiply(int number1, int number2) {
		return number1 * number2;
	}

//	4.Division, (number1, number2) return result
	public double divide(int number1, int number2) {
		return number1 / number2;
	}
	
}
