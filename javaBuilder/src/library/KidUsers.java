package library;

public class KidUsers implements LibraryUser {

	
	int age;
	String bookType;
	
	
	public KidUsers(int age, String bookType) {
		super();
		this.age = age;
		this.bookType = bookType;
	}


	public void registerAccount() {
		
		if(age<=12) {
			System.out.println("You have successfully registered under Kids account");
		}else if (age>12) {
			System.out.println("Sorry age must be less than 12 to register as a Kid");
			
		}
	}

	
	public void requestBook() {
		if(bookType.equals("Kids")) {
			System.out.println("Book issued successfully, Please return the book within 10 days");
		}else if(bookType.equals("Fiction")) {
			System.out.println("Oops, you are allowed to take only kids books");
		}
		
	}

}
