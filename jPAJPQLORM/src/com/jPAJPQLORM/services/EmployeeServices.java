package com.jPAJPQLORM.services;

import java.util.List;

import com.jPAJPQLORM.entities.Employee;

public interface EmployeeServices {
	
	public void createEmployee(Employee newEmployee);
	
	public void findAllEmployees();
	
	public void findEmployee(int eId);
	
	public List<Employee> findEmployeeByNamedQuery(int eId);

}
