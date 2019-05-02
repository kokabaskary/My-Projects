package com.JPAUsingJPQL.services;

import java.util.List;

import com.JPAUsingJPQL.entities.Employee;

public interface EmployeeDao {
	
	public void mainEmployee();

	public boolean createEmployee(Employee newEmployee);

	public boolean updateEmployeeBYId(int givenId);

	public boolean removeEmployee(int givenId);
	
	public Employee findEmployee(int employeeId);//if not found it will returns null
	
	public List<Employee> findAllEmployees();
	
	public void getEmployeesNamedQuery( int inputID);
	
	public void showEmployee(Employee employee);
	
	
	
}
