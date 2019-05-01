package com.schoolManagementProject.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.eclipse.persistence.annotations.PrimaryKey;

@Entity
@Table

public class TeacherManyToOne {

	@Id
	private int eId;
	private String eName;
	private double salary;
	
	@ManyToOne
	private DepartmentManyToOne department;
	
	public TeacherManyToOne() {
		super();
	}

	public TeacherManyToOne(int eId, String eName, double salary, DepartmentManyToOne department) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.salary = salary;
		this.department = department;
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

	public DepartmentManyToOne getDepartment() {
		return department;
	}

	public void setDepartment(DepartmentManyToOne department) {
		this.department = department;
	}
	
	
	
}
