package com.bnym.repository;

import org.springframework.data.repository.CrudRepository;

import com.bnym.entity.UserRegistration;

public interface UserRegistrationRepository extends CrudRepository<UserRegistration, Long> {

}
