package jpa.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import jpa.dao.StudentDAO;
import jpa.entitymodels.Course;
import jpa.entitymodels.Student;
import oracle.net.aso.c;
import oracle.net.aso.s;

public class StudentService implements StudentDAO {

	

	@Override
	public List<Student> getAllStudents() {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("SMS");// Establishing the connection to
		// database
		EntityManager manager = factory.createEntityManager();

		Query query = manager.createQuery("Select student From Student student");// querying database to get the list
																					// of
																					// all registered students
		try {

			List<Student> studentsList = query.getResultList();// getting the result set from the database

			for (Student student : studentsList) {// iterating to get all the values

				System.out.println(student.toString());// using override tostring method to print all students in the
														// list
			}
			return studentsList;
		} catch (Exception e) {
			System.out.println("Oops Something went wrong");
		}

		manager.close();
		factory.close();

		return null;
	}

	@Override
	public Student getStudentByEmail(String sEmail) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("SMS");// Establishing the connection to
		// database
		EntityManager manager = factory.createEntityManager();

		Student studentEmail = manager.find(Student.class, sEmail);

		if (studentEmail.equals(sEmail)) {
			System.out.println(studentEmail.toString());
			return studentEmail;

		}

		System.out.println("Student does not exist");
			manager.close();
			factory.close();
			return null;
	}

	@Override
	public boolean validateStudent(String sEmail, String sPassword) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("SMS");// Establishing the connection to
		// database
		EntityManager manager = factory.createEntityManager();
		
		Query validQuery  = manager.createQuery("SELECT s FROM Student s WHERE s.sEmail =:givenEmail and s.sPass=:givenPass");
		validQuery.setParameter("givenEmail", sEmail);
		validQuery.setParameter("givenPass",sPassword);
		
		if(validQuery !=null) {
			return true;
		}
//		Student s1 = new Student();
//		
//		List<Student> students = validQuery.getResultList();
		
		
//		try {
//			Student email = manager.find(Student.class, sEmail);
//			Student password = manager.find(Student.class, sPassword);
//			
//			if(email.equals(sEmail) && password.equals(sPassword)) {
//				return true;
//			}
//		} catch (Exception e) {
//			System.out.println("Some thing went wrong....");
//		}
		manager.close();
		factory.close();
		return false;
	}

	@Override
	public void registerStudentToCourse(String sEmail, int cId) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("SMS");// Establishing the connection to
		// database
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		
		
		Student student = manager.find(Student.class, sEmail);
		Course course = manager.find(Course.class, cId);
		
		List<Course> cList = student.getsCourses();
		
		if(cList.contains(course)) {
			System.out.println("You are a;ready Registered to  this course");
		}else {
			student.getsCourses().add(course);
		}
		
		manager.persist(student);
		manager.getTransaction().commit();

		manager.close();
		factory.close();
	}

	@Override//method to get the course list of a student 
	public List<Course> getStudentCourses(String sEmail) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("SMS");// Establishing the connection to
		// database
		EntityManager manager = factory.createEntityManager();

		try {
		Student student = manager.find(Student.class, sEmail);//finding student by email
		
		List<Course> courses = student.getsCourses();//finding the courses student is registered to
	
		for(Course c : courses) {//iterating and printing the courses student is registered.
			System.out.println(c.toString());
			}
		return courses;//return the course list.
		}catch (Exception e) {
			System.out.println("There was an error while reteriving data");
		}
		
		manager.close();
		factory.close();
		return null ;
		}
	
	
	
	
}
