package com.jPAJPQLORM.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jPAJPQLORM.entities.Employee;

public class EmployeeServiceImpl implements EmployeeServices {

	@Override
	public void createEmployee(Employee newEmployee) {
		
//		if (newEmployee.geteId()!=null) {
//			
//		} else {
//
//		}
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jPAJPQLORM");
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			
			//insert into table employee
			
			entityManager.getTransaction().begin();
			
			entityManager.persist(newEmployee);//insert into table name
			System.out.println("New Employee was created successfully");
			newEmployee.printEmployee();
			entityManager.getTransaction().commit();
			
			
			entityManager.close();
			entityManagerFactory.close();
		} catch (Exception e) {
			System.out.println("Oops! Something went wrong New Employee was not created successfully");
		}
		
		
	}

	@Override
	public void findAllEmployees() {//finding all employees query
		try {
			//1.Step
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("jPAJPQLORM");
			EntityManager manager = factory.createEntityManager();
			
			//2.Step Querying
			
			Query queryAll = manager.createQuery("SELECT e FROM Employee e");
			
			List<Employee> employees = queryAll.getResultList();
			
			for (Employee e : employees) {
				e.printEmployee();
			}
		} catch (Exception e) {
			System.out.println("Something went wrong!!!!");
		}
		
	}
	
	//NAMED QUERY
	@Override
	public List<Employee> findEmployeeByNamedQuery(int eId){
		//1.Step
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("jPAJPQLORM");
			EntityManager manager = factory.createEntityManager();
				
		//2.Step Querying
			Query query = manager.createNamedQuery("Find Employee by ID");
			query.setParameter("id", eId);
			List<Employee> employees = query.getResultList();
			for (Employee e : employees) {
				e.printEmployee();
			}
			
		return employees;
	}

	//finding employee by using parameter
	@Override
	public void findEmployee(int eId) {
		// TODO Auto-generated method stub

		//1.Step
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jPAJPQLORM");
		EntityManager manager = factory.createEntityManager();
		
		//2.Step Querying
		
		Query queryAll = manager.createQuery("SELECT e FROM Employee e WHERE e.eId =:givenId");
		queryAll.setParameter("givenId", eId);
		List<Employee> employees = queryAll.getResultList();
		
		for (Employee e : employees) {
			e.printEmployee();
		}
	}

}
