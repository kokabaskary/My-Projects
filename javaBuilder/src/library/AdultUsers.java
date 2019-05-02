package library;

public class AdultUsers implements LibraryUser {

	
	int age;
	String bookType;
	
	public AdultUsers(int age, String bookType) {
		super();
		this.age = age;
		this.bookType = bookType;
	}

	public void registerAccount() {
		if(age>12) {
			System.out.println("You have successfully registered under an Adult account");
		}else if (age<=12) {
			System.out.println("Sorry age must be greater than 12 to register as an adult");
			
		}
		
		
	}

	
	public void requestBook() {
		if(bookType.equals("Fiction")) {
			System.out.println("Book issued successfully, Please return the book within 7 days");
		}else if(bookType.equals("Kids")) {
			System.out.println("Oops, you are allowed to take only adult Fiction books");
		}
	
		
	}

}
