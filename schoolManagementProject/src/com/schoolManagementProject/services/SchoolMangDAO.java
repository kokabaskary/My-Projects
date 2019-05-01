package com.schoolManagementProject.services;

import com.schoolManagementProject.entities.DepartmentManyToOne;
import com.schoolManagementProject.entities.TeacherManyToOne;

public interface SchoolMangDAO {
	
//	public void createTeacherDepartment(Teacher newTeacher, Department newDepartment);
	public void createTeacherDepartmentManyToOne();
	public void createTeacher1Department1OneToMany();
	
	public void createTeacherCredential1OneToOne();
	
//	public void createDepartment();

}
