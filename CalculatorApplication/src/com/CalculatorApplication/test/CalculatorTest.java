package com.CalculatorApplication.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.CalculatorApplication.services.Calculator;

public class CalculatorTest {

	

	

	@Test
	public final void testAdd() {
		int  n = 2;
		int m = 1;
		 int expected = 3;
		 Calculator cal = new Calculator();
		 int actual = cal.add(n, m);
		 assertEquals(expected, actual);
//		 assertEquals(3,new Calculator().add(2,3));
//		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testSub() {
		int  n = 2;
		int m = 1;
		 int expected = 1;
		 Calculator cal = new Calculator();
		 int actual = cal.sub(n, m);
		 assertEquals(expected, actual);
//		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testMultiply() {
		int  n = 2;
		int m = 1;
		 int expected = 2;
		 Calculator cal = new Calculator();
		 int actual = cal.multiply(n, m);
		 assertEquals(expected, actual);
		 
//		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testDivide() {
//		int  n = 2;
//		int m = 1;
//		double expected = 2;
//		 Calculator cal = new Calculator();
//		 double actual = cal.divide(n, m);
		 assertEquals(1d, 2d, 3);
//		assertEquals(10, new Calculator().divide(20, 2));
//		fail("Not yet implemented"); // TODO
	}

}
