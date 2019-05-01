package com.schoolManagementProject.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class DepartmentOneToMany {
	
	@Id
	private int dId;
	private String dName;
	
	@OneToMany(targetEntity= TeacherOneToMany.class)
	private List teacherList;

	public DepartmentOneToMany(int dId, String dName, List teacherList) {
		super();
		this.dId = dId;
		this.dName = dName;
		this.teacherList = teacherList;
	}
	
	public DepartmentOneToMany() {
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

	public List getTeacherList() {
		return teacherList;
	}

	public void setTeacherList(List teacherList) {
		this.teacherList = teacherList;
	}
	
}
