package courseList;

public class Course {
	
	private int courseId;
	private String courseName;
	private String instructorName;
	
	public Course(int courseId, String courseName) {
		// TODO Auto-generated constructor stub
		this.courseId= courseId;
		this.courseName = courseName;
	}
	public Course() {//default constructor
		
		
	}

	  String getInstructorName() {
		return instructorName;
	}
	int getCourseId() {
		return courseId;
	}

	 void setCourseId(int courseId) {
		this.courseId = courseId+ 99;
	}

	 String getCourseName() {
		return courseName;
		
	}

	 void setCourseName(String courseName) {
		this.courseName = courseName;
		if(this.courseName.equals("Java")) {
			this.instructorName = "Shahparan";
		}else if(this.courseName.equals("Python"))
		this.instructorName="Marcial";
	}
	 
	 void printCourseDetails() {
		 System.out.println(getCourseId());
			System.out.println(getCourseName());
			System.out.println(getInstructorName());
	 }
	

}
