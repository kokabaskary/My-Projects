package com.loginFormJpaJunit.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class UsersLogin {

	@Id
	private int id;
	
	private String email;
	private String name;
	private String password;
	private String address;
	private String state;
	private String zipCode;
	
	public UsersLogin() {
		super();
	
	}

	public UsersLogin(int id, String email, String name, String password, String address, String state, String zipCode) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
		this.password = password;
		this.address = address;
		this.state = state;
		this.zipCode = zipCode;
	}
	
	 @Override
	public boolean equals(Object obj) {
		 //write the code
		 if (obj instanceof UsersLogin) {
			 UsersLogin other = (UsersLogin) obj;//casting object to UserLogin
			 boolean sameId = (this.id == other.getId());
			 boolean sameEmail = this.email.equals(other.getEmail());
			 boolean sameName = this.name.equals(other.getName());
			 boolean samePassword = this.password.equals(other.getPassword());
			 boolean sameAddress = this.address.equals(other.getAddress());
			 boolean sameState = this.state.equals(other.getState());
			 boolean sameZipcode = this.zipCode.equals(other.getZipCode());
			 //validation
			 if(sameId && sameEmail && sameName && samePassword && samePassword && sameAddress && sameState && samePassword) {
				 return true;
			 }else {
				return false;
			}
		 }else {
			return false;
		}	 
			 
		
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", name=" + name + ", password=" + password + ", address="
				+ address + ", state=" + state + ", zipCode=" + zipCode + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	
	
	
	
}
