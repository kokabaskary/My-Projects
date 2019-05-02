package fileHandler;

import java.util.ArrayList;

public class MainRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String location = "/Users/ahmshahparan/eclipse-workspace/JavaConditional/src/fileHandler/text.txt";
		 ArrayList<Employee> empList = MyFileReader.fileReader(location);
		 for(Employee emp : empList) {
		 //System.out.println(line);
		 System.out.println(emp.toString());
		 }
		 
		 Employee emp1 = new Employee(003, "Lucy", "San Jose");
		 Employee emp2 = new Employee(004, "David", "San Jose");
		 Employee emp3 = new Employee(005, "Kevin", "San Jose");
		 empList.add(emp1);
		 empList.add(emp2);
		 empList.add(emp3);
		 
		 //Hashing
		 String str = "12345";
		 int hcode = str.hashCode();
		 
		 
		 MyFileWriter.fileWriter(location, empList);
		 }
		
	}


