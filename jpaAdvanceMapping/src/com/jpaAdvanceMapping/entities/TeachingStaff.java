package com.jpaAdvanceMapping.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "TS")

public class TeachingStaff extends Staff {

	private String qualification;
	private String subjectExpertise;
	
	public TeachingStaff() {
		super();
		
	}
	
	public TeachingStaff(int sId, String sName, String qualification, String subjectExpertise) {
		super(sId, sName);
		this.qualification = qualification;
		this.subjectExpertise = subjectExpertise;
	}
	
	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getSubjectExpertise() {
		return subjectExpertise;
	}

	public void setSubjectExpertise(String subjectExpertise) {
		this.subjectExpertise = subjectExpertise;
	}

	
	
	
}
