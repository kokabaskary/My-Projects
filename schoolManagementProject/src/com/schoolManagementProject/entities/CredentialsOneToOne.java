package com.schoolManagementProject.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class CredentialsOneToOne {

	@Id
	@OneToOne
	private int eId;
	
	private String userName;
	private String password;
	
	public CredentialsOneToOne() {
		super();
	
	}
	
	public CredentialsOneToOne(int eId, String userName, String password) {
		super();
		this.eId = eId;
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
