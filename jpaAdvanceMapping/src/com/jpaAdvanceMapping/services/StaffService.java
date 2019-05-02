package com.jpaAdvanceMapping.services;

import com.jpaAdvanceMapping.entities.JoinTableNonTeachingStaff;
import com.jpaAdvanceMapping.entities.JoinTableTeachingStaff;
import com.jpaAdvanceMapping.entities.NonTeachingStaff;
import com.jpaAdvanceMapping.entities.Staff;
import com.jpaAdvanceMapping.entities.StaffJoinTable;
import com.jpaAdvanceMapping.entities.TeachingStaff;

public interface StaffService {

	public void createSingleTableTeaching(TeachingStaff newTStaff);

	public void createSingleTableNonTeaching(NonTeachingStaff newNTStaff);

	public void createJoinTableTeaching(JoinTableTeachingStaff newJoinTStaff);

	public void createJoinTableNonTeaching(JoinTableNonTeachingStaff newJoinNTStaff);

}
