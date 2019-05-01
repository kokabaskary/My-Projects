package com.bnym.service.application;

import java.util.List;

import com.bnym.entity.Applicant;

public interface ApplicationService {
	
	public List<Applicant> getAllApplications();
	public Applicant getApplicantById(Long id);
	public boolean saveApplication(Applicant applicant);
	public boolean deleteApplicationById(Long id);

}
