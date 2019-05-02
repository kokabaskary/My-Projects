package fileHandler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MyFileReader {
	
	public static ArrayList<Employee> fileReader(String location) {
		 
		 ArrayList <Employee> empList = new ArrayList<Employee>();
		 
		 try {
		 File file = new File(location);
		 Scanner input = new Scanner(file);
		 
		 //storing the lines in list
		 input.nextLine();
		 String line;
		 while(input.hasNextLine()) {
		 line = input.nextLine();
		 if(!line.equals("")) {
		 String[] lineArr = line.split(",");
		 empList.add(new Employee(Integer.parseInt(lineArr[0]), lineArr[1], lineArr[2]));
		 }
		 }
		 
		 } catch (FileNotFoundException e) {
		 System.out.println("File not found!");
		 }
		 catch (NumberFormatException e) {
		 System.out.println("Please check the ID format in the file!");
		 }
		 return empList;
		 }
}
