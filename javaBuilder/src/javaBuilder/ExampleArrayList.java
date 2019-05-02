/**
 * 
 */
package javaBuilder;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * @author kokab.askary
 *
 */
public class ExampleArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		List students = new ArrayList<>();//non generic arraylist i.e can take different data types
		
		List<String> students = new ArrayList<String>();
		students.add("Vernon");
		students.add("Lucy");
		students.add("Lucy");//can have duplicate values
		System.out.println(students);
		
		students.remove("Lucy");//removing from list
		System.out.println(students.size());
		System.out.println(students);
		
		students.add(0, "Nilda");//adding element based on index
		System.out.println(students);
		
		students.add(1, "Shahparan");
		System.out.println(students);
		
		
		System.out.println(students.get(0));//getting element by index
		System.out.println(students.indexOf("Nilda"));//getting index by element
		System.out.println(students.contains("Shahparan"));//boolean to chk if element exists
		
		students.add(1, "Shahparan");
		System.out.println(students);
		
		
		System.out.println(students.lastIndexOf("Shahparan"));//if have duplicate
		
		
		System.out.println(students.set(1, "Marcial"));//this will remove Shahapran and print the element removed
		
		System.out.println("List :"+students);
		
		//List to array conversion
//		String[] arr = new String[5];//the size of the array should be same or more than 
		//size of list
		String[] arr = new String[students.size()];
		System.out.println(students.toArray(arr));
		System.out.println("List to Arrays: "+Arrays.toString(arr));
		
		//Array to List Conversion
		
		List<String> newList = new ArrayList<>();
		newList = Arrays.asList(arr);
		System.out.println("Arrays to List : "+ newList);
		
		//List is only for objects not primitive data type
		
//		int[] numbers = {1,2,3,4,5};
		Integer[] numbers = {1,2,3,4,5};
		List<Integer> numList = new ArrayList<>();
		numList = Arrays.asList(numbers);//type mismatch to over come use wrapper class
		System.out.println("int to List: "+ numList);
		
		char a = 'a'; //converting primitive char to Character object
		Character b = a;
		
		a=b;
		
		//Wrapper class -> Primitive ==> Un-boxing
		//Primitive ==> Wrapper Class ==> Boxing
		
		//Removing All elements
//		students.clear();
		
		students.forEach(p -> {System.out.println(p);});//Java Lamda Expression
		
		System.out.println(students.isEmpty());//is list empty
		
		
		//Add list to list 
		System.out.println("###################################");
		List<String> instructor = new ArrayList<>();
		
		instructor.add("Shah");
		instructor.add("Young");
		
		students.addAll(instructor);
		System.out.println(students);
		
		System.out.println("###################################");
		//for having generic datatype all types of objects
		List<Object> rIT = new ArrayList<>();
		rIT.add(2);
		rIT.add("String");
		System.out.println(rIT);

}}
