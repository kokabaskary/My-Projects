package com.jpaAdvanceMapping.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(referencedColumnName = "sId")
public class JoinTableNonTeachingStaff  extends StaffJoinTable{
	
	private String areaExperience;

	public JoinTableNonTeachingStaff() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public JoinTableNonTeachingStaff(int sId, String sName, String areaExperience) {
		super(sId, sName);
		this.areaExperience = areaExperience;
	}

	public String getAreaExperience() {
		return areaExperience;
	}

	public void setAreaExperience(String areaExperience) {
		this.areaExperience = areaExperience;
	}
	
	

	
	

	
	
	
	
	

}
