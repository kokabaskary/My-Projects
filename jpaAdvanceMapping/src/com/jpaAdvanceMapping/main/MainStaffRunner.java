package com.jpaAdvanceMapping.main;

import com.jpaAdvanceMapping.entities.JoinTableNonTeachingStaff;
import com.jpaAdvanceMapping.entities.JoinTableTeachingStaff;
import com.jpaAdvanceMapping.entities.NonTeachingStaff;
import com.jpaAdvanceMapping.entities.TeachingStaff;
import com.jpaAdvanceMapping.services.StaffService;
import com.jpaAdvanceMapping.services.StaffServiceImpl;

public class MainStaffRunner {

	public static void main(String[] args) {
		
		
		StaffService ss = new StaffServiceImpl();
		
		TeachingStaff tStaff = new TeachingStaff(221, "Claire", "MBA", "Java");
		ss.createSingleTableTeaching(tStaff);
		
		NonTeachingStaff nTeachingStaff = new NonTeachingStaff(234, "Brain", "Jobs");
		ss.createSingleTableNonTeaching(nTeachingStaff);
		
		JoinTableTeachingStaff jTStaff = new JoinTableTeachingStaff(342, "Alex", "Doctor", "Anatomy");
		ss.createJoinTableTeaching(jTStaff);
		
		JoinTableNonTeachingStaff jTNStaff = new JoinTableNonTeachingStaff(555, "Dil", "Comedy");
		ss.createJoinTableNonTeaching(jTNStaff);

	}

}
