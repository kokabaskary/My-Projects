package com.bookStoreJpaOrmJpql.dao;

import java.util.List;

import com.bookStoreJpaOrmJpql.entities.BookStore;
import com.bookStoreJpaOrmJpql.entities.Customer;

public interface BookStoreDAOI {
	
	public void addNewBooks(int bId, String bName);
	
	public BookStore findBook(int bID);
	
	public List<BookStore> findAllBooks();
	
	public List<BookStore> getBooks();
	
	public BookStore getBook(int bId);

	
	public void updateBook(int bID);
	
	public void removeBook(int bID);
	
	


}
