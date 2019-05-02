package com.JPAUsingJPQL.main;

import java.util.Scanner;

import com.JPAUsingJPQL.entities.Employee;
import com.JPAUsingJPQL.services.EmployeeDao;
import com.JPAUsingJPQL.services.EmployeeDaoImpl;

public class EmployeeManagement {
	
	public void menuEmployee() {
		
		System.out.println("1. Enter New Employee");
		System.out.println("2. Search Employee");
		int choice = 1;
		switch (choice) {
		case 1:
			inputEmployee();
			break;
		case 2:
			findEmployee();
			break;

		default: break;
		}
	}
	
	public void inputEmployee() {
		//form to input the employee data
		
		//1 capture  employee data using scanner
		Employee vEmployee = new Employee(6, "kokab", "Askary", "123-456-7890");
		//2 store employee
	}
	
	public void createEmployee(Employee vEmployee) {
		
		
		EmployeeDao employeeDao = new EmployeeDaoImpl();
		//you may include business rule here ie validations

		employeeDao.createEmployee(vEmployee);
	}
	
	public void findEmployee() {
		EmployeeDao employeeDao = new EmployeeDaoImpl();

		
		for(int i =1; i<=5; i++) {
			int vGivenId = i;
			Employee employee = employeeDao.findEmployee(vGivenId);
			System.out.println("This is the Employee name=====>"+ employee.getFirstName());
		}
	}
}
