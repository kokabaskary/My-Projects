package com.loginFormJpaJunit.main;

import com.loginFormJpaJunit.entities.UsersLogin;
import com.loginFormJpaJunit.services.UserDAOI;
import com.loginFormJpaJunit.services.UserServices;

public class JpaUserAppMain {

	public static void main(String[] args) {
		System.out.println("User Application");
		UserDAOI us = new UserServices();
		
//		us.createUser();
		
		UsersLogin input = new UsersLogin();
		input.setId(7);
		input.setName("John Adam");
		input.setEmail("asd@myemail.com");
		input.setPassword("1qazxw");
		input.setAddress("123 no where");
		input.setState("NY");
		input.setZipCode("12345");
		
//				us.createUsers(input);
		
		us.deleteUser(7);
		
		
//		user.setEmail("k@live.com");
//		user.setPassword("123456");
//		
//		if(us.login(user)) {
//			System.out.println("Welcome");
//		}else {
//			System.out.println("Bye Bye");
//		}
		
	}

}
