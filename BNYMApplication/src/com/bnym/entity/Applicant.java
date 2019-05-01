package com.bnym.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.TableGenerator;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

@Entity
public class Applicant {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@NotEmpty(message = "Applicant name can not be empty")
	@Size(max = 25, message = "Name must be less than 25 characters")
	private String sName;

	@NotEmpty(message = "Please provide the course")
	private String sCourse;

	@Pattern(message = "Please enter the correct format", regexp = "\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}")
	private String sMobile;// long is not primitive type it is an object.

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@NotNull(message = "Date of birth is required")
	@Past(message = "Birth Day cannot be in future !!!")
	private Date sDOB;
	
	@NotEmpty(message = "Please provide the Skills")
	@ElementCollection(fetch=FetchType.EAGER, targetClass=String.class)//by using ElementCollection we can have alist without a class
	private List<String> sSkills;

	@Valid @NotNull
	@OneToOne(cascade = CascadeType.PERSIST)
	private Address sAddress;
	

    public Applicant() {
    	
		// TODO Auto-generated constructor stub
	}

	public Applicant(Long id,
			@NotEmpty(message = "Applicant name can not be empty") @Size(max = 25, message = "Name must be less than 25 characters") String sName,
			@NotEmpty(message = "Please provide the course") String sCourse,
			@Pattern(message = "Please enter the correct format", regexp = "\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}") String sMobile,
			@NotNull(message = "Date of birth is required") @Past(message = "Birth Day cannot be in future !!!") Date sDOB,
			List<String> sSkills, @NotNull @Valid Address sAddress) {
		super();
		this.id = id;
		this.sName = sName;
		this.sCourse = sCourse;
		this.sMobile = sMobile;
		this.sDOB = sDOB;
		this.sSkills = sSkills;
		this.sAddress = sAddress;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsCourse() {
		return sCourse;
	}

	public void setsCourse(String sCourse) {
		this.sCourse = sCourse;
	}

	public String getsMobile() {
		return sMobile;
	}

	public void setsMobile(String sMobile) {
		this.sMobile = sMobile;
	}

	public Date getsDOB() {
		return sDOB;
	}

	public void setsDOB(Date sDOB) {
		this.sDOB = sDOB;
	}

	public List<String> getsSkills() {
		return sSkills;
	}

	public void setsSkills(List<String> sSkills) {
		this.sSkills = sSkills;
	}

	public Address getsAddress() {
		return sAddress;
	}

	public void setsAddress(Address sAddress) {
		this.sAddress = sAddress;
	}
}
