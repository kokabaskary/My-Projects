package com.bookStoreJpaOrmJpql.services;

import java.util.ArrayList;
import java.util.List;

import javax.naming.ldap.ManageReferralControl;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.bookStoreJpaOrmJpql.dao.BookStoreDAOI;
import com.bookStoreJpaOrmJpql.entities.BookStore;
import com.bookStoreJpaOrmJpql.entities.Customer;

import oracle.jdbc.pooling.Factory;

public class BookStoreService implements BookStoreDAOI{
	
	EntityManagerFactory factory  = Persistence.createEntityManagerFactory("loginFormJpaJunit");
	EntityManager manager = factory.createEntityManager();
	
	public void saveBook(BookStore book) {
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		manager.persist(book);
		tx.commit();
	}

	@Override
	public void addNewBooks(int bId, String bTitle) {
		BookStore book = new BookStore();
		book.getbId();
		book.getbTitle();
		saveBook(book);
		
		
	}

	@Override
	public BookStore findBook(int bId) {
		
		BookStore findBook = manager.find(BookStore.class, bId);
		return findBook;
	}

	@Override
	public List<BookStore> findAllBooks() {
		Query query = manager.createQuery("SELECT b FROM BookStore b");
		List<BookStore> bookList = query.getResultList();
		for (BookStore book : bookList) {
			System.out.println(book.toString());
			
		}
		System.out.println("###############################################");
		return bookList;
		
	}

	@Override
	public List<BookStore> getBooks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookStore getBook(int bId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateBook(int bID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeBook(int bID) {
		// TODO Auto-generated method stub
		
	}
	public  void closeManagerAndFactory() {
		manager.close();
		factory.close();
	}
	
	
//
//	@Override
//	public void addNewBooks() {
//		try {
//			EntityManagerFactory factory = Persistence.createEntityManagerFactory("bookStoreJpaOrmJpql");
//			EntityManager manager = factory.createEntityManager();
//			
////			manager.getTransaction().begin();
////			BookStore book1 = new BookStore(01, "ORM", "Mike Andrew", 1999, "0-123-4567");
////			manager.persist(book1);
////			
////			BookStore book2 = new BookStore(02, "OOPS", "Arthor Max", 2015, "0-456-8887");
////			manager.persist(book2);
////			
////			BookStore book3 = new BookStore(03, "JDBC", "Linda Chu", 2003, "0-564-8285");
////			manager.persist(book3);
////			
////			BookStore book4 = new BookStore(04, "JPA ", "Hailey Matts", 2007, "0-987-1234");
////			manager.persist(book4);
////			
////			BookStore book5 = new BookStore(05, "Spring MVC ", "Mohammad Ameen", 2010, "0-721-0876");
////			manager.persist(book5);
//			
//			List<BookStore>  bList = new ArrayList<BookStore>();
//			bList.add(book1);
//			bList.add(book2);
//			bList.add(book3);
//			bList.add(book4);
//			bList.add(book5);
//			System.out.println("Books were added successfully");
//			for (BookStore bookStore : bList) {
//				bookStore.printBook();
//				
//				
//			}
//			
//			
//			
//			manager.getTransaction().commit();
//			manager.close();
//			factory.close();
//			
//		} catch (Exception e) {
//			System.out.println("OOPS!!!! something went wrong  cannot add books.");
//		}
//		
//	}
//
//	@Override
//	public BookStore findBook(int bID) {
//		
//		try {
//			EntityManagerFactory factory = Persistence.createEntityManagerFactory("bookStoreJpaOrmJpql");
//			EntityManager manager = factory.createEntityManager();
//			
//			manager.getTransaction().begin();
//			
//			Query query = manager.createQuery("SELECT b FROM BOOKSTORE b Where b.bId = : givenId");
//			query.setParameter("givenId", bID);
//			
//			List<BookStore> foundBook = query.getResultList();
//			
//			
//			for (BookStore bookStore : foundBook) {
//				bookStore.printBook();
//			}
//			
//			manager.getTransaction().commit();
//			manager.close();
//			factory.close();
//			
//		} catch (Exception e) {
//			System.out.println("OOPS!!!! something went wrong  cannot find the book.");
//		}
//		return null;
//	}
//
//	@Override
//	public BookStore findAllBooks() {
//		try {
//			EntityManagerFactory factory = Persistence.createEntityManagerFactory("bookStoreJpaOrmJpql");
//			EntityManager manager = factory.createEntityManager();
//			
//			manager.getTransaction().begin();
//			
//			Query query = manager.createQuery("SELECT b FROM BOOKSTORE b");
//			
//			List<BookStore> foundBook = query.getResultList();
//			
//			
//			for (BookStore bookStore : foundBook) {
//				bookStore.printBook();
//			}
//			
//			manager.getTransaction().commit();
//			manager.close();
//			factory.close();
//			
//		} catch (Exception e) {
//			System.out.println("OOPS!!!! something went wrong  cannot List the books.");
//		}
//		return null;
//	}
//
//	@Override
//	public void updateBook(int bID) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void removeBook(int bID) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
////	public void addNewCustomer(List<BookStore> cbook) {
//	public void addNewCustomer() {
////		try {
//			EntityManagerFactory factory = Persistence.createEntityManagerFactory("bookStoreJpaOrmJpql");
//			EntityManager manager = factory.createEntityManager();
//			
//			manager.getTransaction().begin();
//			
//			BookStore book10 = new BookStore(010, "ORM", "Mike Andrew", 1999, "0-123-4567");
//			manager.persist(book10);
//			
//			BookStore book23 = new BookStore(023, "OOPS", "Arthor Max", 2015, "0-456-8887");
//			manager.persist(book23);
//			List<BookStore>  cList1 = new ArrayList<BookStore>();
//			cList1.add(book10);
//			cList1.add(book23);
//			
//			
//			Customer customer1 = new Customer(1, "AA", "my add", cList1);
//			manager.persist(customer1);
//			//-------------------------------------------------------------------------------
//			BookStore book48 = new BookStore(48, "JPA ", "Hailey Matts", 2007, "0-987-1234");
//			manager.persist(book48);
//			
//			BookStore book55 = new BookStore(55, "Spring MVC ", "Mohammad Ameen", 2010, "0-721-0876");
//			manager.persist(book55);
//			
//			List<BookStore>  custBookList2 = new ArrayList<BookStore>();
//			custBookList2.add(book48);
//			custBookList2.add(book55);
//			
//			Customer customer2 = new Customer(2, " Askary", "123 Address", custBookList2);
//			manager.persist(customer2);
//			
//			List<Customer>  cList = new ArrayList<Customer>();
//			cList.add(customer1);
//			cList.add(customer2);
//			
//			System.out.println("Customers were added successfully");
//			for (Customer cust : cList) {
//				cust.printCustomer();
//			}
//			
//			manager.getTransaction().commit();
//			manager.close();
//			factory.close();
//			
////		} catch (Exception e) {
////			System.out.println("OOPS!!!! something went wrong  cannot add books.");
////		}
//		
//	}
//
//	@Override
//	public Customer findCustomer(int cID) {
//		EntityManagerFactory factory = Persistence.createEntityManagerFactory("bookStoreJpaOrmJpql");
//		EntityManager manager = factory.createEntityManager();
//		
//		Customer foundCustomer = manager.find(Customer.class, cID);
////		Query query = manager.createQuery("Select c from Customer c Where c.cId = :givenId");
////		query.setParameter("givenId", cID);
////		List<Customer> findCustomer = query.getResultList();
////		
//		foundCustomer.printCustomer();
//		
//		return foundCustomer;
//	}

	

	

}
