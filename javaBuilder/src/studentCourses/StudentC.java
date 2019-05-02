package studentCourses;

import java.util.List;

public class StudentC {
	int sId;
	String sName;
	List<Course> sCourses;
	
	public StudentC( int sId, String sName,List<Course> sCourses ) {//constructor
		
		this.sId = sId;
		this.sName = sName;
		this.sCourses = sCourses;
	}
	
	void printStudent() {
		System.out.println(sId);
		System.out.println(sName);
		for(Course c: sCourses) {
			System.out.println(c.cName);
		}
	}
	

	void dropCourse(String dropCourse) {
		for(int i=0; i<sCourses.size();i++) {
			System.out.println("for: " + sCourses.get(i).cName);
		if(sCourses.get(i).cName.equals(dropCourse)) {
			
			sCourses.remove(sCourses.get(i));
			break;
			}else {
				System.out.println("The course you are trying to drop is not in your list");
			}}
	}

}
