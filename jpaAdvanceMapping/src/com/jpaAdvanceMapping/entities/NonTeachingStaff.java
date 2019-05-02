package com.jpaAdvanceMapping.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "NS")
public class NonTeachingStaff  extends Staff{
	
	private String areaExperience;

	public NonTeachingStaff() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public NonTeachingStaff(int sId, String sName, String areaExperience) {
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
