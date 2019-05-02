package javaBuilder;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class BodyMassIndexCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input1 = new Scanner(System.in);
		System.out.println("Please enter your weight in kilograms: ");
		double weight = input1.nextDouble();//user input
		System.out.println("Please enter your height in meters: ");
		double height = input1.nextDouble();
		double bmi = weight/(height*height);
		
		if(bmi<18.5) {
			System.out.println("UnderWeight");
		}else if(bmi<=18.5 && bmi<25.0) {
			System.out.println("Normal");
		}else if(bmi<=20.5 &&  bmi<30.0) {
			System.out.println("OverWeight!!!");
		}else if(bmi<=30.0) {
			System.out.println("OBESE!!!");
			}
		
		
		}
	
	

}
