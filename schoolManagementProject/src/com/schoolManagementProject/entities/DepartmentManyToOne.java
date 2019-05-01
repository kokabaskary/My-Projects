package com.schoolManagementProject.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class DepartmentManyToOne {

	@Id
	private int  dId;
	private String dName;
	
	public DepartmentManyToOne() {
		super();
	}
	
	public DepartmentManyToOne(int dId, String dName) {
		super();
		this.dId = dId;
		this.dName = dName;
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
