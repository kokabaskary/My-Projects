package com.jpaDAOProject.main;

import com.jpaDAOProject.services.JPAEmployeeDao;
import com.jpaDAOProject.services.JPAEmployeeDaoImpl;
import com.jpaModelProject.entities.Employee;


public class MainEmployee {

	public static void main(String[] args) {

		JPAEmployeeDao emp = new JPAEmployeeDaoImpl();		
//		Employee newEmployee  = new Employee(555, "Kokab", "Askary", "929-231-9074");
//		emp.addEmployee(newEmployee);
		// instianciated employee instance
		
//		emp.fetchEmployee(555);
		
//		emp.updateEmployee(120, "345-455-6789");
//		emp.removeEmployee(120);
		emp.fetchAllEmployees();

	}

}
