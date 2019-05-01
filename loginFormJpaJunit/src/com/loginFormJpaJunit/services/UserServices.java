package com.loginFormJpaJunit.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


import com.loginFormJpaJunit.entities.UsersLogin;

public class UserServices implements UserDAOI{

	@Override
	public boolean login(UsersLogin user) {
		// TODO Auto-generated method stub
		//1.factory & manager
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("loginFormJpaJunit");
		EntityManager manager = factory.createEntityManager();
		
		//2.transaction(2.2=QUERY)
		String givenEmail = user.getEmail();
		String givenPassword = user.getPassword();
		Query queryLogin = manager.createQuery("SELECT user FROM UsersLogin user WHERE user.email =:givenEmail and user.password =:givenPassword");
		queryLogin.setParameter("givenEmail", givenEmail);
		queryLogin.setParameter("givenPassword", givenPassword);
		
		List<UsersLogin> userList = queryLogin.getResultList();
		
		//just for checking userlist
		
		
		
		
		
		
		//3.close manager & factory
		manager.close();
		factory.close();
		
		if(userList.size()>0) {
			System.out.println("User = " + userList.get(0).getEmail());
			return true;
		}
		
			return false;
	}

	@Override
	public UsersLogin getUserByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UsersLogin> findUsersByState(String state) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UsersLogin> findUsersByZipcode(String zipcode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createUser() {
	
		//1.factory & manager
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("loginFormJpaJunit");
			EntityManager manager = factory.createEntityManager();
			
			manager.getTransaction().begin();
			
			UsersLogin  nUsers1 = new UsersLogin(1, "my@live.com", "Kokab Askary", "123asd", "My Address","NY","11356");
			manager.persist(nUsers1);
			
			UsersLogin  nUsers2 = new UsersLogin(2, "hello@abc.com", "James Doe", "awe45", "12 No where","NJ","12345");
			manager.persist(nUsers2);
			
			UsersLogin  nUsers3 = new UsersLogin(3, "myemail@msn.com", "Maria Adam", "1q2w3e", "Hillside Ave","CT","23214");
			manager.persist(nUsers3);
			
			UsersLogin  nUsers4 = new UsersLogin(4, "junit@abx.com", "Kevin Yo", "bnhgyt67", "UnderHill ","MI","98765");
			manager.persist(nUsers4);
			
			manager.getTransaction().commit();
			
			//3
			manager.close();
			factory.close();
		
	}

	@Override
	public void createUsers(UsersLogin inputUser) {
		
		//1.factory & manager
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("loginFormJpaJunit");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		manager.persist(inputUser);
		
		manager.getTransaction().commit();
		
		//3
		manager.close();
		factory.close();
		
		
		
				
	}

	@Override
	public void deleteUser(int id) {
		
		//1.factory & manager
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("loginFormJpaJunit");
			EntityManager manager = factory.createEntityManager();
			
			manager.getTransaction().begin();
			UsersLogin foundUser = manager.find(UsersLogin.class,id);
			
			manager.remove(foundUser);
			manager.getTransaction().commit();
			System.out.println("User deleted");
			
			//3
			manager.close();
			factory.close();
		
	}

}
