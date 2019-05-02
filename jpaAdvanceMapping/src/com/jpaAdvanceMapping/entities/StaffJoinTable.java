package com.jpaAdvanceMapping.entities;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table
@Inheritance(strategy = InheritanceType.JOINED)
public class StaffJoinTable {

	@Id
	private int sId;
	private String sName;
	
	public StaffJoinTable(int sId, String sName) {
		super();
		this.sId = sId;
		this.sName = sName;
	}
	
	public StaffJoinTable() {
		super();
		
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}
	
}
