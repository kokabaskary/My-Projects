package com.bookStoreJpaOrmJpql.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Customer {
	
	@Id
	@Column(name= "Customer Id")
	private int cId;
	
	@Column(name= "Name")
	private String cName;
	
	@Column(name= "Email")
	private String cEmail;
	
	
	@OneToMany(targetEntity = BookStore.class)
	private List cBookList;


	public Customer() {
		super();
	}
	
	public Customer(int cId, String cName, String cEmail, List cBookList) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cEmail = cEmail;
		this.cBookList = cBookList;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcEmail() {
		return cEmail;
	}

	public void setcEmail(String cEmail) {
		this.cEmail = cEmail;
	}

	public List getcBookList() {
		return cBookList;
	}

	public void setcBookList(List cBookList) {
		this.cBookList = cBookList;
	}

	@Override
	public String toString() {
		return "Customer [cId=" + cId + ", cName=" + cName + ", cEmail=" + cEmail + ", cBookList=" + cBookList + "]";
	}

	
	
	
	
//	public void printCustomer() {
//		System.out.println("Customer ID: "+ getcId()+ ", Name:  " +getcName()+",  Address : "+
//							getcAddress());
////		+ ", Books Purchased :"+ getcBookList()
//	}

}
