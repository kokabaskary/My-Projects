package com.schoolManagementProject.services;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.schoolManagementProject.entities.CredentialsOneToOne;
import com.schoolManagementProject.entities.DepartmentManyToOne;
import com.schoolManagementProject.entities.DepartmentOneToMany;
import com.schoolManagementProject.entities.TeacherManyToOne;
import com.schoolManagementProject.entities.TeacherOneToMany;

public class SchoolMangDAOImpl implements SchoolMangDAO {

	@Override
//	public void createTeacherDepartment(Teacher newTeacher, Department newDepartment) {
	public void createTeacherDepartmentManyToOne() {
		//1
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("schoolManagementProject");
		EntityManager manager = factory.createEntityManager();
		
		
		//2
		manager.getTransaction().begin();
		DepartmentManyToOne dept1 = new DepartmentManyToOne(1, "Test Department");
		manager.persist(dept1);
		
		TeacherManyToOne teacher1 = new TeacherManyToOne(1, "Mike", 60000, dept1);
		manager.persist(teacher1);
		
		TeacherManyToOne teacher2 = new TeacherManyToOne(2, "Bairon", 80000, dept1);
		manager.persist(teacher2);
		
		manager.getTransaction().commit();
		
		//3
		manager.close();
		factory.close();
		
		
		
	}
	
	
	@Override
	public void createTeacher1Department1OneToMany() {
		
		//1
				EntityManagerFactory factory = Persistence.createEntityManagerFactory("schoolManagementProject");
				EntityManager manager = factory.createEntityManager();
				
				
				//2
				manager.getTransaction().begin();
				
				
				TeacherOneToMany teacher1 = new TeacherOneToMany(1, "Mike", 60000);
				manager.persist(teacher1);
				
				TeacherOneToMany teacher2 = new TeacherOneToMany(2, "Bairon", 80000);
				manager.persist(teacher2);
				
				List<TeacherOneToMany> teacherList = new ArrayList<TeacherOneToMany>();
				teacherList.add(teacher1);
				teacherList.add(teacher2);
 				
				DepartmentOneToMany dept1 = new DepartmentOneToMany(1, "Test Department", teacherList);
				manager.persist(dept1);
				
				manager.getTransaction().commit();
				
				//3
				manager.close();
				factory.close();
		
	}


	@Override
	public void createTeacherCredential1OneToOne() {
		//1
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("schoolManagementProject");
		EntityManager manager = factory.createEntityManager();
		
		
		//2
		manager.getTransaction().begin();
		
		
		TeacherOneToMany teacher1 = new TeacherOneToMany(1, "Mike", 60000);
		manager.persist(teacher1);
		
		TeacherOneToMany teacher2 = new TeacherOneToMany(2, "Bairon", 80000);
		manager.persist(teacher2);
		
		CredentialsOneToOne credential1 = new CredentialsOneToOne(1, "Mike","pass123");
		manager.persist(credential1);
		
		CredentialsOneToOne credential2 = new CredentialsOneToOne(2, "Bairon","NoPassword");
		manager.persist(credential2);
		
		manager.getTransaction().commit();
		
		//3
		manager.close();
		factory.close();

		
	}

	

}
