package com.schoolManagementProject.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class DepartmentManyToMany {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)//for randomly generating primary key
	private int  dId;
	private String dName;
	
	public DepartmentManyToMany(int dId, String dName) {
		super();
		this.dId = dId;
		this.dName = dName;
	}
	
	public DepartmentManyToMany() {
		super();
		
	}

	public int getdId() {
		return dId;
	}

	public void setdId(int dId) {
		this.dId = dId;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}
	

}
