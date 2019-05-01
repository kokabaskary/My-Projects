package jpa.mainrunner;

import java.util.Scanner;

import jpa.dao.CourseDAO;
import jpa.dao.StudentDAO;
import jpa.entitymodels.Course;
import jpa.entitymodels.Student;
import jpa.service.CourseService;
import jpa.service.StudentService;


public class SMSRunner {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the School Management System");
		
		StudentDAO studentDAO = new StudentService();
		CourseDAO courseDAO = new CourseService();
		
		Course course = new Course();
		
		Scanner scanner = new Scanner(System.in);//user 
		System.out.println("Are You A \n"+ "1. Student \n" +"2. Quit \n" + "Please, Enter 1 or 2.");
		
		String input = scanner.nextLine();
		
		if(input.equals("1")) {//if user selects option 1.
			
			System.out.println("Enter Your Email:");
			String email = scanner.nextLine();
			
			System.out.println("Enter Your Password:");
			String password = scanner.nextLine();
			
			boolean valid = studentDAO.validateStudent(email, password);//validating if student credentials are valid
				if(valid) {//Student with valid credentials
					System.out.println("Welcome Student...\n" + "Your classes and instructors are listed below");
					System.out.println("My Classes:");
					
					studentDAO.getStudentCourses(email);//displaying the courses taken by the student
					System.out.println("1. Register To Class\n"+ "2.Logout");
					int option = scanner.nextInt();
				
//					//if student enter to registers
						if (option==1) {
							System.out.println("All Courses:");
							courseDAO.getAllCourses();//displaying all courses available 
							
							System.out.println("Which course you want to register to ?");
							int userOption = scanner.nextInt();
//							//if block to check if user is already registered to the course if not then register
								if(userOption==course.getcId() ) {
									System.out.println("You are already registered to this course!");
								}else {
									studentDAO.registerStudentToCourse(email, userOption);
									System.out.println("My Classes:");
									studentDAO.getStudentCourses(email);//updated student course list
									
								}
							System.out.println("Do you want to register more courses? \n"+
								"1.Yes \n"+ "2.NO");
							int register = scanner.nextInt();
								if (register==1) {
									
									
								} else if(register==2) {
									System.out.println("Thanks for registering See you again.");

								}
//						//---------------else for user to logout--------------
					} else if(option==2){//if student decides not to register sign out
						System.out.println("You are now logged out. Thanks for using SMS");

					}
//					
//			//--------------else of valid student credential-------------------------	
			}else {//students with invalid credentials
				System.out.println("Your Credentials did not match Please enter Valid Email and Password");
				
				
			}
//			
//	//---------------------------------else block of first if statement----------------------------------------------------		
		}else if (input.equals("2")) {//Quit the system if user selects option 2
			System.out.println("Thanks for using SMS School Management System");
			
		}
		
		

	}

}
