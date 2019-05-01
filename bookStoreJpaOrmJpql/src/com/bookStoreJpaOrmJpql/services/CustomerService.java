package com.bookStoreJpaOrmJpql.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.bookStoreJpaOrmJpql.dao.CustomerDAOI;
import com.bookStoreJpaOrmJpql.entities.BookStore;
import com.bookStoreJpaOrmJpql.entities.Customer;

public class CustomerService implements CustomerDAOI{

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("loginFormJpaJunit");
	EntityManager manager = factory.createEntityManager();
	
	public void saveCustomer(Customer customer) {
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		manager.persist(customer);
		tx.commit();
	}
	
	
	@Override
	public void addCustomer(int cId, String cName, String eMail) {
		Customer customer1 = new Customer();
		customer1.setcId(cId);
		customer1.setcName(cName);
		customer1.setcEmail(eMail);
		saveCustomer(customer1);
		
	}

	@Override
	public Customer findCustomer(int cId) {
		Customer customer = manager.find(Customer.class, cId);
		 
		return customer;
	}

	@Override
	public List<Customer> findAllCustomers() {
		
		Query query = manager.createQuery("SELECT c FROM Customer c");
		List<Customer> customerList = query.getResultList();
		for (Customer customer : customerList) {
			System.out.println(customer.toString());
			
		}
		System.out.println("###############################################");
		return customerList;
	}

	@Override
	public void removeCustomer(int cId) {
		
		manager.getTransaction().begin();
		Customer customer = manager.find(Customer.class, cId);
		manager.remove(customer);
		manager.getTransaction().commit();
		System.out.println("Customer removed with id: "+cId);

		
	}

	@Override
	public void addProductToCustomer(int cId, int bId) {
		
			BookStore bStore = manager.find(BookStore.class, bId);
			Customer customer = findCustomer(cId);
			List<BookStore> bList = customer.getcBookList();
			
			if(bList.contains(bStore)) {
				System.out.println("You've ordered the product already!");
			}else {
				customer.getcBookList().add(bStore);
				saveCustomer(customer);
			}
	}

	@Override
	public void getCustomerProducts(int cId) {
		Customer customer = manager.find(Customer.class, cId);
		List<BookStore> custBookList = customer.getcBookList();
		
		System.out.println("Customer ID: "+customer.getcId());
		for(BookStore product : custBookList) {
			System.out.println(product.toString());
			System.out.println("++++++++++++++++++++++");

	}}
		
		public  void closeManagerAndFactory() {
			manager.close();
			factory.close();
		}
		
		
	}


