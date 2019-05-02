/**
 * 
 */
package javaBuilder;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author kokab.askary
 *
 */
public class RechargerITer {

	String name;
	String commitId;
	String email;
	String buddyName;
	String awsID;
	String bLine;
	int javaKBAScore;
	
	//creating constructor for students
	RechargerITer(String name,String commitId,int javaKBAScore){
		this.name = name;
		this.commitId =commitId;
		this.javaKBAScore = javaKBAScore;
		}
	
	//creating constructor for instructors
		RechargerITer(String name,String email,String awsID){
			this.name = name;
			this.email =email;
			this.awsID = awsID;
			}
		
		//default constructor
		public RechargerITer() {
			// TODO Auto-generated constructor stub
		}
		
		int  add(int x, int y) {//method overloading
			return x+y;
		}
		int  add(int x, int y, int z) {
			return x+y+z;
		}
	
	public static void printMe(RechargerITer obj) {
		System.out.println("Name: "+obj.name);
		System.out.println("Commit ID: "+obj.commitId);
		System.out.println("Email: "+obj.email);
		System.out.println("Buddy Name: "+obj.buddyName);
		System.out.println("BeeLine: "+obj.bLine);
		System.out.println("AWS ID: "+obj.awsID);
		System.out.println("Java KBA Score"+obj.javaKBAScore);
		System.out.println();//print a new line
	}
	
	public  void printMe() {//non static method
		System.out.println("Name: "+ name+ "\n"+"Commit ID: "+commitId +"\n"+ "Email: "+ email
				+"\n"+"Buddy Name: "+ buddyName +"\n"+ "BeeLine: "+ bLine+ "\n"+
				"AWS ID: "+ awsID +"\n" + "Java KBA Score: "+javaKBAScore);
	}
	
	//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RechargerITer kokab = new RechargerITer("Kokab Askary","ADCBQ3J",100);
		kokab.name = "Aelya Askary";//this will overwrite the name declared via constructor
		kokab.email = "kokab.askary@bnymellon,com";
		kokab.buddyName = "Malaka";
		kokab.bLine = "ADCBQ3J";
		kokab.awsID = "kokab.askary";
//		kokab.javaKBAScore = 100;
		printMe(kokab);//calling static method
		
		System.out.println("\n****************Institating instructor ********************\n");
		
		RechargerITer inst1 = new RechargerITer("Instructo1", "ins1@perscholas", "instASD");
		inst1.printMe();
		
		System.out.println("\n****************Non-static Method********************\n");
		kokab.printMe();//non-static method
		
		System.out.println("\n****************Static Method Shahida********************\n");
		RechargerITer Shahida = new RechargerITer("Shahida lucky","ADCBQ3J",100);
		Shahida.email = "shahida.lucky@bnymellon,com";
		Shahida.buddyName = "Malaka";
		Shahida.bLine = "ADCBQ3J";
		Shahida.awsID = "Shahida Lucky";
		printMe(Shahida);
		System.out.println("\n****************Non-static Method Shahida********************\n");
		Shahida.printMe();
		
		System.out.println("\n**************** Arrays********************\n");
		//Putting the students in array
		RechargerITer[] plist = new RechargerITer[25];
		
		plist[0]= kokab;
		plist[1] = Shahida;
		
		for(int i=0; i<2;i++) {
			plist[i].printMe();
		}
		
		
		

	}
}


