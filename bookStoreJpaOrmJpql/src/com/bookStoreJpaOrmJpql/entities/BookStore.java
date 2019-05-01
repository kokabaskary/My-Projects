package com.bookStoreJpaOrmJpql.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class BookStore {
	
	@Id
	@Column(name= "Id")
	private int bId;
	
	@Column(name= "Title")
	private String bTitle;
	
	@Column(name= "Author")
	private String bAuthor;
	
	@Column(name= "Publish Year")
	private int bPublishYear;
	
	
	
	public BookStore() {
		super();
	
	}
	
	public BookStore(int bId, String bTitle, String bAuthor, int bPublishYear) {
		super();
		this.bId = bId;
		this.bTitle = bTitle;
		this.bAuthor = bAuthor;
		this.bPublishYear = bPublishYear;
		
	}
	

	public int getbId() {
		return bId;
	}

	public void setbId(int bId) {
		this.bId = bId;
	}

	public String getbTitle() {
		return bTitle;
	}

	public void setbTitle(String bTitle) {
		this.bTitle = bTitle;
	}

	public String getbAuthor() {
		return bAuthor;
	}

	public void setbAuthor(String bAuthor) {
		this.bAuthor = bAuthor;
	}

	public int getbPublishYear() {
		return bPublishYear;
	}

	public void setbPublishYear(int bPublishYear) {
		this.bPublishYear = bPublishYear;
	}

	
	
	@Override
	public String toString() {
		return "BookStore [bId=" + bId + ", bTitle=" + bTitle + ", bAuthor=" + bAuthor + ", bPublishYear="
				+ bPublishYear + "]";
	}

//	public void printBook() {
//		System.out.println("Book ID: "+ getbId()+ ", Title:  " +getbTitle()+",  Author : "+
//							getbAuthor()+ ", Year Of Publish :"+ getbPublishYear()
//							+", ISBN # " +getbISBN());
//	}
	

}
