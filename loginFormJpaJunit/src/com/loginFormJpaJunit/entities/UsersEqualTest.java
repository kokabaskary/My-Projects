package com.loginFormJpaJunit.entities;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class UsersEqualTest {

	

	@Test
	public final void testEqualsObject() {
		
		UsersLogin expected = new UsersLogin();
		expected.setId(1);
		expected.setEmail("emailSample");
		expected.setName("Kokab");
		expected.setPassword("123");
		expected.setAddress("My address");
		expected.setState("NY");
		expected.setZipCode("12345");
		
		UsersLogin actual = new UsersLogin();
		actual.setId(1);
		actual.setEmail("emailSample");
		actual.setName("Kokab");
		actual.setPassword("123");
		actual.setAddress("My address");
		actual.setState("NY");
		actual.setZipCode("12345");
		assertEquals(expected, actual);
//		fail("Not yet implemented"); // TODO
	}

}
