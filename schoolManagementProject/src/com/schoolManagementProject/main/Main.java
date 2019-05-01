package com.schoolManagementProject.main;

import com.schoolManagementProject.services.SchoolMangDAO;
import com.schoolManagementProject.services.SchoolMangDAOImpl;

public class Main {

	public static void main(String[] args) {
	
		SchoolMangDAO school = new SchoolMangDAOImpl();
//		school.createTeacherDepartmentManyToOne();
		
//		school.createTeacher1Department1OneToMany();

		school.createTeacherCredential1OneToOne();
	}

}
