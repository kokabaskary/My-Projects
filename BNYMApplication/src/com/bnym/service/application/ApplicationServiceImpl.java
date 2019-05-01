package com.bnym.service.application;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bnym.entity.Applicant;
import com.bnym.repository.ApplicantRepository;

@Service
@Transactional
public class ApplicationServiceImpl implements ApplicationService {

	
	private ApplicantRepository repository;
	
	public ApplicationServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	public ApplicationServiceImpl(ApplicantRepository repository) {
		this.repository = repository;
	}
	
	//first method of DAO
	@Override
	public List<Applicant> getAllApplications() {
		//local copy of Applicant table
		List<Applicant> list = new ArrayList<Applicant>();
		for(Applicant applicant : repository.findAll()) {
			list.add(applicant);
			}
		return list;
	}

	//second method of DAO
	@Override
	public Applicant getApplicantById(Long id) {
		Applicant applicant = repository.findById(id).get();
		return applicant;
	}

	//Third method from DAO
	@Override
	public boolean saveApplication(Applicant applicant) {
		try {
			repository.save(applicant);
			return true;
		} catch (Exception ex) {
			return false;
		}
		
	}

	//Fourth method from DAO
	@Override
	public boolean deleteApplicationById(Long id) {
		
		try {
			repository.deleteById(id);
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

}
