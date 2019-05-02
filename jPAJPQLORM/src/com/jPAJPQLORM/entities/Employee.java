package com.jPAJPQLORM.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table (name = "JPAEMPLOYEENEW")
@NamedQuery(query="SELECT e FROM Employee e WHERE e.eId=:id", name ="Find Employee by ID")
public class Employee {

	@Id
	@Column(name = "employeeID")
	private int eId;
	
	@Basic
	@Column(name = "firstName")
	private String fName;
	
	@Basic
	@Column(name = "lastName")
	private String lName;
	
	@Basic
	@Column(name = "phoneNo")
	private String pNo;
	
	
	

	public Employee(int eId, String fName, String lName, String pNo) {
		super();
		this.eId = eId;
		this.fName = fName;
		this.lName = lName;
		this.pNo = pNo;
	}

	//default constructor
	public Employee() {
		super();
		
	}
	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getpNo() {
		return pNo;
	}

	public void setpNo(String pNo) {
		this.pNo = pNo;
	}
	
	public void printEmployee () {
		System.out.println("Employee with id: " +geteId()
			+ ", First name: " +getfName() + ", Last name: " 
				+getlName()+ ", phone: " +getpNo());
	}
	
}
