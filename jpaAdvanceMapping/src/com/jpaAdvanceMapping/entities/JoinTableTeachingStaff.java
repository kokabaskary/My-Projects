package com.jpaAdvanceMapping.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(referencedColumnName = "sId")

public class JoinTableTeachingStaff extends StaffJoinTable {

	private String qualification;
	private String subjectExpertise;
	
	public JoinTableTeachingStaff() {
		super();
		
	}
	
	public JoinTableTeachingStaff(int sId, String sName, String qualification, String subjectExpertise) {
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
