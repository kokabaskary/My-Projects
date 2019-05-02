package studentCourses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainRunner {
	

	public static void main(String[] args) {
		
		
		
		Course c1 = new Course(1, "Core Java");
		Course c2 = new Course(2, "Python");
		Course c3 = new Course(3, "HTML");
		
		List<Course> l1 = new ArrayList<Course>();
		l1.add(c2);
		l1.add(c3);
		
		StudentC s1 = new StudentC(1, "Maria", l1);
		s1.printStudent();
		Scanner scan = new Scanner(System.in);
		System.out.println("Which courses you want to drop?");
		String dropCourse = scan.nextLine();
		
		
		
		s1.dropCourse(dropCourse);
		s1.printStudent();
		
		scan.close();
	}
	
	

}
