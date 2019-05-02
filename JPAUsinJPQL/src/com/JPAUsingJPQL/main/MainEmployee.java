package com.JPAUsingJPQL.main;

import com.JPAUsingJPQL.entities.Employee;
import com.JPAUsingJPQL.services.EmployeeDao;
import com.JPAUsingJPQL.services.EmployeeDaoImpl;

public class MainEmployee {

	public static void main(String[] args) {
		
		EmployeeManagement em = new EmployeeManagement();
		
		//Employee Managemant
//		em.menuEmployee();
		em.findEmployee();
		
	}

}
