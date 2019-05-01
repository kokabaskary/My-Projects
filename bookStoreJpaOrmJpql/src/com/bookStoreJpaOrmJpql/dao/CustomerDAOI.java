package com.bookStoreJpaOrmJpql.dao;

import java.util.List;

import com.bookStoreJpaOrmJpql.entities.Customer;

public interface CustomerDAOI {
	
	public void addCustomer(int cId, String cName, String eMail);
	
	public Customer findCustomer(int cId);
	
	public List<Customer> findAllCustomers();
	
	public void removeCustomer(int cId);
	
	public void addProductToCustomer(int cId, int pId);
	
	public void getCustomerProducts(int cId);
}
