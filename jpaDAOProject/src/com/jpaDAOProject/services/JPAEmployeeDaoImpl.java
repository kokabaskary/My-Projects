package com.jpaDAOProject.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jpaModelProject.entities.Employee;

public class JPAEmployeeDaoImpl implements JPAEmployeeDao {

	@Override
	public void addEmployee(Employee newEmployee) {
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpaDAOProject");
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			
			//insert into table employee
			entityManager.getTransaction().begin();
			entityManager.persist(newEmployee);//insert into table name
			System.out.println("New Employee was created successfully" );
			newEmployee.printEmployee();
			entityManager.getTransaction().commit();
			
			
			entityManager.close();
			entityManagerFactory.close();
		} catch (Exception e) {
			System.out.println("Oops! Something went wrong New Employee was not created successfully");
		}
		
	}

	@Override
	public Employee fetchEmployee(int employeeID) {
		try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpaDAOProject");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		
		
		Employee foundEmployee = entityManager.find(Employee.class, employeeID);
		
		if(foundEmployee!=null) {
			foundEmployee.printEmployee();
		}else {
			System.out.println("Employee with the id "+ employeeID + " doesn't exists.");
		}
		entityManager.close();
		entityManagerFactory.close();
		
		return foundEmployee;
		}catch (Exception e) {
			System.out.println("Oops! Something went wrong can't fetch employee record");
		}
		return null;
	}

	@Override
	public void updateEmployee(int employeeID, String phoneNo) {
	
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpaDAOProject");
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			
			
			entityManager.getTransaction().begin();
			Employee foundEmployee = entityManager.find(Employee.class, employeeID);
			if (foundEmployee!=null) {
				System.out.println("Employee phone old..");
				foundEmployee.printEmployee();
				System.out.println("\n**********************\n");
				foundEmployee.setPhoneNo(phoneNo);
				
				System.out.println("Employee phone updated..");
				foundEmployee.printEmployee();
				entityManager.getTransaction().commit();
				
			}else {
				System.out.println("Employee with the id "+ employeeID + " doesn't exists.");
			}
			
			entityManager.close();
			entityManagerFactory.close();
		} catch (Exception e) {
			System.out.println("Oops! Something went wrong cant update employee phone");
		}
		
	}

	@Override
	public void removeEmployee(int employeeID) {
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpaDAOProject");
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			
			
			entityManager.getTransaction().begin();
			Employee foundEmployee = entityManager.find(Employee.class, employeeID);
			if (foundEmployee!=null) {
				System.out.println("Employee..");
				foundEmployee.printEmployee();
				System.out.println("\n**********************\n");
			entityManager.remove(foundEmployee);
			System.out.println("Employee removed successfully..");
			entityManager.getTransaction().commit();
			}else {
				System.out.println("Employee with the id "+ employeeID + " doesn't exists.");
			}
			entityManager.close();
			entityManagerFactory.close();
		} catch (Exception e) {
			System.out.println("Oops! Something went wrong cant remove employee ");
		}
	}

	@Override
	public List<Employee> fetchAllEmployees() {
		
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpaDAOProject");
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			
			Query query = entityManager.createQuery("Select e FROM Employee e");
			List<Employee> employeeList = query.getResultList();
			for (Employee employee : employeeList) {
				employee.printEmployee();
			}
			
			entityManager.close();
			entityManagerFactory.close();
			
			return employeeList;
			
			}catch (Exception e) {
				System.out.println("Oops! Something went wrong can't fetch employee record");
			}
			return null;
		
	}

	

}
