package com.jpaSampleProject.main;

import com.jpaSampleProject.entities.Employee;
import com.jpaSampleProject.services.EmployeeService;

public class MainRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello world");
		
		Employee vEmployee  = new Employee();//instianciated employee instance
		
		vEmployee.setEmployeeID(101);
		vEmployee.setFirstName("Mike");
		vEmployee.setLastName("Jack");
		vEmployee.setPhoneNo("1234567891");
		
		//testing find an employee
//		vEmployee = EmployeeService.findEmployee(10);
		EmployeeService.createEmployee(vEmployee);
//		EmployeeService.findEmployee(10);
//		EmployeeService.updateEmployee(103, "9876543210");
		
//		EmployeeService.removeEmployee(101);
	
		
	}

}
