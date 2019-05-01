package jpa.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import jpa.dao.CourseDAO;
import jpa.entitymodels.Course;

public class CourseService implements CourseDAO {

	@Override
	public List<Course> getAllCourses() {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("SMS");//Establishing the connection to database
		EntityManager manager = factory.createEntityManager();
		
		Query query = manager.createQuery("Select course From Course course");//querying database to get the list of all available courses
		
		List<Course> courseList = query.getResultList();//getting the result set from the database
		
		for (Course course : courseList) {//iterating to  get all the values
			System.out.println(course.toString());//using override tostring method to print all courses in the list
		}
		//closing the database connection.
		manager.close();
		factory.close();
		
		return courseList;
	}

}
