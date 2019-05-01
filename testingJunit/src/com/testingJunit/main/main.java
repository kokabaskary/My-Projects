package com.testingJunit.main;

import com.testingJunit.service.TestThis;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestThis test = new TestThis();
		test.addName("Kokab");
		System.out.println(test.getNameAtIndex(0));
		System.out.println(test.getNames());
//		System.out.println(test.toString());

	}

}
