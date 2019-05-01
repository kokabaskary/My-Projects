package com.loginFormJpaJunit.services;

import java.util.List;

import com.loginFormJpaJunit.entities.UsersLogin;

public interface UserDAOI {
	
	public boolean login(UsersLogin newUSer);
	public void createUser();
	public void deleteUser(int id);
	public UsersLogin getUserByEmail(String email);
	public List<UsersLogin> findUsersByState(String state);
	public List<UsersLogin> findUsersByZipcode(String zipcode);
	public void createUsers(UsersLogin inputUser); //from user

}
