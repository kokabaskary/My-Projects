package com.JPAUsingJPQL.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.JPAUsingJPQL.entities.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	
	@Override
	public void mainEmployee() {
		
		Employee employee  = new Employee(1, "Koakab", "Askary", "123-456-7890");
		
		
	}

	@Override
	public boolean createEmployee(Employee newEmployee) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateEmployeeBYId(int givenId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeEmployee(int givenId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Employee findEmployee(int pGivenId) {
		
		//STEP 1 create factory and manager
				EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPAUsinJPQL");
				EntityManager entityManager = entityManagerFactory.createEntityManager();
				//STEP 2
				Query query = entityManager.createQuery("SELECT e FROM Employee e");
				List<Employee> employeeList = query.getResultList();
				
				for (Employee emp : employeeList) {
					System.out.println(emp.toString());
					
				}
				
//				Query queryOneEmployee = entityManager.createQuery("Select employee From Employee employee Where employee.employeeID = :givenId");
				
//				queryOneEmployee.setParameter("givenId", pGivenId);
//				List<Employee> employeeList = queryOneEmployee.getResultList();
//				System.out.println("this is the employee" + employeeList.get(0).getFirstName());
				
				//if employeeList.size = 0==> not find
				//else found
				
//				Employee vEmployee = null;
//				if (employeeList.size()!=0) {
//					vEmployee = employeeList.get(0);
//				} else {
//					System.out.println("Employee Not Found");
//				}
				//STEP 3
				entityManager.close();
				entityManagerFactory.close();
		return (Employee) employeeList;
	}

	@Override
	public List<Employee> findAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void getEmployeesNamedQuery(int inputID) {
		
		
		
	}

	@Override
	public void showEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	

	
	
//	@Override
//	public void createEmployee(Employee newEmployee) {
//		try {
//			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPAUsinJPQL");
//			EntityManager entityManager = entityManagerFactory.createEntityManager();
//			
//			//insert into table employee
//			entityManager.getTransaction().begin();
//			
//			entityManager.persist(newEmployee);//insert into table name
//			System.out.println("New Employee was created successfully" + newEmployee);
//			entityManager.getTransaction().commit();
//			System.out.println("New Employee was created successfully");
//			
//			entityManager.close();
//			entityManagerFactory.close();
//		} catch (Exception e) {
//			System.out.println("Oops! Something went wrong New Employee was not created successfully");
//		}
//	}
//
//	@Override
//	public Employee findEmployee(int employeeID) {
//		try {
//			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPAUsinJPQL");
//			EntityManager entityManager = entityManagerFactory.createEntityManager();
//			
//			
//			
//			Employee foundEmployee = entityManager.find(Employee.class, employeeID);
//			
//			if(foundEmployee!=null) {
//				System.out.println(foundEmployee);
//			}else {
//				System.out.println("Employee with the id "+ employeeID + " doesn't exists.");
//			}
//			entityManager.close();
//			entityManagerFactory.close();
//			
//			return foundEmployee;
//			}catch (Exception e) {
//				System.out.println("Oops! Something went wrong cant fetch employee record");
//			}
//			return null;
//		
//	}
//
//	@Override
//	public void updateEmployee(int employeeID, String phoneNo) {
//		try {
//			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPAUsinJPQL");
//			EntityManager entityManager = entityManagerFactory.createEntityManager();
//			
//			
//			entityManager.getTransaction().begin();
//			Employee foundEmployee = entityManager.find(Employee.class, employeeID);
//			if (foundEmployee!=null) {
//				foundEmployee.setPhoneNo(phoneNo);
//				System.out.println("Employee phone updated.." + phoneNo);
//				entityManager.getTransaction().commit();
//				
//			}else {
//				System.out.println("Employee with the id "+ employeeID + " doesn't exists.");
//			}
//			
//			entityManager.close();
//			entityManagerFactory.close();
//		} catch (Exception e) {
//			System.out.println("Oops! Something went wrong cant update employee phone");
//		}
//		
//	}
//
//	@Override
//	public void removeEmployee(int employeeID) {
//		try {
//			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPAUsinJPQL");
//			EntityManager entityManager = entityManagerFactory.createEntityManager();
//			
//			
//			entityManager.getTransaction().begin();
//			Employee foundEmployee = entityManager.find(Employee.class, employeeID);
//			if (foundEmployee!=null) {
//			entityManager.remove(foundEmployee);
//			System.out.println("Employee removed successfully.." + foundEmployee);
//			entityManager.getTransaction().commit();
//			}else {
//				System.out.println("Employee with the id "+ employeeID + " doesn't exists.");
//			}
//			entityManager.close();
//			entityManagerFactory.close();
//		} catch (Exception e) {
//			System.out.println("Oops! Something went wrong cant remove employee ");
//		}
//		
//	}
//
//	@Override
//	public void getAllEmployees() {
//		
//		try {
//			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPAUsinJPQL");
//			EntityManager entityManager = entityManagerFactory.createEntityManager();
//			
//			
//			Query query = entityManager.createQuery("Select e from Employee e");
//			List<Employee> employees = query.getResultList();
//			
//			for(Employee e: employees) {
//				System.out.println(e.toString());
//			}
//			
//			entityManager.close();
//			entityManagerFactory.close();
//		} catch (Exception e) {
//			System.out.println("Oops! Something went wrong cant remove employee ");
//		}
//	
//	}
//
//	@Override
//	public void getEmployeesNamedQuery(int inputID) {
//		// TODO Auto-generated method stub
//		
//	}

}
