package com.jpaAdvanceMapping.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jpaAdvanceMapping.entities.JoinTableNonTeachingStaff;
import com.jpaAdvanceMapping.entities.JoinTableTeachingStaff;
import com.jpaAdvanceMapping.entities.NonTeachingStaff;
import com.jpaAdvanceMapping.entities.Staff;
import com.jpaAdvanceMapping.entities.StaffJoinTable;
import com.jpaAdvanceMapping.entities.TeachingStaff;

public class StaffServiceImpl implements StaffService{

	
		
	
	
	


	@Override
	public void createSingleTableTeaching(TeachingStaff newTStaff) {
	
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpaAdvanceMapping");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
	
		entityManager.getTransaction().begin();
		
//		//insert into table name
		entityManager.persist(newTStaff);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
		
	}

	@Override
	public void createSingleTableNonTeaching(NonTeachingStaff newNTStaff) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpaAdvanceMapping");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
	
		entityManager.getTransaction().begin();
		
//		//insert into table name
		entityManager.persist(newNTStaff);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
		
	}

	@Override
	public void createJoinTableTeaching(JoinTableTeachingStaff newJoinTStaff) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpaAdvanceMapping");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
	
		entityManager.getTransaction().begin();
		
//		//insert into table name
		entityManager.persist(newJoinTStaff);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
		
	}

	@Override
	public void createJoinTableNonTeaching(JoinTableNonTeachingStaff newJoinNTStaff) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpaAdvanceMapping");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
	
		entityManager.getTransaction().begin();
		
//		//insert into table name
		entityManager.persist(newJoinNTStaff);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
		
	}

}
