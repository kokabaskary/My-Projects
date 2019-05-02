package courseList;

public class MainRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Course c1 = new Course();
		c1.setCourseId(1);
		c1.setCourseName("Java");
		c1.printCourseDetails();
		
		System.out.println("\n**********************************************\n");
		Course c2 = new Course();
		c2.setCourseId(2);
		c2.setCourseName("Python");
		c2.printCourseDetails();
		
//		System.out.println(c1.getCourseId());
//		System.out.println(c1.getCourseName());
//		System.out.println(c1.getInstructorName());

	}

}
