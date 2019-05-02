package bookLibrary;

import java.util.List;

import studentCourses.Course;

public class AuthorList {
	
	int aId;
	String aName;
	String aEmail;
	static List<BookList> aBooks;
	
	//creating constructor for author
	
	public AuthorList(int aId, String aName, String aEmail, List<BookList> aBooks) {
		this.aId = aId;
		this.aName = aName;
		this.aEmail= aEmail;
		this.aBooks = aBooks;
	}
	
	public void printAuthor() {
		System.out.println("The Author name is :" +aName);
		System.out.println(aId);
		System.out.println(aEmail);
		
		for(BookList b: aBooks) {
			System.out.println(b.bName);
		}
	}
	
	//method for finding author from list
	   public static void findAuthor(String author, List<AuthorList> authorLists) {
		boolean found = false;
		AuthorList authorFound = null;
		for(int i=0; i<authorLists.size();i++) {
			if(authorLists.get(i).aName.equals(author)) {
				found=true;
				authorFound = authorLists.get(i);
			}
		}
		
		if(found) {
			System.out.println("Author name: "+authorFound.aName);
			System.out.println(author +": The books by the author are listed below: \n");
			for(BookList book : authorFound.aBooks) {
				System.out.println(book.bName+ " \n");
			}
			
		}else {
			System.out.println(author + " : Not Found");
			found=false;
		
		}
		
		
	}
	
	public static  void dropBook(String dropBook, List<BookList> bList) {
//		boolean deleted =false;
//		BookList bookRemoved = null;
		
//		for(int i=0; i<bList.size();i++) {
		for(int i=bList.size()-1; i>=0;i--) {
		if(!bList.get(i).bName.equals(dropBook)) {
			continue;
		}else {
			
			bList.remove(aBooks.get(i));
			System.out.println("Book  with name: "+ bList.get(i).bName);
//			deleted =true;
//			break;
		}
//			}else {
//				
//				System.out.println("The book you are trying to drop is not in your list");
//			}
//		for(BookList book : bookRemoved.bName) {
//			System.out.println(book.bName+ " \n");
//		}
		}
		
		
	}
	

}
