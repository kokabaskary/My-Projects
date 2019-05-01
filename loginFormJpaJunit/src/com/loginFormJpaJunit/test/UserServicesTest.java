package com.loginFormJpaJunit.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.loginFormJpaJunit.entities.UsersLogin;
import com.loginFormJpaJunit.services.UserServices;

public class UserServicesTest {

	@Test
	public final void testLogin() {
		
		//email="junit@abx.com"
		//password="bnhgyt67"
		
		//test case 1: email="junit@abx.com" , password="bnhgyt67"
		//1.prepare expected value/values
			//testing for a valid login
			
		
		//2.get actual value/values
			//invoke the login with the test case
			UserServices us = new UserServices();
			UsersLogin user = new UsersLogin();
			user.setEmail("junit@abx.com");
			user.setPassword("bnhgyt67");
			boolean expected = us.login(user);
		
		//3.assert
			//login should return true
			assertTrue(expected);
			
			//test case 2: email="junit@abx.com" , password="bnhgyt67"
			//1.prepare expected value/values
				//testing for a valid login
				
			
			//2.get actual value/values
				//invoke the login with the test case
				 us = new UserServices();
				 user = new UsersLogin();
				user.setEmail("j@abx.com");
				user.setPassword("gh");
				 expected= us.login(user);
			
			//3.assert
				//login should return true
				assertFalse(expected);
//		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testGetUserByEmail() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testFindUsersByState() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testFindUsersByZipcode() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testCreateUser() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testCreateUsers() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testDeleteUser() {
		fail("Not yet implemented"); // TODO
	}

}
