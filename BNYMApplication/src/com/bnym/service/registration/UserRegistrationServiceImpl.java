package com.bnym.service.registration;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bnym.entity.UserRegistration;
import com.bnym.repository.UserRegistrationRepository;

@Service
@Transactional
public class UserRegistrationServiceImpl implements UserRegistrationService {
	
	@Autowired
	private UserRegistrationRepository repository;

	//first method of DAO
	@Override
	public List<UserRegistration> getAllUsers() {
		//local copy of Applicant table
				List<UserRegistration> list = new ArrayList<UserRegistration>();
				for(UserRegistration user : repository.findAll()) {
					list.add(user);
					}
				return list;
	}

	//second method of DAO
	@Override
	public UserRegistration getUserById(Long id) {
		UserRegistration user = repository.findById(id).get();
		return user;
	}

	//Third method from DAO
	@Override
	public boolean saveUser(UserRegistration user) {
		try {
			repository.save(user);
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	@Override
	public boolean deleteUserById(Long id) {
		try {
			repository.deleteById(id);
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

}
