package bookLibrary;


import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class MainLibrary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		BookList book1 = new BookList(01, "Core Java",12345);
		BookList book2 = new BookList(02, "Data Structures", 54321);
		BookList book3 = new BookList(03, "Algorithms", 13468);
		BookList book4 = new BookList(04, "No Clue", 13456);
		
		
		//Book list of all books
		List<BookList> bList = new ArrayList<BookList>(Arrays.asList(book1, book2,book3, book4));

		
		//booklist of author 1
		List<BookList> bListA1 = new ArrayList<BookList>(Arrays.asList(book1, book2));

		
		//booklist of author 2
		List<BookList> bListA2 = new ArrayList<BookList>(Arrays.asList(book3, book4));

	
	
		
		AuthorList author1 = new AuthorList(01, "Elliot", "elliot@gmail.com",bListA1);
		AuthorList author2 = new AuthorList(02, "Allen", "allen@abc.com",bListA2);
		
		//List containing list of Author names
		List<AuthorList> authorLists = new ArrayList<AuthorList>(Arrays.asList(author1,author2));

				
//		author1.printAuthor();
//		author2.printAuthor();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Which Author books you want to see?");
		String auth = scan.nextLine();
		
		
		
//		for(int i =0; i<authorLists.size(); i++) {
//			AuthorList authorFound = null;
//			if(!authorLists.get(i).aName.equals(auth)) {
//				authorFound = authorLists.get(i);
//				continue;
//			}else {
//				System.out.println(authorLists.get(i).aName);
//				for (BookList list : authorFound.aBooks) {
//					System.out.println(list.bName);
//					
//				}
//			}
//		}
		AuthorList.findAuthor(auth, authorLists);
////	
		System.out.println("Which  book you want to remove?");
		String removeBook = scan.nextLine();
//		
//		for(int i=0; i<bListA1.size(); i++) {
//		if(!bListA1.get(i).bName.equals(removeBook)) {
//			System.out.println("kjshfhf");
//			continue;
//		}else {
////			
//			bListA1.remove(bListA1.get(i));
//			System.out.println("book removed with name: "+ bListA1.get(i).bName);
			
		AuthorList.dropBook(removeBook,bList);;
				
//		bListA1.dropBook(removeBook);
		
	}

}
