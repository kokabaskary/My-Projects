package com.schoolManagementProject.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class TeacherManyToMany {

	
	@Id
	private int eId;
	private String eName;
	private double salary;
	
	
	public TeacherManyToMany(int eId, String eName, double salary) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.salary = salary;
	}
	
	public TeacherManyToMany() {
		super();
		
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
