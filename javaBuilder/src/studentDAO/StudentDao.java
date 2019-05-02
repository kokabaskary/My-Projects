package studentDAO;

import java.util.List;


public interface StudentDao {
	
	public List<Student> getAllStudents();
	
	public Student getStudent(int rollNo);

	public void updateStudent(Student student, String name);
	
	public void deleteStudent(int rollNo);
	
	
	
}
