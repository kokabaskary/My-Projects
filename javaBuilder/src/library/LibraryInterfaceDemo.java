package library;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
	
		System.out.println("\n******************Kid 1************************\n");
		KidUsers kid1 = new KidUsers(10, "Kids");
		kid1.registerAccount();
		kid1.requestBook();
		
		System.out.println("\n******************Kid 2***********************\n");
		
		KidUsers kid2 = new KidUsers(18, "Fiction");
		kid2.registerAccount();
		kid2.requestBook();
		
		System.out.println("\n****************** Adult 1************************\n");
		
		AdultUsers adult1 = new AdultUsers(5, "Kids");
		adult1.registerAccount();
		adult1.requestBook();
		
		System.out.println("\n*****************Adult 2************************\n");
		
		AdultUsers adult2 = new AdultUsers(23, "Fiction");
		adult2.registerAccount();
		adult2.requestBook();

	}

}
