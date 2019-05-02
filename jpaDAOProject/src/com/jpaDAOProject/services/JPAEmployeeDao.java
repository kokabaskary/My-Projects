package com.jpaDAOProject.services;

import java.util.List;

import com.jpaModelProject.entities.Employee;

public interface JPAEmployeeDao {
	
	
	
	public  void addEmployee(Employee newEmployee);
	
	public  Employee fetchEmployee(int employeeID);

	public  List<Employee> fetchAllEmployees();
	
	public void updateEmployee(int employeeID, String phoneNo);

	public  void removeEmployee(int employeeID);


}
