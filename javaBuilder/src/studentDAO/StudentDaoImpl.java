package studentDAO;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

	// list is working as a database
	List<Student> students;

	public StudentDaoImpl() {
		students = new ArrayList<Student>();
		Student student1 = new Student("Max", 0);
		Student student2 = new Student("Maria", 1);
		students.add(student1);
		students.add(student2);
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return students;
	}

	@Override
	public Student getStudent(int rollNo) {
		// TODO Auto-generated method stub
		Student lookup = students.get(rollNo);
		return lookup;

	}

	@Override
	public void updateStudent(Student student, String name) {
		// TODO Auto-generated method stub
		students.get(student.getRollNo()).setName(name);
		System.out.println("Student: Roll No " + student.getRollNo() + ", updated in the database with name: " + name);
	}

	@Override
	public void deleteStudent(int rollNo) {
		// TODO Auto-generated method stub
		 students.remove(rollNo);
	        System.out.println("Student: deleted from database with roll no: "+ rollNo);
	}

}
