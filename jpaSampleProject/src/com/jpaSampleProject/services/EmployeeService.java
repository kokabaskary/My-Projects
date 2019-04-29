package com.jpaSampleProject.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jpaSampleProject.entities.Employee;

public class EmployeeService {
	
	public static void createEmployee(Employee newEmployee) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpaSampleProject");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		//insert into table employee
		entityManager.getTransaction().begin();
		entityManager.persist(newEmployee);//insert into table name
		entityManager.getTransaction().commit();
		
		
		entityManager.close();
		entityManagerFactory.close();
	}
	
	public static Employee findEmployee(int employeeID) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpaSampleProject");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Employee foundEmployee = entityManager.find(Employee.class, employeeID);
		
		entityManager.close();
		entityManagerFactory.close();
		
		return foundEmployee;
		
		
		
	}
	
	public static void updateEmployee(int employeeID, String phoneNo) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpaSampleProject");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		
		entityManager.getTransaction().begin();
		Employee foundEmployee = entityManager.find(Employee.class, employeeID);
		foundEmployee.setPhoneNo(phoneNo);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
		
		
	}
	
	public static void removeEmployee(int employeeID) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpaSampleProject");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		
		entityManager.getTransaction().begin();
		Employee foundEmployee = entityManager.find(Employee.class, employeeID);
		entityManager.remove(foundEmployee);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
		
		
	}

}
