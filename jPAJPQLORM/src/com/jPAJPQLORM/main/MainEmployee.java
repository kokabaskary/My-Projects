package com.jPAJPQLORM.main;

import java.util.List;
import java.util.Scanner;

import com.jPAJPQLORM.entities.Employee;
import com.jPAJPQLORM.services.EmployeeServiceImpl;
import com.jPAJPQLORM.services.EmployeeServices;

public class MainEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeServices eS = new EmployeeServiceImpl();
		Employee newEmp = new Employee(121, "Aelya", "Askary", "123-456-7890");
		eS.createEmployee(newEmp);
		eS.findAllEmployees();//finding all employees without parameter		
		
//		 ask user for employee id
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter the ID for the employee you wnat details about?");
				int userinputid = scan.nextInt();
				
				eS.findEmployee(userinputid);//finding employee with parameter
				
				eS.findEmployeeByNamedQuery(userinputid);//searching by named query
//				
				List<Employee> employees = eS.findEmployeeByNamedQuery(userinputid);
//				
//				//user interface method
				for(Employee e: employees) {
					e.printEmployee();
				}
	}

}
