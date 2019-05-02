package com.jpaModelProject.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "JPAEMPLOYEENEW")

public class Employee {
	
	@Id//for primary key
	@Column(name = "employeeID")
	private int employeeID;
	
	@Basic
	@Column(name = "firstName")
	private String firstName;
	
	@Basic
	@Column(name = "lastName")
	private String lastName ;
	
	@Basic
	@Column(name = "phoneNo")
	private String phoneNo;
	
	//constructors

	
	public Employee() {
		super();
	}

	public Employee(int employeeID, String firstName, String lastName, String phoneNo) {
		super();
		this.employeeID = employeeID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNo = phoneNo;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public void printEmployee() {
		System.out.println("Employee ID :" +getEmployeeID()+
				" , First Name : " + getFirstName()+ " , Last Name : " + getLastName()+
				", Phone Number : " +getPhoneNo());
	}
	
}
